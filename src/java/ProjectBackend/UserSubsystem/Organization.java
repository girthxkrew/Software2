/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.UserSubsystem;

/**
 *
 * @author Jose
 */
public class Organization {
    //contract (15)
    //knows contact information (setters and getters)
    private String orgName;
    private String orgEmail;

    /**
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return the orgEmail
     */
    public String getOrgEmail() {
        return orgEmail;
    }

    /**
     * @param orgEmail the orgEmail to set
     */
    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }
    
    
}
