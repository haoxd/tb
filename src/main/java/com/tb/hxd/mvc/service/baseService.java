package com.tb.hxd.mvc.service;

import java.util.List;

import com.tb.hxd.mvc.service.expetion.ServiceExpetion;



public abstract interface baseService {
	
	public <T> void update(Class<T> clazz,Object t) throws ServiceExpetion;
	
	public <T> void insert (Class<T> clazz,T t) throws ServiceExpetion;
	
	public <T> List<T> getData(Class<T> clazz,Object prams) throws ServiceExpetion;
	
	
	public <T> T getDataSingle(Class<T> clasz, Object param) throws ServiceExpetion;
	
	public <T> void del(Class<T> clazz ,Object prams) throws ServiceExpetion;
	

}
