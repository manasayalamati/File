<%-- 
    Document   : index
    Created on : Aug 20, 2017, 12:00:47 PM
    Author     : yalam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
  
<s:form action="register">  
<s:textfield name="name" label="UserName"></s:textfield>  
<s:password name="password" label="Password"></s:password>  
<s:textfield name="email" label="Email"></s:textfield>  
<s:textfield name="gender" label="Gender"></s:textfield>  
<s:textfield name="country"label="Country"></s:textfield>  
  
<s:submit value="register"></s:submit>  
  
</s:form> 
    </body>
</html>
