/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jorge_000
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    private static Connection conn;
    private static String driver= "com.mysql.jdbc.Driver";
    private static String user="root";
    private static String password="1234";
    private static String url="jdbc:mysql://localhost:3307/HTML-Es";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            conect();
        } catch (InstantiationException ex) {
            System.out.println("Instant "+ex);
        } catch (IllegalAccessException ex) {
            System.out.println("Illegal "+ex);
        } catch (SQLException ex) {
            System.out.println("SQL "+ex);
        }
        
        Statement stmt = null;
        String name = request.getParameter("name");  
        String pass = request.getParameter("password");  
        
        System.out.println("\n\n\n\n\n"+name);
        System.out.println(pass);
        try {
            pass = encrypt(pass);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query = "SELECT * FROM user where (name=" + '"' + name + '"' + " OR username = "+'"'+ name +'"' + " ) AND pass =" + '"' + pass + '"' + ";";
        try {
            System.out.println(query);
            stmt = conn.createStatement();
            System.out.println(stmt.executeQuery(query).next());
            if(stmt.executeQuery(query).next() == true){  
                //HttpSession session = request.getSession();  
                //session.setAttribute("name",name);
                request.setAttribute("message", "Bienvenido," + name);
                //request.setAttribute("session", true);
                HttpSession session = request.getSession();  
                session.setAttribute("name", name);  
                System.out.println("log in " + session);
                System.out.println("Paso por aqui log in true ");
                //response.sendRedirect("Profile");
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("Profile.jsp");
                dispatcher.forward(request, response);
            
            }else{  
            
                request.setAttribute("message", "Usuario o Contraseña invalidas");
                System.out.println("Paso por aqui log in false");
                //response.sendRedirect("index.jsp");
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);  
            }
        } catch (SQLException e) {
            System.out.println("Tabla no existe o error " + e);
        } catch (NullPointerException n ){
            System.out.println(n);
        }
        
        
          
          
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void conect() throws InstantiationException, IllegalAccessException, SQLException {
		
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
    
    public String encrypt(String param) throws NoSuchAlgorithmException{
        String plaintext = param;
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(plaintext.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
        while(hashtext.length() < 32 ){
            hashtext = "0"+hashtext;
        }
        return hashtext;
    }
}
