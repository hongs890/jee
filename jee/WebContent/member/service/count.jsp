<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath();  %>
<%@ page import ="member.MemberServiceImpl" %>
<%@ page import ="member.MemberService" %>
<jsp:include page= "../../global/top.jsp" />
<jsp:include page= "../../global/header.jsp" />
<jsp:include page= "../../global/nav.jsp" />
	<div style="text-align:center"> <br />
		<%
		MemberService service = MemberServiceImpl.getInstanceImpl();
		%>
		전체 회원수는 <%= service.count() %> 명 입니다.<br/>
		
		 <a href="<%=ctx %>/member/main.jsp"><img
			src="<%=ctx %>/img/member.png" alt="member" style="width: 30px" /></a> <a
			href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home"
			style="width: 30px" /></a>
	</div>
<jsp:include page= "../../global/footer.jsp" />
<jsp:include page= "../../global/end.jsp" />
