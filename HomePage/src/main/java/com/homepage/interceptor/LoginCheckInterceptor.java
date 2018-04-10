package com.homepage.interceptor;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		HashMap<String,String> map = (HashMap<String,String>) session.getAttribute("login");
		
		boolean result = true;
		
		try {
			if(map == null) {
				response.sendRedirect("../loginForm");
				result = false;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
