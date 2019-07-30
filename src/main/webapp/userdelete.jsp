<%@page import="xym.nuoyan.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除用户</title>
</head>
<body>
	<form action="/user/delete" method="post">
		<table border="1" style="margin: auto">
			<tr>
				<td>用户ID：</td>
				<td><input type="text" name="userId"  value="${user.userId }"/></td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userUserName" value="${user.userUserName }"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="text" name="userPassword" value="${user.userPassword }"/></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="userTelphone" value="${user.userTelphone }"/></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="userAddress" value="${user.userAddress }"/></td>
			</tr>
			<tr>
				<td>商店名称：</td>
				<td><input type="text" name="userShopName" value="${user.userShopName }"/></td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><input type="text" name="userComment" value="${user.userComment }"/></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><input type="submit"
					value="删除" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>