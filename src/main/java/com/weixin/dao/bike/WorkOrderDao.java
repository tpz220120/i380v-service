package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.WorkOrderPo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("workOrderDao")
public class WorkOrderDao extends BaseDao<WorkOrderPo>
{
  public WorkOrderPo getWorkOrder(String id)
    throws Exception
  {
    return this.getSqlSession().selectOne(this.getNameStatement() + ".getWorkOrder", id);
  }

  public WorkOrderPo getHisWorkOrder(String id) throws Exception {
    return this.getSqlSession().selectOne(this.getNameStatement() + ".getHisWorkOrder", id);
  }

  public List<WorkOrderPo> getWorkOrderList(String userid) throws Exception {
    return this.getSqlSession().selectList(this.getNameStatement() + ".getWorkOrderList", userid);
  }

  public List<WorkOrderPo> getWclGdList(String buro) throws Exception {
    return this.getSqlSession().selectList(this.getNameStatement() + ".getWclGdList", buro);
  }

  public List<WorkOrderPo> getYclGdList(String buro) throws Exception {
    return this.getSqlSession().selectList(this.getNameStatement() + ".getYclGdList", buro);
  }

  public List<WorkOrderPo> getYgdGdList(String buro) throws Exception {
    return this.getSqlSession().selectList(this.getNameStatement() + ".getYgdGdList", buro);
  }

  public void insHis(WorkOrderPo t) throws Exception {
    getSqlSession().insert(getNameStatement() + ".insHis", t);
  }

  public void delGd(WorkOrderPo t) throws Exception {
    getSqlSession().delete(getNameStatement() + ".delGd", t);
  }

  public String getNameStatement() {
    return "ibike.khfw";
  }
}