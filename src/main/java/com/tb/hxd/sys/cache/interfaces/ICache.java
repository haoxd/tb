package com.tb.hxd.sys.cache.interfaces;

import java.util.Iterator;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

public abstract interface ICache {

	public abstract String getName();

	public abstract Object get(Object paramObject);

	public abstract <T> T get(Object paramObject, Class<T> paramClass);

	public abstract void put(Object paramObject1, Object paramObject2);

	public abstract void expire(Object paramObject, long paramLong);

	public abstract void remove(Object paramObject);

	public abstract void clear();

	public abstract Long ttl(Object paramObject);

	public abstract Iterator<Object> keys();

	public abstract Long size();

	public abstract CacheManager getDecoratedCacheManager();

	public abstract Cache getDecoratedCache();

}
