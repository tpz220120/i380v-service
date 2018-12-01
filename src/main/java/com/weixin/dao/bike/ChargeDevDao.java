package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargeDevPo;

@Repository("chargeDevDao")
public class ChargeDevDao extends BaseDao<ChargeDevPo> {
	/**
	 * 查找当前运营商的充电站信息
	 * 
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargeDevPo getChargeDevInfo(Map<String, Object> m) throws Exception {
		return this.getSqlSession().selectOne(
				this.getNameStatement() + ".getChargeDevInfo", m);
	}

	/**
	 * 查找是否已关联充电站
	 * 
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargeDevPo sfygl(String devno) throws Exception {
		return this.getSqlSession().selectOne(
				this.getNameStatement() + ".sfygl", devno);
	}

	public List<ChargeDevPo> getChargeDevList(Map<String, Object> m)
			throws Exception {
		return getSqlSession().selectList(
				(new StringBuilder()).append(getNameStatement())
						.append(".getChargeDevList").toString(), m);
	}

	public List<ChargeDevPo> getChargeDevByStation(Map<String, Object> m)
			throws Exception {
		return getSqlSession().selectList(
				(new StringBuilder()).append(getNameStatement())
						.append(".getChargeDevByStation").toString(), m);
	}

	public String getNameStatement() {
		return "i380v.chargeDev";
	}
}
