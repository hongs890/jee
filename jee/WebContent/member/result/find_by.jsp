<%@page import="member.MemberBean"%>
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
	#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

#section {
    width:350px;
    float:left;
    padding:10px;
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}

#nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

#nav li {
    float: left;
}

#nav li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

#nav li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
#member_detail{border: 1px solid gray; width:90%; height: 400px; margin: 0 auto; border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray; height:10%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<div id ="header">
<h1>회원 검색</h1>
</div>
	<div class="box">
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	String id = request.getParameter("id");
	MemberBean member = service.findById(id);
	if(member == null){
		%>없는 아이디입니다.<br/><%
	}else{
		%>
	<table id="member_detail">
			<tr>
				<td rowspan="5" style="width:30%">
				<img src="<%=ctx%>/img/<%=member.getProfileImg()%>" alt="W3Schools.com" width="200"
			height="200"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"><%=member.getId() %></td>
			</tr>
				<tr>
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td>*******</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td><%=member.getName() %></td>
			</tr>
			
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td><%=member.getGender() %></td>
			</tr>
				<tr>
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><%=member.getEmail() %></td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%=member.getSsn().substring(0, 6) %></td>
				
			</tr>
		
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%=member.getRegDate() %></td>
						</tr>
		</table>
	
<%		
	}
	%>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
		<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>