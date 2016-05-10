package Project;

public class SubmittedProject extends Project{
	private String tpb_approval;
	
	private String federal_approval;
	
	private String state_approval;
	
	private String submission_status;
	
	public SubmittedProject()
	{
		this.tpb_approval = " ";
		this.federal_approval = " ";
		this.state_approval = " ";
		this.submission_status = " ";

	}

	public String getTpb_approval() {
		return tpb_approval;
	}

	public void setTpb_approval(String tpb_approval) {
		this.tpb_approval = tpb_approval;
	}

	public String getFederal_approval() {
		return federal_approval;
	}

	public void setFederal_approval(String federal_approval) {
		this.federal_approval = federal_approval;
	}

	public String getState_approval() {
		return state_approval;
	}

	public void setState_approval(String state_approval) {
		this.state_approval = state_approval;
	}

	public String getSubmission_status() {
		return submission_status;
	}

	public void setSubmission_status(String submission_status) {
		this.submission_status = submission_status;
	}
}
