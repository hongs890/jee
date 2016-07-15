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
</style>
</head>
<body>
<div class="box">
	
		<%

		MemberService service = MemberServiceImpl.getInstanceImpl();
		MemberBean member = new MemberBean();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String ssn = request.getParameter("ssn");
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setSsn(ssn);
		member.setRegDate();
		name = service.regist(member);
		out.print(name);
		if(name == ""){
			%>아이디가 이미 사용중입니다 <a href="<%=ctx%>/member/service/regist.jsp">다른 아이디로 가입하시겠습니까?</a><%
		}else{
			
			%>
			<span class="meta">이름 </span><%=name %><br/>
			<span class="meta">ID</span><%=id%><br/>
			<span class="meta">비밀번호</span><%=pw%><br/>
			<span class="meta">SSN</span><%=ssn%><br/>
			<span class="meta">전공</span><%=request.getParameter("major") %><br/>
			<span class="meta">수강과목</span> 
			<%
		String[] subjects = request.getParameterValues("subject");
		if(subjects != null){
			for(int i=0; i<subjects.length; i++){
		%>
				<%= subjects[i] %><br/>
		<%
			}
		}
		%>
		회원가입을 축하드립니다. <%=request.getParameter("name") %> 님!<%
		}
		%>		

	<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
		
</div>
</body>
</html>