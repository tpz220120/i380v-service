package com.weixin.dao.i380v;

import org.springframework.stereotype.Repository;

import com.weixin.dao.base.BaseDao;
import com.weixin.po.UserPo;

@Repository("userDao")
public class UserDao extends BaseDao<UserPo>{
	public UserPo findByUserno(String userno) throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".findByUserno", userno);
	}
	
    public UserPo findXxByUserno(String userno)
            throws Exception
        {
            return this.getSqlSession().selectOne(this.getNameStatement() + ".findXxByUserno", userno);
        }
	
	public String getNameStatement(){
		return "i380v.user";
	}
}
