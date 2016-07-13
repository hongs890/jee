<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>정보 검색</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
	iframe.ifrm{border:none; width:250px; height: 250px;}
</style>
</head>
<body>
	<div class="box">
	정보 검색 <br/>
	<iframe src="image.jsp" class="ifrm"></iframe><br>
	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
</body>
</html>