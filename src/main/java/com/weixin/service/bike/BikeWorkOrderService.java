package com.weixin.service.bike;

import com.weixin.dao.bike.*;
import com.weixin.po.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeWorkOrderService
{
	@Autowired
	private WorkOrderDao workOrderDao;
	@Autowired
    private ChargeRecordDao chargeRecordDao;
	@Autowired
    private WorkOrderDetailDao workOrderDetailDao;
    
    public WorkOrderPo getWorkOrder(String id)
        throws Exception
    {
        return workOrderDao.getWorkOrder(id);
    }

    public List<WorkOrderPo> getWorkOrderList(String userid)
        throws Exception
    {
        return workOrderDao.getWorkOrderList(userid);
    }

    public List<WorkOrderPo> getWclGdList(String buro)
        throws Exception
    {
        return workOrderDao.getWclGdList(buro);
    }

    public List<WorkOrderPo> getYclGdList(String buro)
        throws Exception
    {
        return workOrderDao.getYclGdList(buro);
    }

    public List<WorkOrderPo> getYgdGdList(String buro)
        throws Exception
    {
        return workOrderDao.getYgdGdList(buro);
    }

    public List<WorkOrderDetailPo> getWorkOrderDetailList(String id)
        throws Exception
    {
        return workOrderDetailDao.getWorkOrderDetailList(id);
    }

    public WorkOrderPo getHisWorkOrder(String id)
        throws Exception
    {
        return workOrderDao.getHisWorkOrder(id);
    }

    public boolean insWorkOrder(WorkOrderPo p)
        throws Exception
    {
        try
        {
            workOrderDao.insert(p);
            if("10".equals(p.getCsworkorderType()))
            {
                ChargeRecordPo rep = new ChargeRecordPo();
                rep.setRecordId(p.getChargeRecordId());
                rep.setOrderId(p.getCsworkorderId());
                chargeRecordDao.updateById(rep);
            }
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insWorkOrderAll(WorkOrderPo p, WorkOrderDetailPo pDetail)
        throws Exception
    {
        try
        {
            workOrderDao.updateById(p);
            workOrderDetailDao.insert(pDetail);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insGd(WorkOrderPo p)
        throws Exception
    {
        try
        {
            workOrderDao.insHis(p);
            workOrderDao.delGd(p);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
