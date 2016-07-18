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
	<title>로그아웃</title>
	<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div id="header">
<h1>로그아웃</h1>
</div>
<div style="text-align: center">
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	MemberBean bean = new MemberBean();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	bean.setId(id);
	bean.setPw(pw);
	service.logoutSession(bean);
	response.sendRedirect(ctx+"/index.jsp");
	%> 
	
	</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>