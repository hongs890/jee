<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	text-align: center;}
span.meta{width: 500px; background-color:yellow; float: center}
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
	
		<form action="<%=ctx %>/member/result/regist.jsp" method="post">
		
		<span class="meta">이름 </span> <input type="text" name="name"/><br/>
		<span class="meta">ID</span><input type="text" name="id"/><br/>
		<span class="meta">비밀번호</span><input type="text" name="pw"/><br/>
		<span class="meta">SSN</span><input type="text" name="ssn"><br/>
		<span class="meta">E-Mail</span><input type="text" name="email"><br/>
		<span class="meta">전공</span> 
		<input type="radio" name="major" value="computer" checked/> 컴공학부
		<input type="radio" name="major" value="mgmt"/> 경영학부
		<input type="radio" name="major" value="math"/> 수학부
		<input type="radio" name="major" value="eng"/> 영문학부<br/>
		<span class="meta">수강과목</span><br/>
		<input type="checkbox" name="subject" value="java"/> 자바
		<input type="checkbox" name="subject" value="sql"/> SQL
		<input type="checkbox" name="subject" value="cpp"/> C++
		<input type="checkbox" name="subject" value="python"/> 파이썬
		<input type="checkbox" name="subject" value="delphi"/> 델파이
		<input type="checkbox" name="subject" value="html"/> HTML<br/>
		
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
	
	</form>	
	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
</div>
<div id ="footer">
Copyright � hanbit academy
</div>
</body>
</html>