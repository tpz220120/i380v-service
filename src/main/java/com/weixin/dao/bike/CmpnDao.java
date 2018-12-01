package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.CmpnPo;

@Repository("cmpnDao")
public class CmpnDao extends BaseDao<CmpnPo>
{
  public List<CmpnPo> getCmpnList()throws Exception
  {
    return this.getSqlSession().selectList(getNameStatement() + ".getCmpnList");
  }
  
  public CmpnPo getCmpnDetail(Map<String,Object> m)throws Exception
  {
    return this.getSqlSession().selectOne(getNameStatement() + ".getCmpnDetail",m);
  }

  public String getNameStatement() {
    return "ibike.cmpn";
  }
}