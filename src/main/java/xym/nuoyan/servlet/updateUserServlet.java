package xym.nuoyan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.entity.User;
import xym.nuoyan.service.UserService;

@WebServlet("/user/update")
public class updateUserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		User user=new User();
		String  userId=request.getParameter("userId");
		user.setUserId(userId);
		String  userUserName=request.getParameter("userUserName");
		user.setUserUserName(userUserName);
		String  userPassword=request.getParameter("userPassword");
		user.setUserPassword(userPassword);
		String  userTelphone=request.getParameter("userTelphone");
		user.setUserTelphone(userTelphone);
		String  userAddress=request.getParameter("userAddress");
		user.setUserAddress(userAddress);  
		String  userShopName=request.getParameter("userShopName");
		user.setUserShopName(userShopName);
		String userComment=request.getParameter("userComment");
		user.setUserComment(userComment);
		System.out.println(user);
		if(user!=null) {
			UserService u=new UserService();
			u.update(user);
			response.sendRedirect("/user/query");//重定向
		}else {
			request.setAttribute("LoginException", "修改异常");
			request.getRequestDispatcher("/updateuser.jsp").forward(request, response);
		}
	}
}
