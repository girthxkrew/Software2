/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.UserSubsystem;

import ProjectBackend.DatabaseSubsystem.Authenticator;

/**
 *
 * @author Jose
 */
public abstract class RegisteredUser extends User{
    private String userName;
    private String email;
    private String password;
    private String userType; //might not get used...
    private Organization organization; //will need to call Organization object to get this
    
    
    //log-in (authenticator)
    
    //public contracts (3) (collaborates with organization)
    //knows account information (just setters and getters)
    
    private boolean userLogIn(String username, String password){
        Authenticator logIn = new Authenticator();
        boolean success = logIn.checkCredentials(username, password);
        return success;
    }

    /**
     * @return the userName
     */
    public String getUsername() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUsername(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
