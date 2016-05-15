/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.ProjectSubsystem;
import java.sql.Date;
/**
 *
 * @author Jose
 */
public class FundedProject extends Project{
    private Date date;
	
	private String tip_name;
	
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
}
