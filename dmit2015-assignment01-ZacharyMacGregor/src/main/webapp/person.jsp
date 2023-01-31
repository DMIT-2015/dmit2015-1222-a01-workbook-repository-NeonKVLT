<%--
  Created by IntelliJ IDEA.
  User: user2015
  Date: 2023-01-30
  Time: 6:50 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Zodiacs and Ages</title>
</head>
<body>
<div class="container">
    <h1>Your Age and Signs</h1>

    <jsp:useBean id="formBean" class="dmit2015.model.Person" scope="request">
        <jsp:setProperty name="formBean" property="*"/>
    </jsp:useBean>

    <form id="form1" method="post">

        <div class="form-group">
            <label for="firstName">First Name</label>
            <input type="text" class="form-control" id="firstName">

            <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="lastName">

            <label for="birthDate">Birth Date</label>
            <input type="number" class="form-control" id="birthDate">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

    </form>
</div>

</body>
</html>
