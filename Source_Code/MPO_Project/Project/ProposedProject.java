package Project;

import java.sql.Date;

public class ProposedProject extends Project{

	private String approved_project_id;
	
	private enum Readiness_Elements {
		Schematic, Environmental, Document, ROW_Map, 
		ROW, Utilities, PSandE, Public, Involvement, 
		District_Review, Agreement, Procurement, Process, 
		Let_Date, Performance_End, Date, Construction, 
		Execution, Active, Contract, Delivery, Other
	};
	
	private Readiness_Elements element;
	
	private Date submission_deadline;
	
	private enum Submission_Type {New_Submission, Revision_Approved};
	
	private Submission_Type submission_status;
	
	private enum WorkFlow_Status {Under_Preparation, Under_Review, Ready_For_Submission, Modification_Required, Submitted_to_TPB};
	
	private WorkFlow_Status workflow_status;
	
	private String cn;
	
	private String csj;
	
	private String mpo_id;
	
	private final int numOfQuestions = 36;
	
	private Question[] Questions;
	
	public ProposedProject()
	{
		this.approved_project_id = " ";
		this.cn = " ";
		this.csj = " ";
		this.mpo_id = " ";
		this.Questions = new Question[numOfQuestions];
	}

	public String getApproved_project_id() {
		return approved_project_id;
	}

	public void setApproved_project_id(String approved_project_id) {
		this.approved_project_id = approved_project_id;
	}

	public Readiness_Elements getElement() {
		return element;
	}

	public void setElement(Readiness_Elements element) {
		this.element = element;
	}

	public Date getSubmission_deadline() {
		return submission_deadline;
	}

	public void setSubmission_deadline(Date submission_deadline) {
		this.submission_deadline = submission_deadline;
	}

	public Submission_Type getSubmission_status() {
		return submission_status;
	}

	public void setSubmission_status(Submission_Type submission_status) {
		this.submission_status = submission_status;
	}

	public WorkFlow_Status getWorkflow_status() {
		return workflow_status;
	}

	public void setWorkflow_status(WorkFlow_Status workflow_status) {
		this.workflow_status = workflow_status;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getCsj() {
		return csj;
	}

	public void setCsj(String csj) {
		this.csj = csj;
	}

	public String getMpo_id() {
		return mpo_id;
	}

	public void setMpo_id(String mpo_id) {
		this.mpo_id = mpo_id;
	}

	public Question[] getQuestions() {
		return Questions;
	}

	public void setQuestions(Question[] questions) {
		Questions = questions;
	}
	
	
	
	
}
