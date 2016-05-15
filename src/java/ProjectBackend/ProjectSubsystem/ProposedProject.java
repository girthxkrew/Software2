/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.ProjectSubsystem;
import java.sql.Date;
import java.util.Calendar;
/**
 *
 * @author Jose
 */
public class ProposedProject extends Project{
    private String approved_project_id;
	
	private String Readiness_Elements[] =  {
		"Schematic", "Environmental", "Document", "ROW_Map", 
		"ROW", "Utilities", "PSandE", "Public", "Involvement", 
		"District_Review", "Agreement", "Procurement", "Process", 
		"Let_Date", "Performance_End", "Date", "Construction", 
		"Execution", "Active", "Contract", "Delivery", "Other"
	};
	
	private int element;
	
	private Date submission_deadline;
	
	private String Submission_Type[] = {"New_Submission", "Revision_Approved"};
	
	private int submission_status;
	
	private String WorkFlow_Status[] = {"Under_Preparation", "Under_Review", "Ready_For_Submission", "Modification_Required", "Submitted_to_TPB"};
	
	private int workflow_status;
	
	private String cn;
	
	private String csj;
	
	private String mpo_id;
	
	private final int numOfQuestions = 36;
	
	private Question[] Questions;
	
	private String pro_lead_id;
	
	public ProposedProject()
	{
		this.approved_project_id = " ";
		this.cn = " ";
		this.csj = " ";
		this.mpo_id = " ";
		this.Questions = new Question[numOfQuestions];
		this.element = 0;
		this.submission_status = 0;
		this.workflow_status = 0;
		this.pro_lead_id = " ";
                this.submission_deadline = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	}

	public String getApproved_project_id() {
		return approved_project_id;
	}

	public void setApproved_project_id(String approved_project_id) {
		this.approved_project_id = approved_project_id;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Date getSubmission_deadline() {
		return submission_deadline;
	}

	public void setSubmission_deadline(Date submission_deadline) {
		this.submission_deadline = submission_deadline;
	}

	public int getSubmission_status() {
		return submission_status;
	}

	public void setSubmission_status(int submission_status) {
		this.submission_status = submission_status;
	}

	public int getWorkflow_status() {
		return workflow_status;
	}

	public void setWorkflow_status(int workflow_status) {
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
	
	public String[] getReadinessElements()
	{
		return Readiness_Elements;
	}
	
	public String[] getSubmissionType()
	{
		return Submission_Type;
	}
	
	public String[] getWorkFlowStatus()
	{
		return WorkFlow_Status;
	}

	public String getPro_lead_id() {
		return pro_lead_id;
	}

	public void setPro_lead_id(String pro_lead_id) {
		this.pro_lead_id = pro_lead_id;
	}
}
