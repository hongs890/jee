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
		<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id != null && id.equals("hong")
				 && pw != null
				 && pw.equals("1")){
			response.sendRedirect(ctx+"/global/main.jsp");
		}else{
			application.log("ID : "+id);
			application.log("PW : "+pw);
			%>
		<h2>로그인 실패!!</h2>
		<a href="<%=ctx %>/member/service/login.jsp">다시 로그인 하시겠습니까?</a>
		<%
		application.log("리얼패스 : "+application.getContextPath());
		%>
			<%
		}
		%>
		
</div>
</body>
</html>