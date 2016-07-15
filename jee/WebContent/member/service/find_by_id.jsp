<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% String ctx = application.getContextPath(); %>
    <%@ page import = "member.MemberService" %>
    <%@ page import = "member.MemberServiceImpl" %>
    <%@ page import = "member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>내정보보기</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
p    {color: red;}
	#member_detail{border: 1px solid gray; width:90%; height: 400px; margin: 0 auto; border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray; height:20%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<div class="box">	
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	
	if(service.getSession().getId()==null){
		%><h1>먼저 로그인을 해주세요</h1><br/>
		<a href="<%= ctx%>/member/service/login.jsp">로그인 하시겠습니까?</a><br/><br/>
		<%
	}else{
		response.sendRedirect(ctx+"/member/result/find_by_id.jsp");
	}
	%>
		
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
</body>
</html>