/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.DatabaseSubsystem;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ProjectBackend.ProjectSubsystem.*;

/**
 *
 * @author Jose
 */
public class ProjectHandler extends Handler{
    	private Connection conn;
	
	public ProjectHandler ()
	{
		
	}

	public boolean create(ProposedProject projectObject)
	{
		conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Projects VALUES ('"
				+ projectObject.getAir_quality_analysis_co() +"', '"
				+ projectObject.getAir_quality_analysis_nox() +"', '"
				+ projectObject.getAir_quality_analysis_voc() +"', "
				+ projectObject.getArea() + ", "
				+ projectObject.isCapacity_project() + ", "
				+ projectObject.getCity() + ", "
				+ projectObject.getCounty()+ ", "
				+ projectObject.getDistrict() + ", '"
				+ projectObject.getFederal_fiscal_year() + "', "
				+ projectObject.getClassification() + ", "
				+ projectObject.getFund_type() + ", '"
				+ projectObject.getNameOfHighwayorRoadway() + "', '"
				+ projectObject.getNetwork_Year() + "', "
				+ projectObject.getNumber_of_existing_lanes() + ", "
				+ projectObject.getNumber_of_miles() + ", "
				+ projectObject.getNumber_of_project_lanes() + ", '"
				+ projectObject.getProject_description() + "', '"
				+ projectObject.getProject_id() + "', "
				+ projectObject.getIdentity() + ", "
				+ projectObject.getPhases() + ", "
				+ projectObject.getType() + ", '"
				+ projectObject.getRemarks() + "', '"
				+ projectObject.getScope_of_work() + "', '"
				+ projectObject.getSponsoring_agency() + "', "
				+ projectObject.getState_system() + ", '"
				+ projectObject.getProject_name() + "', "
				+ projectObject.getLimitFrom().getLatitude() + ", "
				+ projectObject.getLimitFrom().getLongitude() + ", "
				+ projectObject.getLimitTo().getLatitude() + ", "
				+ projectObject.getLimitTo().getLongitude() + ");";
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.Projects WHERE air_quality_analysis_co='"
				+ projectObject.getAir_quality_analysis_co()+"';"; 
		String sql2 = "INSERT INTO cs4311team9sp16.PROPOSEDPROJECT VALUES ('"
				+ projectObject.getProject_id() +"', "
				+ projectObject.getElement() + ", '"
				+ projectObject.getSubmission_deadline() + "', "
				+ projectObject.getWorkflow_status() + ", '"
				+ projectObject.getCn() + "', '"
				+ projectObject.getCsj() + "', "
				+ projectObject.getFund_type() + ", '"
				+ projectObject.getMpo_id() + "', '"
				+ projectObject.getPro_lead_id() + "');"
				;
		String sqlVerify2 =  "SELECT * FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id='" 
				+ projectObject.getApproved_project_id()+"';";
		String sql3 = "INSERT INTO cs4311team9sp16.SUBMITTEDPROJECT (sproject_id) VALUES('" + projectObject.getProject_id() + 
				"');";
		String sqlVerify3 = "SELECT 'sproject_id' FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id = '" + projectObject.getProject_id() + "';";
		String sql4 = "INSERT INTO cs4311team9sp16.FUNDEDPROJECT (fproject_id) VALUES('" + projectObject.getProject_id() + 
				"');";
		String sqlVerify4 = "SELECT 'fproject_id' FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id = '" + projectObject.getProject_id() + "';";
		try{
			createStmt = conn.createStatement();
			createStmt.execute(sql);
			resultVerify = createStmt.executeQuery(sqlVerify);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getAir_quality_analysis_co())
				&& resultVerify.getString(2).equals(projectObject.getAir_quality_analysis_nox())
				&& resultVerify.getString(3).equals(projectObject.getAir_quality_analysis_voc())
				&& resultVerify.getInt(4) == (projectObject.getArea())
				&& resultVerify.getBoolean(5) == (projectObject.isCapacity_project())
				&& resultVerify.getInt(6) == (projectObject.getCity())
				&& resultVerify.getInt(7) == (projectObject.getCounty())
				&& resultVerify.getInt(8) == (projectObject.getDistrict())
				&& resultVerify.getDate(9).toString().equals(projectObject.getFederal_fiscal_year().toString())
				&& resultVerify.getInt(10) == (projectObject.getClassification())
				&& resultVerify.getInt(11) == (projectObject.getFund_type())
				&& resultVerify.getString(12).equals(projectObject.getNameOfHighwayorRoadway())
				&& resultVerify.getDate(13).toString().equals(projectObject.getNetwork_Year().toString())
				&& resultVerify.getInt(14) == (projectObject.getNumber_of_existing_lanes())
				&& resultVerify.getDouble(15) == (projectObject.getNumber_of_miles())
				&& resultVerify.getInt(16) == (projectObject.getNumber_of_project_lanes())
				&& resultVerify.getString(17).equals(projectObject.getProject_description())
				&& resultVerify.getString(18).equals(projectObject.getProject_id())
				&& resultVerify.getInt(19) == (projectObject.getIdentity())
				&& resultVerify.getInt(20) == (projectObject.getPhases())
				&& resultVerify.getInt(21) == (projectObject.getType())
				&& resultVerify.getString(22).equals(projectObject.getRemarks())
				&& resultVerify.getString(23).equals(projectObject.getScope_of_work())
				&& resultVerify.getString(24).equals(projectObject.getSponsoring_agency())
				&& resultVerify.getInt(25) == (projectObject.getState_system())
				&& resultVerify.getString(26).equals(projectObject.getProject_name())
				&& resultVerify.getDouble(27) == (projectObject.getLimitFrom().getLatitude())
				&& resultVerify.getDouble(28) == (projectObject.getLimitFrom().getLongitude())
				&& resultVerify.getDouble(29) == (projectObject.getLimitTo().getLatitude())
				&& resultVerify.getDouble(30) == (projectObject.getLimitTo().getLongitude())
				)
			{
				result = true;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql2);
			resultVerify = createStmt.executeQuery(sqlVerify2);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id())
				&& resultVerify.getInt(2) == (projectObject.getElement())
				&& resultVerify.getDate(3).toString().equals(projectObject.getSubmission_deadline().toString())
				&& resultVerify.getInt(4) == (projectObject.getWorkflow_status())
				&& resultVerify.getString(5).equals(projectObject.getCn())
				&& resultVerify.getString(6).equals(projectObject.getCsj())
				&& resultVerify.getInt(7) == (projectObject.getFund_type())
				&& resultVerify.getString(8).equals(projectObject.getMpo_id())
				&& resultVerify.getString(9).equals(projectObject.getPro_lead_id())
			)
			{
				result = true;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql3);
			resultVerify = createStmt.executeQuery(sqlVerify3);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id()))
			{
				result = false;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql4);
			resultVerify = createStmt.executeQuery(sqlVerify4);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id()))
			{
				result = false;
			}
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
		}
		
		return result;
	}
	
	/*public boolean create(TransitProposedProject projectObject)
	{
		conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Projects VALUES ('"
				+ projectObject.getAir_quality_analysis_co() +"', '"
				+ projectObject.getAir_quality_analysis_nox() +"', '"
				+ projectObject.getAir_quality_analysis_voc() +"', "
				+ projectObject.getArea() + ", "
				+ projectObject.isCapacity_project() + ", "
				+ projectObject.getCity() + ", "
				+ projectObject.getCounty()+ ", "
				+ projectObject.getDistrict() + ", '"
				+ projectObject.getFederal_fiscal_year() + "', "
				+ projectObject.getClassification() + ", "
				+ projectObject.getFund_type() + ", '"
				+ projectObject.getNameOfHighwayorRoadway() + "', '"
				+ projectObject.getNetwork_Year() + "', "
				+ projectObject.getNumber_of_existing_lanes() + ", "
				+ projectObject.getNumber_of_miles() + ", "
				+ projectObject.getNumber_of_project_lanes() + ", '"
				+ projectObject.getProject_description() + "', '"
				+ projectObject.getProject_id() + "', "
				+ projectObject.getIdentity() + ", "
				+ projectObject.getPhases() + ", "
				+ projectObject.getType() + ", '"
				+ projectObject.getRemarks() + "', '"
				+ projectObject.getScope_of_work() + "', '"
				+ projectObject.getSponsoring_agency() + "', "
				+ projectObject.getState_system() + ", '"
				+ projectObject.getProject_name() + "', "
				+ projectObject.getLimitFrom().getLatitude() + ", "
				+ projectObject.getLimitFrom().getLongitude() + ", "
				+ projectObject.getLimitTo().getLatitude() + ", "
				+ projectObject.getLimitTo().getLongitude() + ");";
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.Projects WHERE air_quality_analysis_co='"
				+ projectObject.getAir_quality_analysis_co()+"';"; 
		String sql2 = "INSERT INTO cs4311team9sp16.PROPOSEDPROJECT VALUES ('"
				+ projectObject.getProject_id() +"', "
				+ projectObject.getElement() + ", '"
				+ projectObject.getSubmission_deadline() + "', "
				+ projectObject.getWorkflow_status() + ", '"
				+ projectObject.getCn() + "', '"
				+ projectObject.getCsj() + "', "
				+ projectObject.getFund_type() + ", '"
				+ projectObject.getMpo_id() + "', '"
				+ projectObject.getPro_lead_id() + "');"
				;
		String sqlVerify2 =  "SELECT * FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id='" 
				+ projectObject.getApproved_project_id()+"';";
		
		String sql3 = "INSERT INTO cs4311team9sp16.TRANSITPROPOSEDPROJECT VALUES ('"
				+ projectObject.getProject_id() +"', '"
				+ projectObject.getApportionment_year() + "', '"
				+ projectObject.getSection_5309ID() + "', '"
				+ projectObject.getTcd_amount_requested() + "', "
				+ projectObject.getTptype() + ");";
				;
		String sqlVerify3 =  "SELECT * FROM cs4311team9sp16.TRANSITPROPOSEDPROJECT WHERE f_approved_project_id='" 
				+ projectObject.getApproved_project_id()+"';";
		String sql4 = "INSERT INTO cs4311team9sp16.SUBMITTEDPROJECT (sproject_id) VALUES('" + projectObject.getProject_id() + 
				"');";
		String sqlVerify4 = "SELECT 'sproject_id' FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id = '" + projectObject.getProject_id() + "';";
		String sql5 = "INSERT INTO cs4311team9sp16.FUNDEDPROJECT (fproject_id) VALUES('" + projectObject.getProject_id() + 
				"');";
		String sqlVerify5 = "SELECT 'fproject_id' FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id = '" + projectObject.getProject_id() + "';";
		String sql6 = "INSERT INTO cs4311team9sp16.TRANSITFUNDEDPROJECT (ftproject_id) VALUES('" + projectObject.getProject_id() + 
				"');";
		String sqlVerify6 = "SELECT 'ftproject_id' FROM cs4311team9sp16.TRANSITFUNDEDPROJECT WHERE ftproject_id = '" + projectObject.getProject_id() + "';";
		try{
			createStmt = conn.createStatement();
			createStmt.execute(sql);
			resultVerify = createStmt.executeQuery(sqlVerify);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getAir_quality_analysis_co())
				&& resultVerify.getString(2).equals(projectObject.getAir_quality_analysis_nox())
				&& resultVerify.getString(3).equals(projectObject.getAir_quality_analysis_voc())
				&& resultVerify.getInt(4) == (projectObject.getArea())
				&& resultVerify.getBoolean(5) == (projectObject.isCapacity_project())
				&& resultVerify.getInt(6) == (projectObject.getCity())
				&& resultVerify.getInt(7) == (projectObject.getCounty())
				&& resultVerify.getInt(8) == (projectObject.getDistrict())
				&& resultVerify.getDate(9).toString().equals(projectObject.getFederal_fiscal_year().toString())
				&& resultVerify.getInt(10) == (projectObject.getClassification())
				&& resultVerify.getInt(11) == (projectObject.getFund_type())
				&& resultVerify.getString(12).equals(projectObject.getNameOfHighwayorRoadway())
				&& resultVerify.getDate(13).toString().equals(projectObject.getNetwork_Year().toString())
				&& resultVerify.getInt(14) == (projectObject.getNumber_of_existing_lanes())
				&& resultVerify.getDouble(15) == (projectObject.getNumber_of_miles())
				&& resultVerify.getInt(16) == (projectObject.getNumber_of_project_lanes())
				&& resultVerify.getString(17).equals(projectObject.getProject_description())
				&& resultVerify.getString(18).equals(projectObject.getProject_id())
				&& resultVerify.getInt(19) == (projectObject.getIdentity())
				&& resultVerify.getInt(20) == (projectObject.getPhases())
				&& resultVerify.getInt(21) == (projectObject.getType())
				&& resultVerify.getString(22).equals(projectObject.getRemarks())
				&& resultVerify.getString(23).equals(projectObject.getScope_of_work())
				&& resultVerify.getString(24).equals(projectObject.getSponsoring_agency())
				&& resultVerify.getInt(25) == (projectObject.getState_system())
				&& resultVerify.getString(26).equals(projectObject.getProject_name())
				&& resultVerify.getDouble(27) == (projectObject.getLimitFrom().getLatitude())
				&& resultVerify.getDouble(28) == (projectObject.getLimitFrom().getLongitude())
				&& resultVerify.getDouble(29) == (projectObject.getLimitTo().getLatitude())
				&& resultVerify.getDouble(30) == (projectObject.getLimitTo().getLongitude())
				)
			{
				result = true;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql2);
			resultVerify = createStmt.executeQuery(sqlVerify2);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getApproved_project_id())
					&& resultVerify.getInt(2) == (projectObject.getElement())
					&& resultVerify.getDate(3).toString().equals(projectObject.getSubmission_deadline().toString())
					&& resultVerify.getInt(4) == (projectObject.getWorkflow_status())
					&& resultVerify.getString(5).equals(projectObject.getCn())
					&& resultVerify.getString(6).equals(projectObject.getCsj())
					&& resultVerify.getInt(7) == (projectObject.getFund_type())
					&& resultVerify.getString(8).equals(projectObject.getMpo_id())
					&& resultVerify.getString(9).equals(projectObject.getPro_lead_id())
			)
			{
				result = true;
			}
			
			createStmt = conn.createStatement();
			createStmt.execute(sql3);
			resultVerify = createStmt.executeQuery(sqlVerify3);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id())
					&& resultVerify.getDate(2).toString().equals(projectObject.getApportionment_year())
					&& resultVerify.getDate(3).toString().equals(projectObject.getSubmission_deadline().toString())
					&& resultVerify.getString(4).equals(projectObject.getTcd_amount_requested())
					&& resultVerify.getInt(5) == (projectObject.getTptype())
			)
			{
				result = true;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql4);
			resultVerify = createStmt.executeQuery(sqlVerify4);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id()))
			{
				result = false;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql5);
			resultVerify = createStmt.executeQuery(sqlVerify5);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id()))
			{
				result = false;
			}
			createStmt = conn.createStatement();
			createStmt.execute(sql6);
			resultVerify = createStmt.executeQuery(sqlVerify6);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getProject_id()))
			{
				result = false;
			}
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
		}
		
		return result;
	}*/
	
	public boolean create(SubmittedProject projectObject)
	{
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		/*
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.SUBMITTEDPROJECT VALUES ('" 
		+ projectObject.getProject_id()+"', '" 
		+ userObject.getLastName()+"', '" 
		+ userObject.getUsername()+"', '" 
		+ userObject.getPassword()+"');"
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		try{
		createStmt = conn.createStatement();
		createStmt.execute(sql);
		resultVerify = createStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getString(1).equals(userObject.getFirstName()) && resultVerify.getString(2).equals(userObject.getLastName()) && resultVerify.getString(3).equals(userObject.getUsername()) && resultVerify.getString(4).equals(userObject.getPassword()) && 
		resultVerify.getBoolean(5) == false && resultVerify.getBoolean(6) == false && resultVerify.getBoolean(7) == false &&  resultVerify.getBoolean(8) == false && resultVerify.getBoolean(9) == false && resultVerify.getBoolean(10) == true &&  resultVerify.getBoolean(11) == true && resultVerify.getBoolean(12) == true && resultVerify.getBoolean(13) == false && resultVerify.getBoolean(14) == false && resultVerify.getBoolean(15) == false &&  resultVerify.getBoolean(16) == false && resultVerify.getBoolean(17) == false && resultVerify.getBoolean(18) == true &&  resultVerify.getBoolean(19) == true && resultVerify.getBoolean(20) == true)
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}*/
		return result;
	}
	/*public boolean create(FundedProject projectObject)
	{
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.FUNDEDPROJECT SET "
		+ "amended_date = '" + projectObject.getDate()+ "', "
		+ "cn = '" + projectObject.getCn()+ "', "
		+ "csj = '" + projectObject.getCsj()+ "', "
		+ "tip_name ='" + projectObject.getTip_name() + "', " 
		+ "tip_year = '"+projectObject.getTip_year()+ "' "
		+ "WHERE fproject_id = '" + projectObject.getProject_id() + "' ;";
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.FUNDEDPROJECT WHERE amended_date ='" + projectObject.getDate()+"';"; 
		try{
		createStmt = conn.createStatement();
		createStmt.execute(sql);
		resultVerify = createStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getDate(1).toString().equals(projectObject.getDate().toString()) 
				&& resultVerify.getString(2).equals(projectObject.getCn()) 
				&& resultVerify.getString(3).equals(projectObject.getCsj()) 
				&& resultVerify.getString(4).equals(projectObject.getTip_name()) 
				&& resultVerify.getDate(5).toString().equals(projectObject.getTip_year().toString())
				)
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}*/
	
