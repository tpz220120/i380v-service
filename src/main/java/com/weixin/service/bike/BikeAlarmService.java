package com.weixin.service.bike;

import com.weixin.dao.bike.AlarmDao;
import com.weixin.dao.bike.AlarmDetailDao;
import com.weixin.po.AlarmDetailPo;
import com.weixin.po.AlarmPo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeAlarmService
{

  @Autowired
  private AlarmDao alarmDao;

  @Autowired
  private AlarmDetailDao alarmDetailDao;

  public AlarmPo getAlarm(String id)
    throws Exception
  {
    return this.alarmDao.getAlarm(id);
  }

  public List<AlarmPo> getWclGjList(String buro) throws Exception {
    return this.alarmDao.getWclGjList(buro);
  }

  public List<AlarmPo> getYclGjList(String buro) throws Exception {
    return this.alarmDao.getYclGjList(buro);
  }

  public List<AlarmPo> getYgdGjList(String buro) throws Exception {
    return this.alarmDao.getYgdGjList(buro);
  }

  public List<AlarmDetailPo> getAlarmDetailList(String id) throws Exception {
    return this.alarmDetailDao.getAlarmDetailList(id);
  }

  public AlarmPo getHisAlarm(String id) throws Exception {
    return this.alarmDao.getHisAlarm(id);
  }

  public boolean insAlarmAll(AlarmPo p, AlarmDetailPo pDetail) throws Exception {
    try {
      this.alarmDetailDao.insert(pDetail);
      this.alarmDao.updateById(p);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }return false;
  }
}