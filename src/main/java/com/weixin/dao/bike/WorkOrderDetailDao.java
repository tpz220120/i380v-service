package com.weixin.dao.bike;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.WorkOrderDetailPo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("workOrderDetailDao")
public class WorkOrderDetailDao extends BaseDao<WorkOrderDetailPo>
{
  public List<WorkOrderDetailPo> getWorkOrderDetailList(String id)
    throws Exception
  {
    return this.getSqlSession().selectList(getNameStatement() + ".getWorkOrderDetailList", id);
  }

  public String getNameStatement() {
    return "ibike.khfwxx";
  }
}