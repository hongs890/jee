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
	
	
	%>
	</div>
</body>
</html>