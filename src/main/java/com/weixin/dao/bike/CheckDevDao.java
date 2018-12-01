package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.BindDevPo;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository("checkDevDao")
public class CheckDevDao extends BaseDao<BindDevPo>
{
  public void insBdxx(BindDevPo bind)
    throws Exception
  {
    getSqlSession().insert(getNameStatement() + ".insBdxx", bind);
  }

  public List<BindDevPo> getBindDevList(Map<String, Object> m)
    throws Exception
  {
    return getSqlSession().selectList(getNameStatement() + ".getBindDevList", m);
  }

  public BindDevPo getBindDev(Map<String, Object> m) throws Exception {
    return (BindDevPo)getSqlSession().selectOne(getNameStatement() + ".getBindDev", m);
  }

  public BindDevPo sfBind(BindDevPo m)
    throws Exception
  {
    return (BindDevPo)getSqlSession().selectOne(getNameStatement() + ".sfBind", m);
  }

  public List<BindDevPo> getBindDevPlugList(Map<String, Object> m)
    throws Exception
  {
    return getSqlSession().selectList(getNameStatement() + ".getBindDevPlugList", m);
  }

  public String getNameStatement() {
    return "i380v.checkDev";
  }
}