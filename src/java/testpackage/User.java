/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

/**
 * Some class I made up to show how jsp works
 * @author Jose
 */
public class User {
    String name;
    String address;
    String id;
    
    public User(){
        
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setId (String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getId (){
        return id;
    }
}
