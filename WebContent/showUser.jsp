<%@ page language="java"  import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
 
<body>
<%-- 	用户信息<br>
	用户名：${attribute.username }<br>
	密码：${attribute.password }<br> --%>
	<%=request.getAttribute("username") %>
	
	用户信息<br>
	用户名：<%=request.getAttribute("username") %><br>
	密码：<%=request.getAttribute("password") %><br>
	现在的时间是<%= new Date() %> <br>
	<font color="red">欢迎登陆！！！</font><br>
</body>
 
</html>