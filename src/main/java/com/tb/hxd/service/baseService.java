package com.tb.hxd.service;

import java.util.List;

import javax.xml.rpc.ServiceException;

import com.tb.hxd.service.expetion.ServiceExpetion;

public abstract interface baseService {
	
	public <T> void update(Class<T> clazz,Object t) throws ServiceExpetion;
	
	public <T> void insert (Class<T> clazz,Object t) throws ServiceExpetion;
	
	public <T> List<T> getData(Class<T> clazz,Object prams) throws ServiceExpetion;
	
	
	public <T> T getDataSingle(Class<T> clasz, Object param) throws ServiceException;
	
	public <T> void del(Class<T> t ,Object prams) throws ServiceExpetion;
	

}