/*	public boolean create (TransitFundedProject projectObject)
	{
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.TRANSITFUNDEDPROJECT SET "
		+ "tdc_award_amount = '" + projectObject.getTdc_award_amount()+ "', "
		+ "tdc_award_date = '" + projectObject.getTdc_award_date() + "' "
		+ "WHERE ftproject_id = '" + projectObject.getProject_id() + "' ;";
		String sql2 = "UPDATE cs4311team9sp16.FUNDEDPROJECT SET "
		+ "amended_date = '" + projectObject.getDate()+ "', "
		+ "cn = '" + projectObject.getCn()+ "', "
		+ "csj = '" + projectObject.getCsj()+ "', "
		+ "tip_name ='" + projectObject.getTip_name() + "', " 
		+ "tip_year = '"+projectObject.getTip_year()+ "' "
		+ "WHERE fproject_id = '" + projectObject.getProject_id() + "' ;";
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.FUNDEDPROJECT WHERE amended_date ='" + projectObject.getDate()+"';"; 
		String sqlVerify2 =  "SELECT * FROM cs4311team9sp16.TRANSITFUNDEDPROJECT WHERE tdc_award_amount ='" + projectObject.getTdc_award_amount()+"';"; 
		try{
		createStmt = conn.createStatement();
		createStmt.execute(sql);
		resultVerify = createStmt.executeQuery(sqlVerify2);
		resultVerify.next();
		if(resultVerify.getString(1).equals(projectObject.getTdc_award_amount())  
				&& resultVerify.getDate(2).toString().equals(projectObject.getTdc_award_date().toString()) 
				&& resultVerify.getString(3).equals(projectObject.getProject_id()) 
				)
			result = true;
		createStmt = conn.createStatement();
		createStmt.execute(sql2);
		resultVerify = createStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getDate(1).toString().equals(projectObject.getDate().toString()) 
				&& resultVerify.getString(2).equals(projectObject.getCn()) 
				&& resultVerify.getString(3).equals(projectObject.getCsj()) 
				&& resultVerify.getString(4).equals(projectObject.getTip_name()) 
				&& resultVerify.getDate(5).toString().equals(projectObject.getTip_year().toString())
				)
			result = true;

		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}*/
	
	public ProposedProject view(ProposedProject projectObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet r;
		String sql = "SELECT * FROM cs4311team9sp16.Projects WHERE project_id='"+ projectObject.getProject_id() +"';";
		String sql2 = "SELECT * FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id='"+ projectObject.getProject_id() +"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		r = getStmt.executeQuery(sql);
		r.next();
		projectObject.setAir_quality_analysis_co(r.getString(1));
		projectObject.setAir_quality_analysis_nox(r.getString(2));
		projectObject.setAir_quality_analysis_voc(r.getString(3));
		projectObject.setArea(r.getInt(4));
		projectObject.setCapacity_project(r.getBoolean(5));
		projectObject.setCity(r.getInt(6));
		projectObject.setCounty(r.getInt(7));
		projectObject.setDistrict(r.getInt(8));
		projectObject.setFederal_fiscal_year(r.getDate(9));
		projectObject.setClassification(r.getInt(10));
		projectObject.setFund_type(r.getInt(11));
		projectObject.setNameOfHighwayorRoadway(r.getString(12));
		projectObject.setNetwork_Year(r.getDate(13)) ;
		projectObject.setNumber_of_existing_lanes(r.getInt(14));
		projectObject.setNumber_of_miles(r.getInt(15));
		projectObject.setNumber_of_project_lanes(r.getInt(16));
		projectObject.setProject_description(r.getString(17));
		projectObject.setProject_id(r.getString(18));
		projectObject.setIdentity(r.getInt(19));
		projectObject.setPhases(r.getInt(20));
		projectObject.setType(r.getInt(21));
		projectObject.setRemarks(r.getString(22));
		projectObject.setScope_of_work(r.getString(23));
		projectObject.setSponsoring_agency(r.getString(24));
		projectObject.setState_system(r.getInt(25));
		projectObject.setProject_name(r.getString(26));
		projectObject.getLimitFrom().setLatitude(r.getDouble(27));
		projectObject.getLimitFrom().setLongitude(r.getDouble(28));
		projectObject.getLimitTo().setLatitude(r.getDouble(29));
		projectObject.getLimitTo().setLongitude(r.getDouble(30));
		
		getStmt = conn.createStatement();
		getStmt.execute(sql2);
		r = getStmt.executeQuery(sql2);
		r.next();
		projectObject.setApproved_project_id(r.getString(1));
		projectObject.setElement(r.getInt(2));
		projectObject.setSubmission_deadline(r.getDate(3));
		projectObject.setWorkflow_status(r.getInt(4));
		projectObject.setCn(r.getString(5));
		projectObject.setCsj(r.getString(6));
		projectObject.setFund_type(r.getInt(7));
		projectObject.setMpo_id(r.getString(8));
		projectObject.setPro_lead_id(r.getString(9));
		
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return projectObject;
		}
		return projectObject;
	}
	
	/*public ProposedProject view(TransitProposedProject projectObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet r;
		String sql = "SELECT * FROM cs4311team9sp16.Projects WHERE project_id='"+ projectObject.getProject_id() +"';";
		String sql2 = "SELECT * FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id='"+ projectObject.getProject_id() +"';";
		String sql3 = "SELECT * FROM cs4311team9sp16.TRANSITPROPOSEDPROJECT WHERE f_approved_project_id='"+ projectObject.getProject_id() +"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		r = getStmt.executeQuery(sql);
		r.next();
		projectObject.setAir_quality_analysis_co(r.getString(1));
		projectObject.setAir_quality_analysis_nox(r.getString(2));
		projectObject.setAir_quality_analysis_voc(r.getString(3));
		projectObject.setArea(r.getInt(4));
		projectObject.setCapacity_project(r.getBoolean(5));
		projectObject.setCity(r.getInt(6));
		projectObject.setCounty(r.getInt(7));
		projectObject.setDistrict(r.getInt(8));
		projectObject.setFederal_fiscal_year(r.getDate(9));
		projectObject.setClassification(r.getInt(10));
		projectObject.setFund_type(r.getInt(11));
		projectObject.setNameOfHighwayorRoadway(r.getString(12));
		projectObject.setNetwork_Year(r.getDate(13)) ;
		projectObject.setNumber_of_existing_lanes(r.getInt(14));
		projectObject.setNumber_of_miles(r.getInt(15));
		projectObject.setNumber_of_project_lanes(r.getInt(16));
		projectObject.setProject_description(r.getString(17));
		projectObject.setProject_id(r.getString(18));
		projectObject.setIdentity(r.getInt(19));
		projectObject.setPhases(r.getInt(20));
		projectObject.setType(r.getInt(21));
		projectObject.setRemarks(r.getString(22));
		projectObject.setScope_of_work(r.getString(23));
		projectObject.setSponsoring_agency(r.getString(24));
		projectObject.setState_system(r.getInt(25));
		projectObject.setProject_name(r.getString(26));
		projectObject.getLimitFrom().setLatitude(r.getDouble(27));
		projectObject.getLimitFrom().setLongitude(r.getDouble(28));
		projectObject.getLimitTo().setLatitude(r.getDouble(29));
		projectObject.getLimitTo().setLongitude(r.getDouble(30));
		
		getStmt = conn.createStatement();
		getStmt.execute(sql2);
		r = getStmt.executeQuery(sql2);
		r.next();
		projectObject.setApproved_project_id(r.getString(1));
		projectObject.setElement(r.getInt(2));
		projectObject.setSubmission_deadline(r.getDate(3));
		projectObject.setWorkflow_status(r.getInt(4));
		projectObject.setCn(r.getString(5));
		projectObject.setCsj(r.getString(6));
		projectObject.setFund_type(r.getInt(7));
		projectObject.setMpo_id(r.getString(8));
		projectObject.setPro_lead_id(r.getString(9));
		
		getStmt = conn.createStatement();
		getStmt.execute(sql2);
		r = getStmt.executeQuery(sql2);
		r.next();
		projectObject.setApportionment_year(r.getDate(2));
		projectObject.setSection_5309ID(r.getString(3));
		projectObject.setTcd_amount_requested(r.getString(4));
		projectObject.setTptype(r.getInt(5));
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return projectObject;
		}
		return projectObject;
	}*/
	
	public boolean delete(ProposedProject projectObject)
	{
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Projects WHERE project_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify = "SELECT project_id FROM cs4311team9sp16.Projects WHERE project_id ='"+ projectObject.getProject_id() +"';"; 
		String sql2 = "DELETE FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify2 = "SELECT approved_project_id FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id ='"+ projectObject.getProject_id() +"';"; 
		String sql3 = "DELETE FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify3 = "SELECT sproject_id FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id ='"+ projectObject.getProject_id() +"';"; 
		String sql4 = "DELETE FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify4 = "SELECT fproject_id FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id ='"+ projectObject.getProject_id() +"';"; 
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql2);
		resultVerify = deleteStmt.executeQuery(sqlVerify2);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql3);
		resultVerify = deleteStmt.executeQuery(sqlVerify3);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql4);
		resultVerify = deleteStmt.executeQuery(sqlVerify4);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	
	public boolean delete(TransitProposedProject projectObject)
	{
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Projects WHERE project_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify = "SELECT project_id FROM cs4311team9sp16.Projects WHERE project_id ='"+ projectObject.getProject_id() +"';"; 
		
		String sql2 = "DELETE FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify2 = "SELECT approved_project_id FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id ='"+ projectObject.getProject_id() +"';"; 
		
		String sql3 = "DELETE FROM cs4311team9sp16.TRANSITPROPOSEDPROJECT WHERE f_approved_project_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify3 = "SELECT f_approved_project_id FROM cs4311team9sp16.TRANSITPROPOSEDPROJECT WHERE f_approved_project_id ='"+ projectObject.getProject_id() +"';"; 
		String sql4 = "DELETE FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify4 = "SELECT sproject_id FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id ='"+ projectObject.getProject_id() +"';"; 
		String sql5 = "DELETE FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify5 = "SELECT fproject_id FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id ='"+ projectObject.getProject_id() +"';"; 
		String sql6 = "DELETE FROM cs4311team9sp16.TRANSITFUNDEDPROJECT WHERE ftproject_id = '" + projectObject.getProject_id() + "';";
		String sqlVerify6 = "SELECT ftproject_id FROM cs4311team9sp16.TRANSITFUNDEDPROJECT WHERE ftproject_id ='"+ projectObject.getProject_id() +"';"; 
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql2);
		resultVerify = deleteStmt.executeQuery(sqlVerify2);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql3);
		resultVerify = deleteStmt.executeQuery(sqlVerify3);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql4);
		resultVerify = deleteStmt.executeQuery(sqlVerify4);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql5);
		resultVerify = deleteStmt.executeQuery(sqlVerify5);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql6);
		resultVerify = deleteStmt.executeQuery(sqlVerify6);
		resultVerify.next();
		if(!resultVerify.first())
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
}
