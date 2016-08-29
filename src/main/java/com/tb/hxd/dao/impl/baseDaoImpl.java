package com.tb.hxd.dao.impl;

import java.util.List;


import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.tb.hxd.dao.DynamicSqlSessionDaoSupport;
import com.tb.hxd.dao.baseDao;


 
public class baseDaoImpl implements baseDao {
	
	
	@Resource(name = "dynamicSqlSessionDaoSupport")
	private DynamicSqlSessionDaoSupport dynamicSqlSessionDaoSupport;
	
	Logger log = Logger.getLogger(baseDaoImpl.class);//创建log4j实例在这个类当中
	@Override
	public <T> int update(Class<T> clasz, Object t) {
	return update("UPDATA"+clasz.getSimpleName(), t);
	}

	@Override
	public <T> int update(String sqlid, Object t) {
		return this.dynamicSqlSessionDaoSupport.getSqlSession().update(sqlid, t);

	}

	@Override
	public <T> int insert(Class<T> clazz, T t) {
		return insert("ADD"+clazz.getSimpleName(),t);
	}

	@Override
	public <T> int insert(String sqlid, T t) {
		
		return this.dynamicSqlSessionDaoSupport.getSqlSession().insert(sqlid, t);
	}

	@Override
	public <T> int del(Class<T> calzz, Object prams) {
		
		return del("DEL"+calzz.getSimpleName(),prams);
	}

	@Override
	public <T> int del(String sqlid, Object prams) {
		
		return this.dynamicSqlSessionDaoSupport.getSqlSession().delete(sqlid, prams);
	}

	@Override
	public <T> List<T> getData(Class<T> clasz, Object param) {
		return getData("QUERYALL"+clasz.getSimpleName(),param);
	}

	@Override
	public <T> List<T> getData(String sqlid, Object params) {
		return this.dynamicSqlSessionDaoSupport.getSqlSession().selectList(sqlid, params);
	}

	@Override
	public <T> T getDataSingle(String sqlid, Object prams) {
		return this.dynamicSqlSessionDaoSupport.getSqlSession().selectOne(sqlid, prams);
	}

	@Override
	public <T> T getDataSingle(Class<T> clazz, Object prams) {
		
		return getDataSingle("GETONE"+clazz.getSimpleName(), prams);
	}

	@Override
	public <T> Integer getCount(Class<T> clasz, Object param) {
		
		return this.dynamicSqlSessionDaoSupport.getSqlSession().selectOne("COUNT"+clasz.getSimpleName(),param);
	}

}
