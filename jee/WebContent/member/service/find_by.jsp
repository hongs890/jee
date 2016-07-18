<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>ID 검색</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
	iframe.ifrm{border:none; width:250px; height: 250px;}
	span.meta{width: 200px; background-color:yellow; float: center}
</style>
</head>
<body>
<div id ="header">
<h1>회원 검색</h1>
</div>
	<div style="text-align: center">
	
	<form action="<%=ctx %>/member/result/find_by.jsp" method="post">
	<span class="meta">검색할 ID를 입력해주세요</span><input type="text" name="id"> <br/><br/>
	<input type="submit" value="검색">
	<input type="reset" value="취소">
	</form>
	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
		<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>