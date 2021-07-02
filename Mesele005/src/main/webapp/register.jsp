<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<%@include file="components/all.jsp" %>
<div class="container">
    <form action="student-register" method="post">
        <div>
            <label for="name" class="form-label">Name</label>
            <input type="text" id="name" class="form-control" name="name">
        </div>
        <div>
            <label for="surname" class="form-label">Surname</label>
            <input type="text" id="surname" class="form-control" name="surname">
        </div>
        <div>
            <label for="birthdate" class="form-label">Birthdate</label>
            <input type="date" id="birthdate" class="form-control" name="birthdate">
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
</div>
</body>
</html>
