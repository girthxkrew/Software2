/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.ProjectSubsystem;
import java.io.File;
import java.sql.Date;

/**
 *
 * @author Jose
 */
public class Question {
    private boolean answer;
	private int numberofcrossing;
	private String supporting_answer;
	private Date date;
	private File fileAttachment;
	
	public Question() {
		this.answer = false;
		this.numberofcrossing = 0;
		this.supporting_answer = " ";
	}

	public int getNumberofcrossing() {
		return numberofcrossing;
	}

	public void setNumberofcrossing(int numberofcrossing) {
		this.numberofcrossing = numberofcrossing;
	}

	public String getSupporting_answer() {
		return supporting_answer;
	}

	public void setSupporting_answer(String supporting_answer) {
		this.supporting_answer = supporting_answer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public File getFileAttachment() {
		return fileAttachment;
	}

	public void setFileAttachment(File fileAttachment) {
		this.fileAttachment = fileAttachment;
	}

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
}
