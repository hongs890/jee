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
<title>회원탈퇴</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
span.meta{width: 200px; background-color:yellow; float: left}
</style>
</head>
<body>
	<div class="box">
		<h1>회원탈퇴 페이지</h1> <br /> 
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		
		if(service.getSession().getId()==null){
			%><h1>먼저 로그인을 해주세요</h1><br/>
			<a href="<%= ctx%>/member/service/login.jsp">로그인 하시겠습니까?</a>
			<%
		}else{
			%>
			<h1>정말 탈퇴하시겠습니까?</h1><br/>
			<form action="<%=ctx %>/member/result/delete.jsp" method="post">
			
			<input type="submit" value="예">
					<input type="reset" value="아니오">
			
			</form> 
			
			<%
		}
		
		%>
		<a href="<%=ctx %>/member/member_controller.jsp"><img
			src="<%=ctx %>/img/member.png" alt="member" style="width: 30px" /></a> <a
			href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home"
			style="width: 30px" /></a>
	</div>
</body>
</html>