<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>한빛 아카데미</title>
<link rel="stylesheet" href="<%=ctx %>/css/global.css"/>
</head>
<body>
<div id="header">
<h1>학생 관리 시스템[Student Management System]</h1>
</div>
<div id="nav">
	<ul>
		<li class="active"><a href="<%=ctx %>/member/member_controller.jsp">회원관리</a></li>
		<li><a href="<%=ctx %>/grade/main.jsp">성적관리</a></li>
		<li><a href="<%=ctx %>#">계좌관리</a></li>
		<li><a href="<%=ctx %>/global/school_info.jsp">학교소개</a></li>
	</ul>
</div>

<div id="section">
<h2>회원관리</h2>
<p>London is the capital city of England. It is the most populous city in the United Kingdom,
with a metropolitan area of over 13 million inhabitants.</p>
<p>Standing on the River Thames, London has been a major settlement for two millennia,
its history going back to its founding by the Romans, who named it Londinium.</p>
</div>

<div id="footer">
Copyright � hanbit academy
</div>
</body>
</html>