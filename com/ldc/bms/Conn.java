package com.ldc.bms;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Dkgupta@123");    
            s =c.createStatement(); 
            
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
/*  step for connection of jdbc 
 * 1. Register the  Driver
 * 2. Create Connection
 * 3. Create Statement
 * 4. Execute Query
 * 5. Close Connection 
 * */
 