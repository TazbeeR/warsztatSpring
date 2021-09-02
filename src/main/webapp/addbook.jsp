<%--
  Created by IntelliJ IDEA.
  User: tazbeer
  Date: 26.08.2021
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/books/addbook" method="post">
    <input type="text" name="isbn" placeholder="isbn">
    <input type="text" name="title" placeholder="tytuł">
    <input type="text" name="author" placeholder="autor">
    <input type="text" name="publisher" placeholder="wydawca">
    <input type="text" name="type" placeholder="gatunek">
    <input type="submit" value="Dodaj książkę">
</form>
</body>
</html>
