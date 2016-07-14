<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>series</title>
</head>
<body>
문제1<br/>
	<% 
	int i = 0,sum = 0; 
	for(; i <= 10; i ++){	
		sum += i;%>
		<% 
		if(i<10){
		%><%=i%>+<%
		}else{
			%><%=i %><%
		}
	}
	%>
	=
	<%= sum %> <br/><br/>
문제2<br/>

<table>
<%
	int j =1, k=0;
	for(; j<=9; j++){%><tr><%
		for(k=2; k<=5; k++){%><td><%
			%><%=k%>*<%=j%>=<%=j*k%>
<%
%></td><%}
		%></tr><%
	}
%>
</table>
<br/>
<table>
<%
	int l =1, m=0;
	for(; l<=9; l++){%><tr><%
		for(m=6; m<=9; m++){%><td><%
			%><%=m%>*<%=l%>=<%=l*m%>
<%
	%></td><%	}
		%><tr/><%
	}
%>
</table>
</body>
</html>