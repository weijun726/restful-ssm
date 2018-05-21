<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
  <%
  pageContext.setAttribute("ctx",request.getContextPath());
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增数据</title>
</head>
<body>
	新增数据
	<hr/>
	<div id="show">${msg }</div>
	<form action="${ctx}/user/add" method="post">
		uname:<input type="text" name="uname" /><br/>
		birthday:<input type="text" name="birthday" value="1996-03-05" /><br/>
		money:<input type="text" name="money" /><br/>
		<input type="submit" value="注册提交" /><br/>
	</form>
	
	<br/><br/>
	RemoteHost:<%=request.getRemoteHost() %><br/>
	LocalAddr:<%=request.getLocalAddr() %><br/>
	
</body>
</html>