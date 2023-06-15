<%--
  Created by IntelliJ IDEA.
  User: dejvi
  Date: 6/16/2023
  Time: 12:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">    <meta charset="UTF-8">
    <title>Details</title>
</head>
<body>
      <h1> <c:out value="${dojos.name}"/></h1>

      <table class="table table-striped table-bordered">
          <thead>
          <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Age</th>
          </tr>
          </thead>
          <tbody>
          <c:forEach items="${dojos.ninjas}" var="ninja">
              <tr>
                  <td><c:out value="${ninja.firstName}"/></td>
                  <td><c:out value="${ninja.lastName}"/></td>
                  <td><c:out value="${ninja.age}"/></td>


              </tr>
          </c:forEach>
          </tbody>
      </table>
</body>
</html>
