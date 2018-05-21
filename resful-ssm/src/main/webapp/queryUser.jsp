<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%
  pageContext.setAttribute("ctx",request.getContextPath());
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ctx}/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$("a[name=deleteA]").click(function(){
		var t = confirm("您确定需要删除该数据吗");
		var tid= $(this).attr("data");
		var obj = $(this);  //外部声明一下，ajax内部使用
		if(t){
			//必须保证是DELETE提交，data参数是json格式
			$.ajax({
				 type: "DELETE",
				 url: "${ctx }/user",
				 data: JSON.stringify({"tid":tid}),
			     contentType:'application/json;charset=utf-8',
			     success: function(response){
			         if(response.success){
			        	 alert(response.message);
			        	 //js吧当前行数据删除
			        	 $(obj).parent().remove(); 
			         }else{
			        	 alert(response.message);
			         }
			     },
			     error: function(response){
			       	alert(response.message);
			     }
			});
		}
	});
});
</script>

<title>显示数据</title>
</head>
<body>
	迭代数据如下：<hr/>
	<c:forEach var="x" items="${userList }">
		<div>
			${x } 
		 	<a href="javascript:void(0);" name="deleteA" data="${x.tid}">删除</a>
		</div>
	</c:forEach>
</body>
</html>