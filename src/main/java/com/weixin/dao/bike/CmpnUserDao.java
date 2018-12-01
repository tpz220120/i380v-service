package com.weixin.dao.bike;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.CmpnUserPo;

@Repository("cmpnUserDao")
public class CmpnUserDao extends BaseDao<CmpnUserPo>
{
  public CmpnUserPo getCmpnUser(CmpnUserPo m)throws Exception
  {
    return this.getSqlSession().selectOne(getNameStatement() + ".getCmpnUser",m);
  }	
	
  public void delCmpnUser(CmpnUserPo p) throws Exception{
	  this.getSqlSession().delete(this.getNameStatement() + ".delCmpnUser",p);
  }
	
  public String getNameStatement() {
    return "ibike.cmpnuser";
  }
}