package xym.nuoyan.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.entity.User;
import xym.nuoyan.service.UserService;

@WebServlet( "/user/add")
public class registerUser extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		String userUserName = req.getParameter("userUserName");
		user.setUserUserName(userUserName);
		String userPassword = req.getParameter("userPassword");
		user.setUserPassword(userPassword);
		String userTelphone = req.getParameter("userTelphone");
		user.setUserTelphone(userTelphone);
		String userAddress = req.getParameter("userAddress");
		user.setUserAddress(userAddress);
		String userShopName = req.getParameter("userShopName");
		user.setUserShopName(userShopName);
		String userComment = req.getParameter("userComment");
		user.setUserComment(userComment);
		byte userStatus = Byte.parseByte(req.getParameter("userstatus"));
		user.setUserStatus(userStatus);
		UserService us = new UserService();
		us.registeruser(user);
		resp.sendRedirect("/user/query");//重定向
	}
}
