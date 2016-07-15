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
span.meta{width: 200px; background-color:yellow; float: left}
#member_detail{border: 1px solid gray; width:90%; height: 400px; margin: 0 auto; border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray; height:10%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<div style="text-align: center">
<div id="header">
	<h1>정보수정 페이지</h1>
</div>
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	
	if(service.getSession().getId()==null){
		%><h1>먼저 로그인을 해주세요</h1><br/>
		<a href="<%= ctx%>/member/service/login.jsp">로그인 하시겠습니까?</a><br/><br/>
		<%
	}else{
%>
<form action ="<%=ctx %>/member/result/update.jsp" method="post">
	<table id="member_detail">
			<tr>
				<td rowspan="5" style="width:30%">
				<img src="<%=application.getContextPath()%>/img/<%=service.getSession().getProfileImg()%>" alt="W3Schools.com" width="200"
			height="200"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"><%=service.getSession().getId() %></td>
			</tr>
				<tr>
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td><input type="text" name="pw"></td>
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
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><input type="text" name="email"></td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%=service.getSession().getSsn().substring(0, 6) %></td>
				
			</tr>
		
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%=service.getSession().getRegDate() %></td>
						</tr>
		</table>

	<input type="submit" value="수정 완료">
	<input type="reset" value="취소">
	</form>

<%
	}
	%>
<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	<div id ="footer">
	Copyright � hanbit academy
	</div>
	</div>
</body>
</html>