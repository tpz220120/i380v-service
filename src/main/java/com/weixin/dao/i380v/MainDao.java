package com.weixin.dao.i380v;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("mainDao")
public class MainDao extends SqlSessionDaoSupport{
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
	
	public List<Map<String,Object>> getDqcdjl() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getDqcdjl");
	}
	
	public List<Map<String,String>> getDqcdjl2() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getDqcdjl2");
	}
	
	public Map<String,Object> getZs() throws Exception{
		return this.getSqlSession().selectOne(this.getNameStatement() + ".getZs");
	}
	
	public List<Map<String,String>> getDqcdzList() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getDqcdzList");
	}
	
	public List<Map<String,String>> getQgCdzb() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getQgCdzb");
	}
	
	public List<Map<String,String>> getSsCdzb() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".getSsCdzb");
	}
	
	public String getNameStatement(){
		return "i380v.main";
	}
}
