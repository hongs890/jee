<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원관리</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
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
<div id="header">
<h2>회원관리</h2>
</div>
	<div id="" style="text-align: center">
		<div style="width: 300px; margin: 0 auto; text-align: left;">
			<ol>
				<li><a href="<%=ctx %>/member/service/regist.jsp">회원가입</a></li>
				<li><a href="<%=ctx %>/member/service/find_by_id.jsp">내정보보기</a></li>
				<li><a href="<%=ctx %>/member/service/update.jsp">내정보수정</a></li>
				<li><a href="<%=ctx %>/member/service/delete.jsp">탈퇴</a></li>
				<li><a href="<%=ctx %>/member/service/login.jsp">로그인</a></li>
				<li><a href="<%=ctx %>/member/service/logout.jsp">로그아웃</a></li>
				<li><a href="<%=ctx %>/member/service/list.jsp">리스트</a></li>
				<li><a href="<%=ctx %>/member/service/find_by.jsp">검색</a></li>
				<li><a href="<%=ctx %>/member/service/count.jsp">전체 회원수</a></li>
			</ol>
		</div>
	
	</div>
	<div id="footer">
	Copyright � hanbit academy
	</div>
</body>
</html>