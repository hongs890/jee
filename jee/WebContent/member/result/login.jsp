<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberBean" %>
    
       <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>로그인</title>
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


</style>
</head>
<body>
<div id ="header">
</div>
<div style="text-align: center">
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		MemberBean member = new MemberBean();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id == ""|| pw == ""){
			%>
			<h2>로그인 실패!!</h2><br/>
			<a href="<%=ctx %>/member/service/login.jsp">다시 로그인 하시겠습니까?</a>
			<%
		}else{
			member.setId(id);
			member.setPw(pw);
			String name = service.login(member);
			application.log("디버깅"+name);
			if(name == ""){
				%>
				<h2>로그인 실패!!</h2><br/>
				<a href="<%=ctx %>/member/service/login.jsp">다시 로그인 하시겠습니까?</a>
				<%
				
			}else{
				response.sendRedirect(ctx+"/global/main.jsp");
			}
		}
	%>
</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>