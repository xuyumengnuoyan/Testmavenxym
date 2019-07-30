<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆jsp</title>
</head>
<body>
	<form action="/admin/login" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" placeholder="请输入用户名"/></td>
			</tr>

			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" placeholder="请输入密码" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登陆" /></td>
			</tr>
			<%
				if (request.getAttribute("LoginException") != null) {
			%>
				<tr>
				<td colspan="2"><%=String.valueOf(request.getAttribute("LoginException")) %></td>
			</tr>

			<%
				}
			%>
		</table>
	</form>
</body>
</html>