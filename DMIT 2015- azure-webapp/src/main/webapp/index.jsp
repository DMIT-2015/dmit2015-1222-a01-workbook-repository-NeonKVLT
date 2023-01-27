<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

Nait Moodle Website
<img src="/QrCodeImageGeneratorServlet?url=https://moodle.nait.ca&imageSize=200" alt="No Image">

<h2>QR Code Generator</h2>
<form method="post" action="/servlet">
    <div>
        <label for = "url">URL for QRCode</label>
        <input type="url" id="url" size="100">
    </div>
    <div>
        <input type="checkbox" id="download" name="download">
        <label for="download">Download QRCode Image</label>
    </div>
    <button type="submit"SHOW ME THE CODE></button>

</form>
</body>
</html>