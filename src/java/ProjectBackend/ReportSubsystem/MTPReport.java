/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.ReportSubsystem;
import ProjectBackend.ProjectSubsystem.*;

/**
 *
 * @author Jose
 */
public class MTPReport {
    private Project project;

    private TransitFundedProject transitinfo;

    private TransitProposedProject transitInfo;

    public MTPReport() {
       // this.project = new Project();
        this.transitinfo = new TransitFundedProject();
        this.transitInfo = new TransitProposedProject();
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TransitFundedProject getTransitinfo() {
        return transitinfo;
    }

    public void setTransitinfo(TransitFundedProject transitinfo) {
        this.transitinfo = transitinfo;
    }

    public TransitProposedProject getTransitInfo() {
        return transitInfo;
    }

    public void setTransitInfo(TransitProposedProject transitInfo) {
        this.transitInfo = transitInfo;
    }
}
