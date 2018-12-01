package com.weixin.dao.bike;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.BikeUserPo;

@Repository("bikeUserDao")
public class BikeUserDao extends BaseDao<BikeUserPo> {
	public BikeUserPo findByWxid(String wxid) throws Exception {
		return this.getSqlSession().selectOne(this.getNameStatement() + ".findByWxid", wxid);
	}

	public String findTokenByWxno(String wxno) throws Exception {
		return this.getSqlSession().selectOne(
				this.getNameStatement() + ".findTokenByWxno", wxno);
	}

	public void insertZfbYh(BikeUserPo po) throws Exception {
		this.getSqlSession().insert(this.getNameStatement() + ".insertZfbYh",
				po);
	}

	public void updPhoneByWxId(BikeUserPo po) throws Exception {
		this.getSqlSession().update(this.getNameStatement() + ".updPhoneByWxId", po);
	}

	public String getNameStatement() {
		return "ibike.user";
	}
}
