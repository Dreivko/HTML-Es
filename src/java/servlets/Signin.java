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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juanf
 */
@WebServlet(name = "Signin", urlPatterns = {"/Signin"})
public class Signin extends HttpServlet {

    private static Connection conn;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "1234";
    private static String url = "jdbc:mysql://localhost:3307/HTML-Es";

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
        System.out.println("signin get .-.");
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
            System.out.println("Instant " + ex);
        } catch (IllegalAccessException ex) {
            System.out.println("Illegal " + ex);
        } catch (SQLException ex) {
            System.out.println("SQL " + ex);
        }
        Statement stmt = null;
        int id = (int) (Math.random() * 1000);
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        String valid = String.valueOf(validChars());
        int aprovePass = approvation(valid, pass);
        int aproveName = approvation(valid, name);
        int aproveUserName = approvation(valid, username);
        int aproveEmail = 0;
        
        
        for (int c = 0; c < email.length(); c++) {
            for (int i = 1; i < valid.length(); i++) {
                if (valid.charAt(i) == email.charAt(c)) {
                    aproveEmail++;
                }
            }
        }
        if(email.contains("@") && email.contains(".")){
            aproveEmail = aproveEmail + 2;
        }
        

        if ("".equals(name) || name == null) {

            request.setAttribute("message", "El Nombre no puede estar vacio");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if (name.length() != aproveName) {

            request.setAttribute("message", "El Nombre tiene caracteres invalidos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if ("".equals(username) || username == null) {

            request.setAttribute("message", "El Nombre de usuario no puede estar vacio");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if (username.length() != aproveUserName) {
            
            request.setAttribute("message", "El Nombre de usuario tiene caracteres invalidos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if ( !(email.contains("@") && email.contains(".")) ) {
                
            request.setAttribute("message", "El Email no es valido");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if ( email.length() != aproveEmail ) {
                
            request.setAttribute("message", "El Email tiene caracteres no validos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if (pass.length() < 7) {

            request.setAttribute("message", "La Constraseña Debe Tener Minimo 8 Caracteres");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else if (aprovePass != pass.length()) {

            request.setAttribute("message", "La contraseña solo puede tener letras o numeros");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
            dispatcher.forward(request, response);

        } else {
            if(userExiste(stmt,username,email)){
                request.setAttribute("message", "Nombre de usuario o el Email ya estan tomados");
                System.out.println("Paso por aqui log in false");
                //response.sendRedirect("index.jsp");
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            }else{
                try {
                    pass = encrypt(pass);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
                }
                String query = "INSERT INTO user values(" + id + ", " + '"' + name + '"' + ", " + '"' + username + '"' + "," + '"' + email + '"' + "," + '"' + pass + '"' + ");";
                    try {
                        System.out.println(query);
                        stmt = conn.createStatement();
                        stmt.executeUpdate(query);
                        request.setAttribute("message", "Registro Completado!");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                        dispatcher.forward(request, response);
                        //response.sendRedirect("index.jsp");

                    } catch (SQLException e) {
                        System.out.println("Tabla no existe o error " + e);
                    } catch (NullPointerException n) {
                        System.out.println(n);
                    }
            }
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

        conn = null;
        try {

            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Estoy conectado");

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar " + e);
        }
    }

    public char[] validChars() {
        char[] validChars = new char[63];
        validChars[0] = ' ';
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            validChars[index] = c;
            index++;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            validChars[index] = c;
            index++;
        }
        for (char c = '0'; c <= '9'; c++) {
            validChars[index] = c;
            index++;
        }

        return validChars;
    }
    
    public int approvation(String valid, String param){
        int approve = 0;
        for (int c = 0; c < param.length(); c++) {
            for (int i = 0; i < valid.length(); i++) {
                if (valid.charAt(i) == param.charAt(c)) {
                    approve++;
                }
            }
        }
        System.out.println("paso por aqui     " + approve );
        return approve;
        
    }
    
    
    public Boolean userExiste(Statement stmt, String username, String email){
        boolean exists = false;
        String query = "SELECT * FROM user where username=" + "'" + username + "'" + " OR email =" + "'" + email + "'"+ ";";
                try {
                    System.out.println(query);
                    stmt = conn.createStatement();
                    
                    if(stmt.executeQuery(query).next() == true){
                        exists = true;
                        System.out.println("Ya existe");
                    }else{
                        exists = false;
                    }

                } catch (SQLException e) {
                    System.out.println("Tabla no existe o error " + e);
                } catch (NullPointerException n) {
                    System.out.println(n);
                }
        
        
        
        
        return exists;
    
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
