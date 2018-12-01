package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargeStationPo;

@Repository("chargeStationDao")
public class ChargeStationDao extends BaseDao<ChargeStationPo> {
	/**
	 * 查找当前运营商的充电站信息
	 * 
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeStationPo> getChargeStationList(Map<String, Object> m)
			throws Exception {
		return this.getSqlSession().selectList(
				this.getNameStatement() + ".getChargeStationList", m);
	}

	/**
	 * 查找已关联电站的充电信息
	 * 
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeStationPo> getGlStationList(Map<String, Object> m)
			throws Exception {
		return this.getSqlSession().selectList(
				this.getNameStatement() + ".getGlStationList", m);
	}

	/**
	 * 查找微信（不是运营商）的电站列表
	 * 
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargeStationPo> getWxStationList(Map<String, Object> m)
			throws Exception {
		return this.getSqlSession().selectList(
				this.getNameStatement() + ".getWxStationList", m);
	}

	public ChargeStationPo getInfoByPlugNo(Map<String, Object> plugno) throws Exception {
		return this.getSqlSession().selectOne(
				this.getNameStatement() + ".getInfoByPlugNo", plugno);
	}

	public ChargeStationPo getChargeStationInfo(Map<String, Object> m)
			throws Exception {
		return (ChargeStationPo) getSqlSession().selectOne(
				(new StringBuilder()).append(getNameStatement())
						.append(".getChargeStationInfo").toString(), m);
	}

	public List<ChargeStationPo> getZfbMapStationList(Map<String, Object> m)
			throws Exception {
		return getSqlSession().selectList(
				(new StringBuilder()).append(getNameStatement())
						.append(".getZfbMapStationList").toString(), m);
	}

	public String getNameStatement() {
		return "i380v.chargeStation";
	}
}
