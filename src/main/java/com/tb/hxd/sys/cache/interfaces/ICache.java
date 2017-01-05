package com.tb.hxd.sys.cache.interfaces;



public abstract interface ICache {
	
	public abstract String getName();
	
	public abstract Object get(Object paramObject);
	
	public abstract <T>  T get(Object paramObject ,Class<T> paramClass);
	


}
