package xym.nuoyan.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xym.nuoyan.entity.User;
import xym.nuoyan.service.UserService;
import xym.nuoyan.util.Stringutil;

@WebServlet("/user/query")
public class MultipleUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		UserService users = new UserService();
		List<User> list = users.MultipleUser();
		
		if (list != null) {
			request.setAttribute("xinxi", list);
			System.out.println("query");
			request.getRequestDispatcher("/UserQuery.jsp").forward(request, response);
		} else {
			request.setAttribute("MultipleException", "查询异常");
		}
	}
}
