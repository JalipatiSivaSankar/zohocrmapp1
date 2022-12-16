j<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
<form action="compose" method="post">
<input type="hidden" name="email" value= ${lead.email}/>


<h2> Lead | Details </h2>
First name : ${ lead.firstName}<br/>
Last name : ${ lead.lastName}<br/>
Email : ${lead.email}<br/>
Mobile : ${lead.mobile}<br/>
Source : ${lead.source}<br/>
<input type="submit" value="send email"/>
</form>
</body>
</html>