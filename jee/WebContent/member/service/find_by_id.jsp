<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>내정보보기</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
h1   {color: blue;}
p    {color: red;}
</style>
</head>
<body>
<div class="box">
<embed width="100%" height="100%" src="../../img/banner.png">
		<h1>내정보보기 페이지</h1><br/>
		<img src="<%=ctx %>/img/w3schools.jpg" alt="W3Schools.com" width="104" height="142"><br/>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
</body>
</html>