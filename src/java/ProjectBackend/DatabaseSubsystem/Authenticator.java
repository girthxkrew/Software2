/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.DatabaseSubsystem;
/**
 *
 * @author Jose
 */
public class Authenticator {
    //Authorize Registered Users to access the system (7)
    //Check User Credentials (collaborates with Database Manager)
     public boolean checkCredentials(String username, String password){
        //probably going to need to import java security stuff and make use of a hash function.
        //fetch password that the given username has in the database
        DatabaseManager passwordFetch = new DatabaseManager();
        
        //get the password and compare it to the one provided as input
        String dbPassword = passwordFetch.databaseRequest(username, 0);
        return password.equals(dbPassword); //true if passwords match
    }
}
