package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.SmsPo;
import org.springframework.stereotype.Repository;

@Repository("smsDao")
public class SmsDao extends BaseDao<SmsPo>
{
  public SmsPo findRecord(SmsPo p)
    throws Exception
  {
    return this.getSqlSession().selectOne(getNameStatement() + ".findRecord", p);
  }

  public String getNameStatement() {
    return "i380v.sms";
  }
}