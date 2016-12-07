<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<form action="CalculatorController" method="post">
    <p>Primary Number.        
    <input type="text" name="numberA" /></p>
     <p>Secondary Number       
    <input type="text" name="numberB" /></p>
    
    
	       
    <input type="radio" name="operation" value="Addition" /> Addition
    <input type="radio" name="operation" value="Multiplication" /> Multiplication
    <input type="radio" name="operation" value="Subtraction" /> substraction
    <input type="radio" name="operation" value="Division" /> Divide
  
    
    
	 <p>calculate.
    <input type="submit" name="submit" value="Calculate" /></p>
</form>
</body>
</html>