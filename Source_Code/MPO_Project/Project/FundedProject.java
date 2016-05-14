package Project;

import java.sql.Date;

public class FundedProject extends Project{

	private Date date;
	
	private String tip_name;
	
	private String cn;
	
	private String csj;
	
	private Date tip_year;
	
	public FundedProject()
	{
		this.tip_name = " ";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTip_name() {
		return tip_name;
	}

	public void setTip_name(String tip_name) {
		this.tip_name = tip_name;
	}

	public Date getTip_year() {
		return tip_year;
	}

	public void setTip_year(Date tip_year) {
		this.tip_year = tip_year;
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
	
}
