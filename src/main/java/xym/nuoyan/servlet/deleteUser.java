package xym.nuoyan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.service.UserService;

@WebServlet("/user/delete")
public class deleteUser extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId=req.getParameter("userId");
		UserService us=new UserService();
		us.deleteuser(userId);
		resp.sendRedirect("/user/query");//重定向
	}
}
