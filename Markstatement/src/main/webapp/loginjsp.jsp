<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
    text-align: center;
    background-image: url("result.jpg");
    background-repeat: no-repeat;
    background-position: center center;
    background-attachment: fixed;
    background-size: cover;
}

h1 {
    margin-top: 100px; 
}

.center {
    margin-left: auto;
    margin-right: auto;
    margin-top: 200px; 
    display: inline-block; 
}
</style>
</head>
<body>
<form action="">
<h1>Your Result</h1>
<table border="1px" class="center">
    <tr>
        <th>Tamil</th>
        <th>English</th>
        <th>Maths</th>
        <th>Science</th>
        <th>Social</th>
        <th>Status</th>
    </tr>
    <tr>
        <td><%
            HttpSession h1 = request.getSession();
            out.print(h1.getAttribute("Tamil"));
        %></td>
        <td><%
            out.print(h1.getAttribute("English"));
        %></td>
        <td><%
            out.print(h1.getAttribute("Maths"));
        %></td>
        <td><%
            out.print(h1.getAttribute("Science"));
        %></td>
        <td><%
            out.print(h1.getAttribute("Social"));
        %></td>
        <td><%
            out.print(h1.getAttribute("Status"));
        %></td>
    </tr>
</table><br><br>
<a href="Logout">Logout</a>
</form>
</body>
</html>
