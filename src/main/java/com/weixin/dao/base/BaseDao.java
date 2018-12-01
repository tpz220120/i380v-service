package com.weixin.dao.base;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.weixin.po.BasePo;
import com.weixin.utils.base.PaginationUtils;

public abstract class BaseDao<T extends BasePo> extends SqlSessionDaoSupport{
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
	
	public void insert(T t) throws Exception{
		this.getSqlSession().insert(this.getNameStatement() + ".insert", t);
	}
	
	public T findById(int id) throws Exception {
		return this.getSqlSession().selectOne(this.getNameStatement() + ".findById", id);
	}
	
	public T findByIdOnLock(int id) throws Exception {
		return this.getSqlSession().selectOne(this.getNameStatement() + ".findByIdOnLock", id);
	}
	
	public void deleteById(int id) throws Exception {
		this.getSqlSession().delete(this.getNameStatement() + ".deleteById", id);
	}
	
	public void deleteById_logic(int id) throws Exception{
		this.getSqlSession().delete(this.getNameStatement() + ".deleteById_logic", id);
	}
	
	public void deleteByIds(int[] ids) throws Exception{
		this.getSqlSession().delete(this.getNameStatement() + ".deleteByIds", ids);
	}
	
	public List<T> findAll() throws Exception{
		return this.getSqlSession().selectList(this.getNameStatement() + ".findAll");
	}
	
	public void updateById(T t) throws Exception{
		this.getSqlSession().update(this.getNameStatement() + ".updateById", t);
	}
	
	/**
     * 公共类--获取列表里的数据
     */
    public List<T> searchByConditions(PaginationUtils paramPage){
        return this.getSqlSession().selectList(this.getNameStatement() + ".searchByConditions", paramPage);
    }
    
    public Integer searchCountByConditions(PaginationUtils paramPage) throws Exception{
        return this.getSqlSession().selectOne(this.getNameStatement() + ".searchCountByConditions", paramPage);
    }
	
	public abstract String getNameStatement();
}
