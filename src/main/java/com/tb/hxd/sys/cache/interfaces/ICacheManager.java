package com.tb.hxd.sys.cache.interfaces;

import org.springframework.cache.CacheManager;

public abstract interface ICacheManager  extends CacheManager{
	

		public  abstract ICache getICache(String paramString);
}
