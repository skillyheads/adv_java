<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; background-color: #f5f5f5; }
        .container { max-width: 500px; margin: 0 auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h2 { color: #333; text-align: center; margin-bottom: 30px; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; font-weight: bold; color: #555; }
        input, select { width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; box-sizing: border-box; }
        input:focus, select:focus { border-color: #007bff; outline: none; }
        .error { color: #dc3545; font-size: 14px; margin-top: 5px; }
        .btn { background-color: #007bff; color: white; padding: 12px 30px; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; width: 100%; }
        .btn:hover { background-color: #0056b3; }
        .radio-group { display: flex; gap: 15px; }
        .radio-group label { display: flex; align-items: center; font-weight: normal; }
        .radio-group input { width: auto; margin-right: 5px; }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Registration</h2>

        <form:form method="post" modelAttribute="user">
            <div class="form-group">
                <label for="username">Username:</label>
                <form:input path="username" id="username" placeholder="Enter username"/>
                <form:errors path="username" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <form:password path="password" id="password" placeholder="Enter password"/>
                <form:errors path="password" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="confirmPassword">Confirm Password:</label>
                <form:password path="confirmPassword" id="confirmPassword" placeholder="Confirm password"/>
                <form:errors path="confirmPassword" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="dateOfBirth">Date of Birth (DD-MON-YYYY):</label>
                <form:input path="dateOfBirth" id="dateOfBirth" type="date"/>
                <form:errors path="dateOfBirth" cssClass="error"/>
            </div>

            <div class="form-group">
                <label>Gender:</label>
                <div class="radio-group">
                    <label><form:radiobutton path="gender" value="Male"/> Male</label>
                    <label><form:radiobutton path="gender" value="Female"/> Female</label>
                    <label><form:radiobutton path="gender" value="Other"/> Other</label>
                </div>
                <form:errors path="gender" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="mobileNumber">Mobile Number:</label>
                <form:input path="mobileNumber" id="mobileNumber" placeholder="Enter 10-digit mobile number"/>
                <form:errors path="mobileNumber" cssClass="error"/>
            </div>

            <div class="form-group">
                <input type="submit" value="Register" class="btn"/>
            </div>
        </form:form>
    </div>
</body>
</html>