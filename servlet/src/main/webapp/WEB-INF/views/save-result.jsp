<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=${member.id}</li>
    <li>username=${member.username}</li>
    <li>age=<%=((Member)request.getAttribute("member")).getAge()%></li>
</ul>
<a href="/index.html">메인으로 가기</a>
</body>
</html>