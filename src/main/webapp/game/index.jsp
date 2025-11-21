<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Doug Rattmann
  Date: 21/11/2025
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
    <link rel="stylesheet" href="https://cdn.simplecss.org/simple.min.css">
</head>
<header>
    <nav>
        <a href="${pageContext.request.contextPath}/game">Home</a>
        <a href="${pageContext.request.contextPath}/ranking">Ranking</a>
        <a href="${pageContext.request.contextPath}/login">Login</a>
        <a href="${pageContext.request.contextPath}/login">Register</a>
    </nav>
    <h1>Session Roulette</h1>
    <p>It's nothing like russian roulette. It's also lamer.</p>
</header>
<body>
<main>
<%--    <article>--%>
    <form action="${pageContext.request.contextPath}/game" method="POST">
        <input type="hidden" name="_method" value="POST">
        <h3>${question.text}</h3>
        <c:forEach var="answer" items="${question.answers}">
            <button type="submit" name="answer" value="${answer}">${answer}</button><br>
        </c:forEach>
    </form>
<%--    </article>--%>
</main>
<footer>
    <p>
        This crappy game was created by <a href="https://github.com/josep42ny">Josep Fortuny</a> and is licensed under absolutely no license.
        <br>
        <a href="https://github.com/josep42ny/trivia">Source code for this site</a>
    </p>
</footer>
</body>
</html>
