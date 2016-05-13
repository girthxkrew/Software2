package Project;

import java.sql.Date;

public class TransitProposedProject extends ProposedProject {

	private Date apportionment_year;
	
	private String section_5309ID;
	
	private String tcd_amount_requested;
	
	private String Transit_Project_Type[] = {"Capital", "Operating", "Planning", "Administration"};
	
	private int tptype;
	
	public TransitProposedProject() {
		this.section_5309ID = " ";
		this.tcd_amount_requested = " ";
	}

	public Date getApportionment_year() {
		return apportionment_year;
	}

	public void setApportionment_year(Date apportionment_year) {
		this.apportionment_year = apportionment_year;
	}

	public String getSection_5309ID() {
		return section_5309ID;
	}

	public void setSection_5309ID(String section_5309id) {
		section_5309ID = section_5309id;
	}

	public String getTcd_amount_requested() {
		return tcd_amount_requested;
	}

	public void setTcd_amount_requested(String tcd_amount_requested) {
		this.tcd_amount_requested = tcd_amount_requested;
	}

	public int getTptype() {
		return tptype;
	}

	public void setTptype(int tptype) {
		this.tptype = tptype;
	}
	
	public String[] getTransitProjectType()
	{
		return Transit_Project_Type;
	}

}
