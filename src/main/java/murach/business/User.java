/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;
import java.io.Serializable;
/**
 *
 * @author Admin
 */
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    
    public User(){
        firstName="";
        lastName="";
        email="";
        
    }
    
    public User(String firstName,String lastName,String email){
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;
       
    }
    
    public String getfirstName(){
        return firstName;
    }
    
    public void setfirstName(String firstName){
        this.firstName=firstName;
        
    }
    public String getlastName(){
        return lastName;
    }
    
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}


