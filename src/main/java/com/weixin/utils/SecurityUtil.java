package com.weixin.utils;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.Key;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

public class SecurityUtil {
	public static final int PASSWORD_SALT_SIZE = 8;

	public static Key loadKey(byte[] rawkey) throws Exception {
		byte[] desKey = new byte[24];
		int keylen = rawkey.length > 24 ? 24 : rawkey.length;
		System.arraycopy(rawkey, 0, desKey, 0, keylen);
		DESedeKeySpec dks = new DESedeKeySpec(desKey);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		Key key = keyFactory.generateSecret(dks);
		return key;
	}

	public static Key loadKey(String file) throws Exception {
		File keyfile = new File(file);
		DataInputStream in = new DataInputStream(new FileInputStream(keyfile));
		byte[] rawkey = new byte[(int) keyfile.length()];
		in.readFully(rawkey);
		in.close();
		return loadKey(rawkey);
	}

	public static byte[] encrypt(byte[] msg, Key key) throws Exception {
		Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return cipher.doFinal(msg);
	}

	public static byte[] decrypt(byte[] msg, Key key) throws Exception {
		Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);
		return cipher.doFinal(msg);
	}

	public static String passwordEncrypt(String passwd) {
		try {
			byte[] bsPasswd = passwd.getBytes("GBK");
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bsMD5 = md5.digest(bsPasswd);
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] bsSHa = sha.digest(bsPasswd);
			Key key = loadKey(bsMD5);
			return StringUtils.encodeBase64(encrypt(bsSHa, key));
		} catch (final Exception e) {
			//
		}

		return null;
	}

	public static String passwordEncryptEx(String userName, String passwd) {
		userName = userName.toUpperCase();
		return passwordEncrypt(userName, passwd, null);
	}

	public static String passwordEncrypt(String userName, String passwd) {
		return passwordEncrypt(userName, passwd, null);
	}

	public static boolean isEncryptPassword(String userName, String passwd,
			String encryptPassword) {
		if (encryptPassword.equals(passwordEncrypt(passwd))) {
			return true;
		}
		return encryptPassword.equals(passwordEncrypt(userName.toUpperCase(),
				passwd, encryptPassword));
	}

	private static String passwordEncrypt(String userName, String passwd,
			String salt) {
		try {
			char[] bsSalt = new char[PASSWORD_SALT_SIZE];
			if (salt == null) {
				salt = StringUtils.randomString(PASSWORD_SALT_SIZE);
			}
			int length = salt.length();
			for (int i = 0; i < PASSWORD_SALT_SIZE; i++) {
				if (i < length) {
					bsSalt[i] = salt.charAt(i);
				} else {
					bsSalt[i] = StringUtils.randomChar();
				}
			}
			String sSalt = new String(bsSalt);
			byte[] bsPasswd = (userName + ":" + passwd + ":" + sSalt)
					.getBytes("UTF-8");
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bsMD5 = md5.digest(bsPasswd);
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] bsSHa = sha.digest(bsPasswd);
			Key key = loadKey(bsMD5);
			return sSalt + StringUtils.encodeBase64(encrypt(bsSHa, key));
		} catch (final Exception e) {
			//
		}

		return null;
	}
}
