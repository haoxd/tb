package com.tb.hxd.mvc.dao;

import java.io.Serializable;
import java.util.List;

public abstract interface baseDao {
	

	
	/**
	 * update 方法
	 * @param bean
	 * @return
	 */
	public abstract <T> int update(Class<T> clasz, Object t);
	
	
	/**
	 * 更具sqlid
	 * @param sqlid
	 * @param t
	 * @return
	 */
	public  abstract <T> int update(String sqlid,Object t);
	
	
	
	/**新增一个实体
	 * @param clazz
	 * @param t
	 * @return
	 */
	public abstract <T> int insert(Class<T> clazz,T t);
	
	/**
	 * @param sqlid
	 * @param t
	 * @return
	 */
	public abstract <T> int insert(String sqlid,T t);
	
	
	/**
	 * @param calzz
	 * @param prams
	 * @return
	 */
	public abstract <T> int del (Class<T> calzz,Object prams);
	
	public abstract <T> int del(String sqlid,Object prams);
	
	/**
	 * 按一定条件获取T类型的数据
	 * 
	 * @param params
	 * @return
	 * @throws DaoException
	 */
	public abstract <T> List<T> getData(Class<T> clasz, Object param);
	
	
	/**更具sqlid获取T类型数据
	 * @param sqlid
	 * @param params
	 * @return
	 */
	public abstract <T> List<T> getData(String sqlid,Object params);
	
	
	/**获取单条数据
	 * @param sqlid
	 * @param prams
	 * @return
	 */
	public <T> T getDataSingle(String sqlid,Object prams);
	
	public <T> T getDataSingle(Class<T> clazz,Object prams);
	
	
	/**
	 * 通过sqlid获取总数
	 * 
	 * @param sqlid
	 * @param param
	 * @return
	 */
	public <T> Integer getCount(Class<T> clasz, Object param);

	
	
	
	

}
