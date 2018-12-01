package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.RedPktAccountFlowPo;

@Repository("redPktFlowDao")
public class RedPktFlowDao extends BaseDao<RedPktAccountFlowPo>
{
  public List<RedPktAccountFlowPo> getRedPktFlowList(Map<String,Object> m)throws Exception
  {
    return this.getSqlSession().selectList(getNameStatement() + ".getRedPktFlowList", m);
  }
  

  public String getNameStatement() {
    return "ibike.redpktFlow";
  }
}