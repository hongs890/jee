<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %>
    <%@ page import = "member.MemberServiceImpl" %>
    <%@ page import = "member.MemberService" %>
    <%@ page import = "member.MemberBean" %>
    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>내 정보 수정</title>
	<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
</head>
<body>
	<div class="box">
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	MemberBean member = new MemberBean();
	String pw = request.getParameter("pw");
		member.setPw(pw);
		service.update(member);
		%>
		<h1>회원정보 수정에 성공하였습니다.</h1><br/>
		
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
		<%
	
	%>
	</div>
</body>
</html>