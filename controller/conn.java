/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.controller;
/**
 *
 * @author Supti
 */
import java.sql.*;
public class conn {
    public Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3308/lmsproject","root","");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
