<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有的数据</title>
</head>
<body>
	查询所有的数据<hr/>
	<c:forEach var="x" items="${userList}">
		<div>${x}
			<a href="update?tid=${x.tid }">修改</a>&nbsp;&nbsp;
			<a href="delete?tid=${x.tid }">删除</a>
		</div>
	</c:forEach>
</body>
</html>