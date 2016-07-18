<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>전체회원 조회</title>

<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}

p{text-align: center;}
</style>
</head>
<body>
<div id="header">
<h1>목록보기</h1>
</div>
<div style="text-align: center">
	
	<table>
	  <tr>
    <td>ID</td>
    <td>이름</td>
    <td>등록일</td>
    <td>생년월일</td>
  </tr>
  <tr>
    <td>hong</td>
    <td><a href="detail.jsp">홍길동</a></td>
    <td>2016-07-03</td>
    <td>901001</td>
  </tr>
    <tr>
    <td>lee</td>
    <td><a href="detail.jsp">이순신</a></td>
    <td>2016-07-03</td>
    <td>031001</td>
  </tr>
    <tr>
    <td>song</td>
    <td><a href="detail.jsp">송지효</a></td>
    <td>2016-07-03</td>
    <td>991001</td>
  </tr>
    <tr>
    <td>park</td>
    <td><a href="detail.jsp">박지성</a></td>
    <td>2016-07-03</td>
    <td>061001</td>
  </tr>
    <tr>
    <td>kim</td>
    <td><a href="detail.jsp">김유신</a></td>
    <td>2016-07-03</td>
    <td>951001</td>
  </tr>
</table>
	
	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
	<div id="footer">
		Copyright � hanbit academy
	</div>
</body>
</html>