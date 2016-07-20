<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "member.MemberService" %>
<%@ page import = "member.MemberServiceImpl" %>
<%@ page import = "member.MemberBean" %>
<jsp:include page= "../../global/top.jsp" />
<jsp:include page= "../../global/header.jsp" />
<jsp:include page= "../../global/nav.jsp" />
<div style="text-align: center">	
	<%
	MemberService service = MemberServiceImpl.getInstanceImpl();
	if(service.getSession() == null ||service.getSession().getId()==null){
	%><h1>먼저 로그인을 해주세요</h1><br/>
		<a href="<%= ctx%>/member/service/login.jsp">로그인 하시겠습니까?</a><br/><br/>
	<%
	}else{
	response.sendRedirect(ctx+"/member/result/find_by_id.jsp");
	}
	%>
	<a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
	</div>
<jsp:include page= "../../global/footer.jsp" />
<jsp:include page= "../../global/end.jsp" />
