package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.AlarmPo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("alarmDao")
public class AlarmDao extends BaseDao<AlarmPo>
{
  public AlarmPo getAlarm(String id)
    throws Exception
  {
    return this.getSqlSession().selectOne(getNameStatement() + ".getAlarm", id);
  }

  public AlarmPo getHisAlarm(String id) throws Exception {
    return this.getSqlSession().selectOne(getNameStatement() + ".getHisAlarm", id);
  }

  public List<AlarmPo> getWclGjList(String buro) throws Exception {
    return this.getSqlSession().selectList(getNameStatement() + ".getWclGjList", buro);
  }

  public List<AlarmPo> getYclGjList(String buro) throws Exception {
    return this.getSqlSession().selectList(getNameStatement() + ".getYclGjList", buro);
  }

  public List<AlarmPo> getYgdGjList(String buro) throws Exception {
    return this.getSqlSession().selectList(getNameStatement() + ".getYgdGjList", buro);
  }

  public String getNameStatement() {
    return "ibike.alarm";
  }
}