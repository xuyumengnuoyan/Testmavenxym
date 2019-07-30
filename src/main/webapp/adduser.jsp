<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册用户</title>
</head>
<body>
	<form action="/user/add" method="post">
		<table border="1" style="margin: auto">
			
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userUserName""/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="text" name="userPassword""/></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="userTelphone" "/></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="userAddress""/></td>
			</tr>
			<tr>
				<td>商店名称：</td>
				<td><input type="text" name="userShopName""/></td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><input type="text" name="userComment" "/></td>
			</tr>
			<tr>
				<td>状态：</td>
				<td><select name="userstatus" style="width: 100%;">
				<option  ></option>
				<option value="0">不可用</option>
				<option value="1">可用</option>
				
				</select></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><input type="submit"
					value="确认注册" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>