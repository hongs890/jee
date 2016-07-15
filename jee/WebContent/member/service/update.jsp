<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <% String ctx = application.getContextPath(); %>
        <%@ page import = "member.MemberServiceImpl" %>
        <%@ page import = "member.MemberService" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>정보수정</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
span.meta{width: 200px; background-color:yellow; float: left}
</style>
</head>
<body>
<div class="box">
	<h1>정보수정 페이지</h1> <br/>
	
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	
	if(service.getSession().getId()==null){
		%><h1>먼저 로그인을 해주세요</h1><br/>
		<a href="<%= ctx%>/member/service/login.jsp">로그인 하시겠습니까?</a>
		<%
	}else{
%>
	<form action ="<%=ctx %>/member/result/update.jsp" method="post">
	<span class="meta">수정할 비밀번호</span><input type="text" name="pw"><br/>
	<input type="submit" value="수정 완료">
	<input type="reset" value="취소">
	</form>
	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
<%
	}
	%>

	</div>
</body>
</html>