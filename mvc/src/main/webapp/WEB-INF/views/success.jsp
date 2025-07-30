<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Success</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; background-color: #f5f5f5; }
        .container { max-width: 500px; margin: 0 auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); text-align: center; }
        .success { color: #28a745; font-size: 18px; margin-bottom: 20px; }
        .btn { background-color: #007bff; color: white; padding: 10px 20px; border: none; border-radius: 4px; text-decoration: none; display: inline-block; }
        .btn:hover { background-color: #0056b3; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Registration Successful!</h2>
        <div class="success">
            <c:out value="${message}"/>
        </div>
        <p>Welcome, <strong><c:out value="${username}"/></strong>!</p>
        <a href="/register" class="btn">Register Another User</a>
    </div>
</body>
</html>