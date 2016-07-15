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
h1   {color: blue;}
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
		<h1>회원정보보기 페이지</h1>
			<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		MemberBean member = new MemberBean();
		
		%>
		<table id="member_detail">
			<tr>
				<td rowspan="3" style="width:30%">
				<img src="<%=application.getContextPath()%>/img/james.jpg" alt="W3Schools.com" width="204"
			height="242"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"><%=service.getSession().getId() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td><%=service.getSession().getName() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td><%=service.getSession().getGender() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%=service.getSession().getSsn() %></td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%=service.getSession().getRegDate() %></td>
						</tr>
		</table>
		
		
		<br/> 
	
		
		
		
		
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
</body>
</html>