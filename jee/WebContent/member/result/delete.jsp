<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <% String ctx = application.getContextPath();  %>
	    <%@ page import ="member.MemberServiceImpl" %>
	    <%@ page import ="member.MemberService" %>
	    <%@ page import ="member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원탈퇴</title>

<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div class="header">
<h1>회원탈퇴 페이지</h1>
</div>
	<div style="text-align:center">
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		service.delete(service.getSession().getId());
		response.sendRedirect(ctx+"index.jsp");
		%>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
	<div class="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>