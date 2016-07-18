<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>성적관리</title>
	<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div class="header">
<h1>성적 관리</h1>
</div>
<div style="text-align: center">
	<div style="width: 300px; margin:0 auto; text-align: left">
	<ol>
	<li><a href="<%=ctx%>">추가</a></li>
	<li><a href="<%=ctx%>">수정</a></li>
	<li><a href="<%=ctx%>">삭제</a></li>
	<li><a href="<%=ctx%>">전체조회</a></li>
	<li><a href="<%=ctx%>">학점을 포함한 시험내역 조회 (SEQ)</a></li>
	<li><a href="<%=ctx%>">시퀀스 조회 (ID)</a></li>
	<li><a href="<%=ctx%>">응시생수 (시험일자별)</a></li>
	</ol>
	</div>
	<p>
			<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
		</p>
		
	</div>
	<div class="footer">
		Copyright � hanbit academy
	</div>
</body>
</html>