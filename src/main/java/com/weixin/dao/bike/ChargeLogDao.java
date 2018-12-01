package com.weixin.dao.bike;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargePlugPo;

@Repository("chargeLogDao")
public class ChargeLogDao extends BaseDao<ChargePlugPo>{
	/**
	 * @return
	 * @throws Exception
	 */
	public void insLogInfo(Map<String,Object> m) throws Exception{
		this.getSqlSession().insert(this.getNameStatement() + ".insLogInfo", m);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void insZfbLogInfo(Map<String,Object> m) throws Exception{
		this.getSqlSession().insert(this.getNameStatement() + ".insZfbLogInfo", m);
	}
	
	public String getNameStatement(){
		return "i380v.chargeLog";
	}
}
