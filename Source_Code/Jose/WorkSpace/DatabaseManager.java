/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.DatabaseSubsystem;
import ProjectBackend.UserSubsystem.*;
import ProjectBackend.ReportSubsystem.Report;
import ProjectBackend.ProjectSubsystem.Project;
/**
 * Monstrous class that was sealed long ago by the heroes of light. Now that the seal has broken, it has 
 * unleashed its rage on the poor peasants of Software 2.
 * It resorted to use polymorphism to handle the different kinds of requests.
 * Now it's composed of 4 different methods to handle different requests for project, user, report, and authenticator.
 * @author Jose
 */
public class DatabaseManager {
    //Manage database-related requests (8)
    //Process request and determine appropriate handler
          /*actions: 
            0 is retrieve
            1 is update
            2 is create
            3 is delete
        */
    
    public Project databaseRequest(Project artifact, int action){
        //do stuff related to project requests
       ProjectHandler handleProject = new ProjectHandler( );
        switch(action){
            case 0:
                //retrieve a project (only needs project id to be set)
            case 1:
                //update user information (needs some fields set?)
            case 2:
                //create a user (needs all (or most) fields set)
            case 3:
                //delete a user (only needs project id to be set)
        }
        return artifact;
    }
    
    public ProjectLead databaseRequest (ProjectLead artifact, int action){
        //do stuff related to user requests
        UserHandler handleUser = new UserHandler( );
        switch(action){
            case 0:
                //retrieve a user (only needs username field to be set)
                if(artifact.getUsername() == null){
                    return null;
                }
                return handleUser.view(artifact);
            case 1:
                //update user information (needs some fields set?)
                handleUser.edit(artifact);
                return artifact;
            case 2:
                //create a user (needs all fields set, otherwise return null)
                if(artifact.getEmail() == null || artifact.getFirstName()== null || artifact.getLastName() == null 
                            || artifact.getUsername() == null ||artifact.getPassword() == null ){
                    return null;
                }
                handleUser.create(artifact);
                return artifact;
                
            case 3:
                //delete a user (only needs username field to be set)
                if (artifact.getUsername() == null) {
                    return null;
                }
                handleUser.delete(artifact);
                return artifact;
                
            default:
                System.out.println("Wrong action given.");
                return null; //should get 0 - 3
        }
        
    }
    
      public MPOStaff databaseRequest (MPOStaff artifact, int action){
        //do stuff related to user requests
        UserHandler handleUser = new UserHandler( );
        switch(action){
            case 0:
                //retrieve a user (only needs username field to be set)
                if(artifact.getUsername() == null){
                    return null;
                }
                return handleUser.view(artifact);
            case 1:
                //update user information (needs some fields set?)
                handleUser.edit(artifact);
                return artifact;
            case 2:
                //create a user (needs all fields set, otherwise return null)
                if(artifact.getEmail() == null || artifact.getFirstName()== null || artifact.getLastName() == null 
                            || artifact.getUsername() == null ||artifact.getPassword() == null ){
                    return null;
                }
                handleUser.create(artifact);
                return artifact;
                
            case 3:
                //delete a user (only needs username field to be set)
                if (artifact.getUsername() == null) {
                    return null;
                }
                handleUser.delete(artifact);
                return artifact;
                
            default:
                System.out.println("Wrong action given.");
                return null; //should get 0 - 3
        }
        
    }
      
        public MPOLeadUser databaseRequest (MPOLeadUser artifact, int action){
        //do stuff related to user requests
        UserHandler handleUser = new UserHandler( );
        switch(action){
            case 0:
                //retrieve a user (only needs username field to be set)
                if(artifact.getUsername() == null){
                    return null;
                }
                return handleUser.view(artifact);
            case 1:
                //update user information (needs some fields set?)
                handleUser.edit(artifact);
                return artifact;
            case 2:
                //create a user (needs all fields set, otherwise return null)
                if(artifact.getEmail() == null || artifact.getFirstName()== null || artifact.getLastName() == null 
                            || artifact.getUsername() == null ||artifact.getPassword() == null ){
                    return null;
                }
                handleUser.create(artifact);
                return artifact;
                
            case 3:
                //delete a user (only needs username field to be set)
                if (artifact.getUsername() == null) {
                    return null;
                }
                handleUser.delete(artifact);
                return artifact;
                
            default:
                System.out.println("Wrong action given.");
                return null; //should get 0 - 3
        }
        
    }
    
        public Admin databaseRequest (Admin artifact, int action){
        //do stuff related to user requests
        //do stuff related to user requests
        UserHandler handleUser = new UserHandler( );
        switch(action){
            case 0:
                //retrieve a user (only needs username field to be set)
                if(artifact.getUsername() == null){
                    return null;
                }
                return handleUser.view(artifact);
            case 1:
                //update user information (needs some fields set?)
                handleUser.edit(artifact);
                return artifact;
            case 2:
                //create a user (needs all fields set, otherwise return null)
                if(artifact.getFirstName()== null || artifact.getLastName() == null 
                            || artifact.getUsername() == null ||artifact.getPassword() == null ){
                    return null;
                }
                handleUser.create(artifact);
                return artifact;
                
            case 3:
                //delete a user (only needs username field to be set)
                if (artifact.getUsername() == null) {
                    return null;
                }
                handleUser.delete(artifact);
                return artifact;
                
            default:
                System.out.println("Wrong action given.");
                return null; //should get 0 - 3
        }
        
    }
        
    public Report databaseRequest (Report artifact, int action){
        //do stuff related to report requests
        ReportHandler handleReport = new ReportHandler( );
        
        if(action!= 0){
            return null; //action should just be 0
        }
        if (artifact.getReportName() == null){
            return null; //report name not set (needs to be set!)
        }
        return artifact;
        
    }
       
    public String databaseRequest (String artifact, int action){
        //this is for authenticator to use, it has special functionality to just get a password
        assert action == 0; //action should be only 0
        
        UserHandler passwordGet = new UserHandler();
        Admin dummyObject = passwordGet.view(new Admin ()); //just need to get a password out of this
        String databasePassword = dummyObject.getPassword(); //call handler to take care of this
        return databasePassword;
        
    }
}
