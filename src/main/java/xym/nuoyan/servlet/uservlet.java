package xym.nuoyan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.entity.User;
import xym.nuoyan.service.UserService;
import xym.nuoyan.util.Stringutil;

@WebServlet("/admin/login")
public class uservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		UserService users=new UserService();
		User user=users.Login(name, password);
		if(user!=null) {//ֱ直接判断user是否为空，不为空则用户名或者密码正确
			System.out.println("____________"+req.getContextPath());
				resp.sendRedirect("/user/query");//重定向
			
		}else {
			req.setAttribute("LoginException", "用户名或者密码错误");
			req.getRequestDispatcher("/Login.jsp").forward(req, resp);
		}
		
	}
}
