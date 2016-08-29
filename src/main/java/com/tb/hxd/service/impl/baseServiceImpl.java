package com.tb.hxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.tb.hxd.dao.baseDao;
import com.tb.hxd.service.baseService;
import com.tb.hxd.service.expetion.ServiceExpetion;

public class baseServiceImpl implements baseService {
	@Autowired
	private baseDao dao;

	@Override
	public <T> void update(Class<T> clazz, Object t) throws ServiceExpetion {
		try {
			this.dao.update(clazz, t);
		} catch (Exception e) {
			throw new ServiceExpetion(e.getMessage());
		}
	}

	@Override
	public <T> void insert(Class<T> clazz, T t) throws ServiceExpetion {
		try {
			this.dao.insert(clazz, t);
		} catch (Exception e) {
		throw new ServiceExpetion(e.getMessage());
		}

	}

	@Override
	public <T> List<T> getData(Class<T> clazz, Object prams) throws ServiceExpetion {
		
		return this.dao.getData(clazz, prams);
	}

	@Override
	public <T> T getDataSingle(Class<T> clasz, Object param) throws ServiceExpetion {
		
		return this.dao.getDataSingle(clasz, param);
	}

	@Override
	public <T> void del(Class<T> clazz, Object prams) throws ServiceExpetion {
		try {
			this.dao.del(clazz, prams);
		} catch (Exception e) {
			throw new ServiceExpetion(e.getMessage());
		}
	}

}
