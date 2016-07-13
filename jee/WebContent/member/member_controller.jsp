<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원관리</title>
<link rel="stylesheet" href="../css/member.css" />
<style>
div.memberClass {
	font-size: 20;
}
</style>
</head>
<body>
	<div id="" class="memberClass box">
		<h1 style="text-align: center;">회원관리</h1>
		<div style="width: 300px; margin: 0 auto; text-align: left;">
			<ol>
				<li><a href="service/regist.jsp">회원가입</a></li>
				<li><a href="service/find_by_id.jsp">내정보보기</a></li>
				<li><a href="service/update.jsp">내정보수정(비번)</a></li>
				<li><a href="service/delete.jsp">탈퇴</a></li>
				<li><a href="service/login.jsp">로그인</a></li>
				<li><a href="service/list.jsp">리스트</a></li>
				<li><a href="service/find_by.jsp">검색(이름)</a></li>
				<li><a href="service/count.jsp">전체 회원수</a></li>
			</ol>
		</div>
		<p>
			<a href="../index.jsp"><img src="../img/home.png" alt="home"
				style="width: 30px" /></a>
		</p>
	</div>
</body>
</html>