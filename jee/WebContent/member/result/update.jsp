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
	
	<div id="header">
	회원정보 변경 페이지
	</div>
	<div style="text-align : center">
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	MemberBean member = service.findById(request.getParameter("id"));
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
		member.setPw(pw);
		member.setEmail(email);
		service.update(member);
		response.sendRedirect(ctx+"/member/result/find_by_id.jsp");
		%>
		<h1>회원정보 수정에 성공하였습니다.</h1><br/>
		
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
		<%
		
	
	%>
	</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>