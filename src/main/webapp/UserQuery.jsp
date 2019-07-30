<%@page import="xym.nuoyan.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="xym.nuoyan.util.Stringutil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户查询</title>
</head>
<body>
	<form action="/user/query" method="post">
		<table border="1" style="margin: auto">
			<tr>
				<td><input type="submit" value="查询" /></td>
				<td><a type="button" href="/adduser.jsp">注册</a></td>
			</tr>

		</table>
		<table border="1" style="margin: auto">
			<tr>
				<td>用户ID</td>
				<td>用户姓名</td>
				<td>用户电话</td>
				<td>用户地址</td>
				<td>商店名</td>
				<td>用户描述</td>
				<td>用户状态</td>
				<td colspan="2">操作</td>
			</tr>
			<c:forEach items="${xinxi}" var="xx">
				<tr>
					<td>${xx.userId }</td>
					<td>${xx.userUserName }</td>
					<td>${xx.userTelphone }</td>
					<td>${xx.userAddress }</td>
					<td>${xx.userShopName }</td>
					<td>${xx.userComment }</td>
					<td>${xx.userStatus }</td>
					<td><a href="/user/findID1?userId=${xx.userId }">删除</a></td>
					<td><a href="/user/findID?userId=${xx.userId }">修改</a></td>
					</tr>
			</c:forEach>

		</table>
	</form>
</body>
</html>