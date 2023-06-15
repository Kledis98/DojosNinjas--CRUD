<%--
  Created by IntelliJ IDEA.
  User: dejvi
  Date: 6/15/2023
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>New Dojo</title>
</head>
<body>
    <h1>New Dojo</h1>
    <form:form action="/dojos" method="post" modelAttribute="dojos">
      <form:label path="name">Name:  </form:label>
      <form:input path="name"/>
      <form:errors path="name"/>

      <button>Create</button>

    </form:form>
</body>
</html>
