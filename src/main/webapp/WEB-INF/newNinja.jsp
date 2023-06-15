<%--
  Created by IntelliJ IDEA.
  User: dejvi
  Date: 6/15/2023
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>New Ninja</title>
</head>
<body>
        <h1>New Ninja</h1>
        <form:form action="/ninjas" method="post" modelAttribute="ninjas">
            <form:select path="dojos">
                <c:forEach var="dojo" items="${allDojos}">
                    <option value="${dojo.id}">${dojo.name}</option>
                </c:forEach>
            </form:select>

            <form:label path="firstName">First Name:  </form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName"/>

            <form:label path="lastName">Last Name:  </form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName"/>

            <form:label path="age">Age:</form:label>
            <form:input path="age"/>
            <form:errors path="age"/>

            <button>Create</button>

        </form:form>
</body>
</html>
