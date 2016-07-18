<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String nctx = application.getContextPath(); %>
<div id="nav">
	<ul>
		<li><a href="<%=nctx %>/member/main.jsp">회원관리</a></li>
		<li><a href="<%=nctx %>/grade/main.jsp">성적관리</a></li>
		<li><a href="<%=nctx %>/bank/main.jsp">계좌관리</a></li>
		<li><a href="school_info.jsp">학교소개</a></li>
	</ul>
</div>