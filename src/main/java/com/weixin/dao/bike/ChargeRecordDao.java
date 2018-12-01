package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargeDevPo;
import com.weixin.po.ChargeRecordPo;

@Repository("chargeRecordDao")
public class ChargeRecordDao extends BaseDao<ChargeRecordPo>{
	/**
	 * 查找当前充电插座的工况
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargeRecordPo getChargeRecord(String cdczno) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".getChargeRecord", cdczno);
	}
	
	/**
	 * 查找当前充电插座的工况列表
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeRecordPo> getChargeRecordList(Map<String,Object> m) throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getChargeRecordList", m);
	}
	
	/**
	 * 查找历史充电插座的工况列表
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeRecordPo> getHisChargeRecordList(Map<String,Object> m) throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getHisChargeRecordList", m);
	}
	
	/**
	 * 根据当前充电记录id查找充电详细信息
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargeRecordPo getDqChargeRecord(String id) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".getDqChargeRecord", id);
	}
	
	/**
	 * 查找当前充电记录简略列表
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeRecordPo> getDqcdList(String wxid) throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getDqcdList", wxid);
	}
	
	public String getNameStatement(){
		return "ibike.chargeRecord";
	}
}
