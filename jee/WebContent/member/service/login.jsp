<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>로그인</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
</head>
<body>
<div class="box">
		<form action="<%=ctx %>/member/result/login.jsp" method="post">
			<span class="meta">ID</span><input type="text" name="id"/><br/>
			<span class="meta">비밀번호</span><input type="password" name="pw"/><br/><br/>
			
			<input type="submit" value="로그인" />
		</form> 
				<form action="<%=ctx %>/member/member_controller.jsp">
					<input type="submit" value="뒤로가기 " method="post" />
				</form>


</div>
</body>
</html>