<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
	<div style="text-align: center">
		<div style="width: 300px; margin: 0 auto; text-align: left;">
			<ol>
				<li><a href="<%=ctx %>/grade/service/regist.jsp">등록</a></li>
				<li><a href="<%=ctx %>/grade/service/update.jsp">수정</a></li>
				<li><a href="<%=ctx %>/grade/service/uelete.jsp">삭제</a></li>
				<li><a href="<%=ctx %>/grade/service/list.jsp">목록</a></li>
				<li><a href="<%=ctx %>/grade/service/count.jsp">카운트</a></li>
				<li><a href="<%=ctx %>/grade/service/search.jsp">검색</a></li>
			</ol>
		</div>
	<a href="<%=ctx %>/global/main.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width:30px" /></a>
</div>