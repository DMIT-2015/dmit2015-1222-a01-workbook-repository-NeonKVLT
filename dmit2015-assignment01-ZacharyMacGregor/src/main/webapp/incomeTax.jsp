<%--
  Created by IntelliJ IDEA.
  User: user2015
  Date: 2023-01-30
  Time: 6:52 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Income Tax Calculator</title>
</head>
<body>
<div>
    <h1>Canadian Income Tax Calculator 3000</h1>
    <jsp:useBean id="formBean" class="dmit2015.model.CanadianPersonalIncomeTax">
        <jsp:setProperty name="formBean" property="*"/>
    </jsp:useBean>

    <form id="form1" method="post">
        <div class="form-group">
            <label for="incomeTax">Income Tax Value</label>
            <input type="number" class="form-control" id="incomeTax" name="incomeTax" value="${formBean.incomeTax}"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>
