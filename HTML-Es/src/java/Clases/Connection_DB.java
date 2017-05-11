/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jorge_000
 */
public class Connection_DB {
    private static java.sql.Connection conn;
    private static String driver= "com.mysql.jdbc.Driver";
    private static String user="root";
    private static String password="1234";
    private static String url="jdbc:mysql://localhost:3307/HTML-Es";
    private static Statement stmt = null;
    
    public static void conect() throws InstantiationException, IllegalAccessException, SQLException {
		
        conn=null;
	try{
	
            Class.forName(driver);
            conn= DriverManager.getConnection(url, user,password);
            if(conn != null){
		System.out.println("Estoy conectado");

            }
	
	}catch(ClassNotFoundException | SQLException e) { 
            System.out.println("error al conectar " + e);
	}
    }
    
    public static String insertUser(Connection con, int id, String name, String username, String email, String pass){
            
            return "INSERT INTO user values(" + id + ", " + '"' + name + '"' + ", " + '"' + username + '"' + "," + '"' + email + '"' + "," + '"' + pass + '"' +");";
             
        }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        Connection_DB.stmt = stmt;
    }
    
    
}
