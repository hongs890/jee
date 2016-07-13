<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
<link rel="stylesheet" href="../../css/member.css"/>
<style type="text/css">
div.box {border: 5px solid powderblue;
	margin: 0 auto;
	width: 600px;
	text-align: left;}
span.meta{width: 200px; background-color:yellow; float: left}
div.joinDiv{border:0px width: 50%; margin: 10px 50px 10px 50px}
</style>
</head>
<body>
<div class="box">
	
		<form action="" method="get">
		
		<span class="meta">이름 </span> <input type="text" name="name"/><br/>
		<span class="meta">ID</span><input type="text" name="id"/><br/>
		<span class="meta">비밀번호</span><input type="text" name="pw"/><br/>
		<span class="meta">SSN</span><input type="text" name="ssn"><br/>
		<span class="meta">통신사</span> 
			<input type="checkbox" name="SKT" value="skt"/> SKT
			<input type="checkbox" name="KT" value="kt"/> KT
			<input type="checkbox" name="LGU" value="lgu"/> LGU+<br/>
		<span class="meta">성별</span>
			<input type="radio" name="gender" value="male"/> 남
			<input type="radio" name="gender" value="female"/> 여 <br/>
		<center>
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
		</center>
	</form>
		<center>
	<a href="../member_controller.jsp"><img src="../../img/member.png" alt="member" style="width:30px" /></a>
	<a href="../../index.jsp"><img src="../../img/home.png" alt="home" style="width:30px" /></a>
		</center>
</div>
</body>
</html>