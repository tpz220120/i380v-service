package com.weixin.dao.bike;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.ChargePlugPo;

@Repository("chargePlugDao")
public class ChargePlugDao extends BaseDao<ChargePlugPo>{
	/**
	 * 根据充电插座编号查找相关信息
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargePlugPo getChargePlugInfo(String plugno) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".getChargePlugInfo", plugno);
	}
	
	/**
	 * 根据充电插座编号和单位查找相关信息
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargePlugPo getChargePlugInfo2(Map<String,String> m) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".getChargePlugInfo2", m);
	}
	
	/**
	 * 是否免支付
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public ChargePlugPo sfmzf(String plugno) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".sfmzf", plugno);
	}
	
	/**
	 * 根据充电插座编号查找插座列表
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<ChargePlugPo> getChargePlugList(String cdzno) throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getChargePlugList", cdzno);
	}
	
	/**
	 * 插入调试表数据
	 * @param plugid,opertor,debugResult
	 * @return
	 * @throws Exception
	 */
	public void insDebugInfo(Map<String,Object> m) throws Exception{
		this.getSqlSession().insert(this.getNameStatement() + ".insDebugInfo", m);
	}
	
	/**
	 * 根据充电插座编号查找插座列表
	 * @param plugno
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,String>> getPlugDebugList(String subburo) throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getPlugDebugList", subburo);
	}
	
	public String getNameStatement(){
		return "i380v.chargePlug";
	}
}
