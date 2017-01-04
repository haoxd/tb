package com.tb.hxd.sys.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author acer11
 *  作者：haoxd
* 创建时间：2017年1月4日 下午2:17:32  
* 项目名称：tb  
* @author daniel  
* @version 1.0   
* @since JDK 1.6.0_21  
* 文件名称：jspFilter.java  
* 类说明：配置jsp过滤器，禁止直接访问目录下的jsp文件
 */
public class jspFilter implements Filter{
	
	public jspFilter(){
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		 HttpServletRequest httpServletRequest = (HttpServletRequest)request;
	        String url = httpServletRequest.getRequestURI();//获取请求url
	        if(url != null && url.toLowerCase().endsWith(".jsp"))
	            ((HttpServletResponse)response).sendRedirect((new StringBuilder()).append(httpServletRequest.getContextPath()).append("/other/error/404.html").toString());
	        chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
