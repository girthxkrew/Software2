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
public class TransitFundedProject extends FundedProject{
    private String tdc_award_amount;
	
	private Date tdc_award_date;
	
	public TransitFundedProject() {
		this.tdc_award_amount = " ";
	}

	public String getTdc_award_amount() {
		return tdc_award_amount;
	}

	public void setTdc_award_amount(String tdc_award_amount) {
		this.tdc_award_amount = tdc_award_amount;
	}

	public Date getTdc_award_date() {
		return tdc_award_date;
	}

	public void setTdc_award_date(Date tdc_award_date) {
		this.tdc_award_date = tdc_award_date;
	}
}
