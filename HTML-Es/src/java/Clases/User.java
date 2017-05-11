/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juanf
 */
public class User {


    public User(int Id,String name, String username, String Password, String email) {
        this.name = name;
        this.Id= Id;
        this.username = username;
        this.email = email;
        this.Password= Password;
        this.email=email;
    }
    
    
        
    private String name;
    private String username;
    private int Id;
    private String Password;
    private String email;

    public String getName() {
        return name;
    }
    public int getId(){
        return Id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setId (int Id){
        this.Id=Id;
        
    }
    
    public void setUserName(String username){
        this.username=username;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}

    
    

