<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <% String ctx = application.getContextPath(); %>
        <%@ page import = "member.MemberService" %>
        <%@ page import = "member.MemberServiceImpl" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>정보 검색</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
	iframe.ifrm{border:none; width:250px; height: 250px;}
	span.meta{width: 200px; background-color:yellow; float: left}
</style>
</head>
<body>
	<div class="box">
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	String id = request.getParameter("id");
	
		System.out.print(service.findById(id));
	if(service.list() == null){
		%>없는 아이디입니다.<%
	}else{
		%>
	<span class="meta">ID</span><%=service.findById(id).getId() %><br/>
	<span class="meta">PW</span><%=service.findById(id).getPw() %><br/>
	<span class="meta">이름</span><%=service.findById(id).getName() %><br/>
	<span class="meta">성별</span><%=service.findById(id).getGender() %><br/>
	<span class="meta">생년월일</span><%=service.findById(id).getSsn().substring(0, 6) %><br/>
	<span class="meta">등록일</span><%=service.findById(id).getRegDate() %><br/>
<%		
	}
	%>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
</body>
</html>