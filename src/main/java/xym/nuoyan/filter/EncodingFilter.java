package xym.nuoyan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{
	private String encoding;
	@Override
	public void destroy() {
		
		
	}
	/**
	 * 过滤方法
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		System.out.println("他来了他来了，他迈着矫健的步伐走来了");
		chain.doFilter(request, response);
		System.out.println("我走了");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		encoding=config.getInitParameter("encoding");
		
		
	}

}
