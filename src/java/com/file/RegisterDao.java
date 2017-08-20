/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;

/**
 *
 * @author yalam
 */
import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://javastrutslogin.cij7b4gpzzdo.us-east-1.rds.amazonaws.com:3306/strutslogin","root","batch2017");  
  
PreparedStatement ps=con.prepareStatement("insert into strutslogin(name,password,email,gender,country)" + "values(?,?,?,?,?)");  
ps.setString(1,r.getName());  
ps.setString(2,r.getPassword());  
ps.setString(3,r.getEmail());  
ps.setString(4,r.getGender());  
ps.setString(5,r.getCountry());  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
