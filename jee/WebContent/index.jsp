<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>한빛 아카데미</title>
	<link rel="stylesheet" href="css/member.css" />
</head>
<body>
		<div class="header">
<h1>학생 관리 시스템[Student Management System]</h1>
</div>

<div class="nav" style="text-align: center">
<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다.</h2>
	<a href="<%=ctx%>/member/service/regist.jsp">회원가입 하러 가기</a><br/>
	<a href="<%=ctx%>/member/service/login.jsp">로그인 하러 가기</a><br/>
	<a href="<%=ctx%>/global/main.jsp">메인화면 바로가기(test)</a>
</div>



<div class="footer">
Copyright � hanbit academy
</div>
</body>
</html>