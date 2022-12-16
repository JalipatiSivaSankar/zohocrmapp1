<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create lead</title>
</head>
<h2>Lead | create</h2>
<hr>
<form action="save" method="post">
<pre>
FirstName<input type="text" name="firstName"/>
LastName<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="Mobile"/>
Source
<select name="source">
    <option value="radio">radio</option>
    <option value="newspaper">newspaper</option>
    <option value="trade show">trade show</option>
    <option value="web-site">web-site</option>
    </select>
    <input type="submit" value="save"/>
</pre>
</form>
<body>

</body>
</html>