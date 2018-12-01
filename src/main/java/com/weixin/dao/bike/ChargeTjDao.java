package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargeTjPo;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository("chargeTjDao")
public class ChargeTjDao extends BaseDao<ChargeTjPo>
{
  public List<ChargeTjPo> getYssj(Map<String, Object> m)
    throws Exception
  {
    return getSqlSession().selectList(getNameStatement() + ".getYssj", m);
  }

  public String getNameStatement() {
    return "i380v.chargeTj";
  }
}