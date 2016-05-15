/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.UserSubsystem;

import ProjectBackend.ReportSubsystem.*;
import ProjectBackend.ProjectSubsystem.*;

/**
 *
 * @author Jose
 */
public abstract class User {
    //view projects (project (5))
    //view reports (reports (14))

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*I decided to have 2 methods for different reports that you want to view instead of just a 1 that returns a generic
        report class, due to the fact that fields can be lost
    */
    public MTPReport viewMTPReport(String year) {
        //CALL REPORT HERE
        return null;
    }
    
    public TIPReport viewTIPReport(String year) {
        //CALL SOME REPORT METHOD HERE
        return null;
    }

    
    /*I decided to create a method for each type of project that wants to be viewed, that way there are no fields lost with a 
        generic type
     */
    public TransitFundedProject viewTransitFundedProject(String projectID) {
        //CALL PROJECT HERE
        return null;
    }

    public SubmittedProject viewSubmittedProject(String projectID) {
        //CALL PROJECT HERE
        return null;
    }

    public ProposedProject viewProposedProject(String projectID) {
        //CALL PROJECT HERE
        return null;
    }

    public FundedProject viewFundedProject(String projectID) {
        //CALL PROJECT HERE
        return null;
    }

}
