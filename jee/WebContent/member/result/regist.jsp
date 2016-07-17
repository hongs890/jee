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
	<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style type="text/css">
div.box {border: 5px solid powderblue;
	margin: 0 auto;
	width: 600px;
	text-align: left;}
span.meta{width: 200px; background-color:yellow; float: left}
div.joinDiv{border:0px width: 50%; margin: 10px 50px 10px 50px}
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
<h1>회원가입 페이지</h1>
</div>
<div style="text-align: center">
	
		<%

		MemberService service = MemberServiceImpl.getInstanceImpl();
		MemberBean member = new MemberBean();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String ssn = request.getParameter("ssn");
		String email = request.getParameter("email");
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setSsn(ssn);
		member.setEmail(email);
		member.setRegDate();
		name = service.regist(member);
		if(name == ""){
			%>아이디가 이미 사용중입니다 <br/><br/><br/>
			
			<a href="<%=ctx%>/member/service/regist.jsp">다른 아이디로 가입하시겠습니까?</a><%
		}else{
			
			%>
			<span class="meta">이름 </span><%=name %><br/>
			<span class="meta">ID</span><%=id%><br/>
			<span class="meta">비밀번호</span><%=pw%><br/>
			<span class="meta">SSN</span><%=ssn%><br/>
			<span class="meta">E-mail</span><%=email%><br/>
			<span class="meta">전공</span><%=request.getParameter("major") %><br/>
			<span class="meta">수강과목</span> 
			<%
		String[] subjects = request.getParameterValues("subject");
		if(subjects != null){
			for(int i=0; i<subjects.length; i++){
		%>
				<%= subjects[i] %><br/><br/>
		<%
			}
		}
		%>
		회원가입을 축하드립니다. <%=request.getParameter("name") %> 님!<%
		}
		%>	<br/>	

	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
		
</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>