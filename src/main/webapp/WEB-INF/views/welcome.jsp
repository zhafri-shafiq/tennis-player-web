<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>
<h2>Welcome to the tennis player database!</h2>
<h3>Player name: <i>${name}</i></h3>
<%
System.out.println("Hello from JSP");
%>
<%@page import="java.time.LocalDate"%>
<%
LocalDate currentDate = LocalDate.now();
%>
<p>Current Date: <%= currentDate %> </p>
<p>Today is <%= currentDate.getDayOfWeek() %> </p>
</body>
</html>