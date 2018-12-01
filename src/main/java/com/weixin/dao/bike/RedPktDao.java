package com.weixin.dao.bike;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.RedPktAccountPo;

@Repository("redPktDao")
public class RedPktDao extends BaseDao<RedPktAccountPo>
{
  public RedPktAccountPo getRedPktAccount(Map<String,Object> m)throws Exception
  {
    return this.getSqlSession().selectOne(getNameStatement() + ".getRedPkt_Account",m);
  }
  
  public void updateAccountById(RedPktAccountPo p)throws Exception{
	  this.getSqlSession().update(getNameStatement() + ".updateAccountById",p);
  }

  public String getNameStatement() {
    return "ibike.redpkt";
  }
}