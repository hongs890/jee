<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>로그인</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
</head>
<body>
<div class ="header">
<h1>로그인</h1>
</div>
<div style="text-align: center">
		<form action="<%=ctx %>/member/result/login.jsp" method="post">
			<span class="meta">ID</span><input type="text" name="id"/><br/>
			<span class="meta">비밀번호</span><input type="password" name="pw"/><br/><br/>
			
			<input type="submit" value="로그인" />
			<input type="reset" value="취소">
		</form> <br/>
<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
</div>
<div class ="footer">
	Copyright � hanbit academy
</div>
</body>
</html>