/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.DatabaseSubsystem;

import java.beans.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
/**
 *
 * @author Jose
 */
public class AlarmHandler {
    public static Date getDeadline(String projectID){
		Connection conn = requestConnection("admin");
		// create a java calendar instance
		Calendar calendar = new GregorianCalendar(2013,0,31);
		java.util.Date date = calendar.getTime();

		Statement viewStmt;
		String sql = "SELECT submission_deadline FROM cs4311team9sp16.PROPOSEDPROJECT where ProjectID='"+ projectID+"';";
		
		try{
		viewStmt = conn.createStatement();
		ResultSet resultVerify = viewStmt.execute(sql);
		date = resultVerify.getDate(0);
		
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return (Date) date;
		}
		
		return (Date) date;
	}
	
	public static String getEmail(String projectID){
		Connection conn = requestConnection("admin");
		String email="Email not found";

		Statement viewStmt;
		String sql = "SELECT email FROM cs4311team9sp16.Users where project_lead_id = (SELECT pro_lead_id FROM cs4311team9sp16.PROPOSEDPROJECT where ProjectID='"+ projectID+"');";
		
		try{
		viewStmt = conn.createStatement();
		ResultSet resultVerify = viewStmt.execute(sql);
		email = resultVerify.getString(0);
		
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return email;
		}
		
		return email;
	}
}
