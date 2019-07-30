package xym.nuoyan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.entity.User;
import xym.nuoyan.service.UserService;

@WebServlet("/user/findID")
public class UserFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String userId = req.getParameter("userId");
		UserService userService = new UserService();
		try {
			User user = userService.queryById(userId);
			req.setAttribute("user",user);
			req.getRequestDispatcher("/updateuser.jsp").forward(req, resp);
		}catch (Exception e) {
			
		}
	}
}
