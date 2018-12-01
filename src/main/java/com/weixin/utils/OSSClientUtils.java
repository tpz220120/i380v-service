package com.weixin.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OSSClientUtils
{

  @Value("#{configProperties['oss.access_id']}")
  private String ACCESS_ID;

  @Value("#{configProperties['oss.access_key']}")
  private String ACCESS_KEY;

  @Value("#{configProperties['oss.bucketName']}")
  private String bucketName;

  @Value("#{configProperties['oss.end_point']}")
  private String END_POINT;
  private static final String contentType = "image/";

  public String uploadFile(String folderName, InputStream inputStream, String ofileName)
    throws Exception
  {
    String newFileName = folderName + "/" + String.valueOf(System.currentTimeMillis()) + ofileName.substring(ofileName.lastIndexOf("."));

    OSSClient client = new OSSClient(this.END_POINT, this.ACCESS_ID, this.ACCESS_KEY);

    uploadFile(client, this.bucketName, newFileName, inputStream, "image/");

    return generateFilePath(this.bucketName, newFileName);
  }

  public String uploadFileByBytes(String folderName, ByteArrayInputStream inputStream)
    throws Exception
  {
    String newFileName = folderName + "/" + String.valueOf(System.currentTimeMillis());

    OSSClient client = new OSSClient(this.END_POINT, this.ACCESS_ID, this.ACCESS_KEY);
    ObjectMetadata objectMeta = new ObjectMetadata();

    objectMeta.setContentType("image/");
    client.putObject(this.bucketName, newFileName, inputStream, objectMeta);
    client.shutdown();
    return generateFilePath(this.bucketName, newFileName);
  }

  private void uploadFile(OSSClient client, String bucketName, String newFileName, InputStream inputStream, String contentType)
    throws Exception
  {
    ObjectMetadata objectMeta = new ObjectMetadata();

    objectMeta.setContentType(contentType);
    client.putObject(bucketName, newFileName, inputStream, objectMeta);
  }

  private String generateFilePath(String bucketName, String fileName) {
    return "http://" + bucketName + ".oss.aliyuncs.com/" + fileName;
  }
}