

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>jsp练习</title>
</head>
<body>

<table border="1">
    <%for(int i=1;i<=10;i++){ %>
    <thead>
    <%for(int j=1;j<=10;j++){ %>
    <th><%=i+"许文杰" %></th>
    <%} %>
    </thead>
    <%} %>
</table>

<table>
    <tr><th>编号</th><th>型号</th></tr>
    <%for(int i=1;i<=10;i++){ %>
    <tr>
        <th><%=i %></th>
        <th><%=i+"许文杰" %></th>
    </tr>
    <%} %>
</table>
</body>
</html>