package com.tb.hxd.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tb.hxd.mvc.dao.baseDao;
import com.tb.hxd.mvc.service.baseService;
import com.tb.hxd.mvc.service.expetion.ServiceExpetion;




public class baseServiceImpl implements baseService {
	@Autowired
	private baseDao dao;

	@Override
	public <T> void update(Class<T> clazz, Object t) throws ServiceExpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void insert(Class<T> clazz, T t) throws ServiceExpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> List<T> getData(Class<T> clazz, Object prams) throws ServiceExpetion {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getDataSingle(Class<T> clasz, Object param) throws ServiceExpetion {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void del(Class<T> clazz, Object prams) throws ServiceExpetion {
		// TODO Auto-generated method stub
		
	}

	

}
