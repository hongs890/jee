<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <% String ctx = application.getContextPath();  %>
	    <%@ page import ="member.MemberServiceImpl" %>
	    <%@ page import ="member.MemberService" %>
	    <%@ page import ="member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원탈퇴</title>
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
</style>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div id="header">
<h1>회원탈퇴 페이지</h1>
</div>
	<div style="text-align:center">
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		service.delete(service.getSession().getId());
		%>
		회원탈퇴가 완료되었습니다.
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>