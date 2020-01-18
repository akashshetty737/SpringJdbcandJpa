<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Student</title>
</head>
<body>
<form action="modifyStudent.do" method="POST">
Id of student to be updated: <input type="text" name="rollNumber"> <br/>
New Student name : <input type="text" name="studentName"><br/>
New Student Score : <input type="text" name="studentScore"><br/>
<input type = "submit" value="Submit !">  

</body>
</html>