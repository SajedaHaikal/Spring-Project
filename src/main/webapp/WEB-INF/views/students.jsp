<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
    <h2>Students List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Course</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="new">Add New Student</a>
</body>
</html>
