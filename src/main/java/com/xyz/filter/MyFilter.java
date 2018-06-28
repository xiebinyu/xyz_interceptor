package com.xyz.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

  @Override
  public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
    System.out.println("filter init");
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    // do something 处理request 或response
    System.out.println("filter start");
    servletRequest.setAttribute("key1", "filter");
    // 调用filter链中的下一个filter
    filterChain.doFilter(servletRequest,servletResponse);
    System.out.println("filter end");
  }

  @Override
  public void destroy() {
    System.out.println("filter destroy");
  }
}