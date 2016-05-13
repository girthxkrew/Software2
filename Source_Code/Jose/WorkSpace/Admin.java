/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.UserSubsystem;
import ProjectBackend.DatabaseSubsystem.Authenticator;
import ProjectBackend.DatabaseSubsystem.DatabaseManager;
/**
 *
 * @author Jose
 */
public class Admin extends User {

    //knows account information (setters and getters)
    //log-in (authenticator)
    //create user (Registered user (3))
    //edit user (same)
    //delete user (same)
    private String userName;
    private String password;
    
    /*Just get the input from the user and delegate the process to authenticator*/
    private boolean adminLogIn(String username, String password){
        ///call authenticator!
        Authenticator logIn = new Authenticator();
        boolean success = logIn.checkCredentials(username, password);
        return success;
    }
    
    /*Determine the type of user that needs to be created & return and empty object of that user*/
    private RegisteredUser typeOfUser(String userType){
        switch(userType){
            case "mpo staff":
                MPOStaff mpoStaff= new MPOStaff();
                return mpoStaff;
                
            case "project lead":
                ProjectLead projectLead = new ProjectLead();
                return projectLead;
                
            case "mpo lead":
                MPOLeadUser mpoLead = new MPOLeadUser();
                return mpoLead;
                
            default:
                System.out.println("What");
                return null; //we got some bogus type
        }
    }
     
    /*fills an empty user object with all its attributes based on user input*/
     private void createUser(RegisteredUser user,String firstName, 
                                    String lastName, String userName, String password, String email){
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(userName);
        user.setPassword(password);
        user.setEmail(email);
    }
     
     /*takes a new user object with set attributes to be entered into the database*/
     private boolean pushToDB(RegisteredUser user){
         //call the database manager with number 2 to insert this new user into the database
        DatabaseManager userPush = new DatabaseManager();
        
         return true;
     }
    
     /*removes a user from the database (needs username to be set)!*/
     private boolean deleteFromDB(RegisteredUser user){
         //call database manager with number 3
         return true;
     }
     
     /*kind of like create user. Need to have some attribute sets in order for effects to take change*/
     private boolean editUser(RegisteredUser user){
         //call the database manager with number 1
         return true;
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
