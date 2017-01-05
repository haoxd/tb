package com.tb.hxd.sys.cache;



import com.tb.hxd.sys.cache.interfaces.ICache;
import com.tb.hxd.sys.cache.interfaces.ICacheManager;

/**
 * @author acer11
 *  作者：hxd
* 创建时间：2017年1月5日 上午10:54:23  
* 项目名称：tb  
* @author daniel  
* @version 1.0   
* @since JDK 1.6.0_21  
* 文件名称：CacheManager.java  
* 类说明：缓存管理器，基于单例实现
 */
public abstract class CacheManager {
 
	 private static ICacheManager cacheManagers;
	 
	 public static void setCacheManager(ICacheManager cacheManager){
		 
		 cacheManager=cacheManagers;
	 }

	 public static ICacheManager getICacheManager(){
		 return cacheManagers;
	 }
	 
	 public static ICache getCache(String name){
		 return cacheManagers.getICache(name);
	 }
}
