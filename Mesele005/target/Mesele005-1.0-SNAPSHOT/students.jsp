<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<%@include file="components/all.jsp" %>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Surname</th>
            <th scope="col">Birthdate</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.getName()}</td>
                <td>${student.getSurname()}</td>
                <td>${student.getBirthdate()}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
