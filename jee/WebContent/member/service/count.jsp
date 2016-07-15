<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <% String ctx = application.getContextPath();  %>
	    <%@ page import ="member.MemberServiceImpl" %>
	    <%@ page import ="member.MemberService" %>
	    
	    <!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원수</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
	<div class="box">
		 <br />
		
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		%>
		전체 회원수는 <%= service.count() %> 명 입니다.<br/>
		
		 <a href="<%=ctx %>/member/member_controller.jsp"><img
			src="<%=ctx %>/img/member.png" alt="member" style="width: 30px" /></a> <a
			href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home"
			style="width: 30px" /></a>
	</div>
</body>
</html>