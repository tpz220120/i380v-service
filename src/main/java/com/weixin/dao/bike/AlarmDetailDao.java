package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.AlarmDetailPo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("alarmDetailDao")
public class AlarmDetailDao extends BaseDao<AlarmDetailPo>
{
  public List<AlarmDetailPo> getAlarmDetailList(String id)
    throws Exception
  {
    return this.getSqlSession().selectList(getNameStatement() + ".getAlarmDetailList", id);
  }

  public String getNameStatement() {
    return "ibike.alarmmx";
  }
}