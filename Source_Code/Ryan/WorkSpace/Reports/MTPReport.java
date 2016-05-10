package Reports;

import Project.Project;
import Project.TransitFundedProject;
import Project.TransitProposedProject;

public class MTPReport extends Report {
	
	private Project project;
	
	private TransitFundedProject transitinfo;
	
	private TransitProposedProject transitInfo;

	public MTPReport() {
		this.project = new Project();
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
