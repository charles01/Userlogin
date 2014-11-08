<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body >

<div id="header">
	<ul>
	 	<li><a href=#>Home</a></li>
	 	<li><a href=#>Product</a></li>
	 	<li><a href=#>Careers</a></li>
	 	<li><a href=#>About Us</a></li>
	 	<li><a href=#>Contact Us</a></li>
	</ul>
</div>


<img class="normal" src="welcom.jpg" width="32" height="16">

<img class="logo" src="jiit.png" width="200px" height="80px">
<div id="content" >
<s:form action="login">
<center><h3>Login</h3></center>
<s:textfield name="username" label="UserName"/>
<s:password name="password" label="Password"/>
<s:submit value="Login"/>
</s:form>
</div>

</body>
</html>