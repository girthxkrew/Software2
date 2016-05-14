package MPO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectHandler extends Handler{
	public boolean edit(ProposedProject projectObject){
		String string1 = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		String string2 = "UPDATE cs4311team9sp16.Projects SET ";
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Statement secondeditStmt;
		Boolean result = false;
		ResultSet resultVerify = null;
		ResultSet secondVerify = null;
		String [] sql = editQueryBuilder(projectObject);
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Projects WHERE project_id='"+ projectObject.getProject_id()+"';"; 
		String psqlVerify = "SELECT * FROM cs4311team9sp16.PROPOSEDPROJECT WHERE approved_project_id='"+ projectObject.getProject_id()+"';";
		try{
			editStmt = conn.createStatement();
			if(sql[0].length() > string2.length()){
			editStmt.execute(sql[0]);
			resultVerify = editStmt.executeQuery(sqlVerify);
			resultVerify.next();
			}
			secondeditStmt = conn.createStatement();
			if(sql[1].length() > string1.length()){
			secondeditStmt.execute(sql[1]);
			secondVerify = secondeditStmt.executeQuery(psqlVerify);
			secondVerify.next();
			}
			if(editVerification(projectObject,resultVerify,secondVerify))
				result = true;
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(FundedProject projectObject){
		String string1 = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		String string2 = "UPDATE cs4311team9sp16.Projects SET ";
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Statement secondeditStmt;
		Boolean result = false;
		ResultSet resultVerify = null;
		ResultSet secondVerify = null;
		String [] sql = editQueryBuilder(projectObject);
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Project WHERE project_id='"+ projectObject.getProject_id()+"';"; 
		String psqlVerify = "SELECT * FROM cs4311team9sp16.FUNDEDPROJECT WHERE fproject_id='"+ projectObject.getProject_id()+"';";
		try{
			editStmt = conn.createStatement();
			if(sql[0].length() > string2.length()){
			editStmt.execute(sql[0]);
			resultVerify = editStmt.executeQuery(sqlVerify);
			resultVerify.next();
			}
			secondeditStmt = conn.createStatement();
			if(sql[1].length() > string1.length()){
			secondeditStmt.execute(sql[1]);
			secondVerify = secondeditStmt.executeQuery(psqlVerify);
			secondVerify.next();
			}
			if(editVerification(projectObject,resultVerify,secondVerify))
				result = true;
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(SubmittedProject projectObject){
		String string1 = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		String string2 = "UPDATE cs4311team9sp16.Projects SET ";
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Statement secondeditStmt;
		Boolean result = false;
		ResultSet resultVerify = null;
		ResultSet secondVerify = null;
		String [] sql = editQueryBuilder(projectObject);
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Project WHERE project_id='"+ projectObject.getProject_id()+"';"; 
		String psqlVerify = "SELECT * FROM cs4311team9sp16.SUBMITTEDPROJECT WHERE sproject_id='"+ projectObject.getProject_id()+"';";
		try{
			editStmt = conn.createStatement();
			if(sql[0].length() > string2.length()){
			editStmt.execute(sql[0]);
			resultVerify = editStmt.executeQuery(sqlVerify);
			resultVerify.next();
			}
			secondeditStmt = conn.createStatement();
			if(sql[1].length() > string1.length()){
			secondeditStmt.execute(sql[1]);
			secondVerify = secondeditStmt.executeQuery(psqlVerify);
			secondVerify.next();
			}
			if(editVerification(projectObject,resultVerify,secondVerify))
				result = true;
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(TransitFundedProject projectObject){
		String string1 = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		String string2 = "UPDATE cs4311team9sp16.Projects SET ";
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Statement secondeditStmt;
		Boolean result = false;
		ResultSet resultVerify = null;
		ResultSet secondVerify = null;
		String [] sql = editQueryBuilder(projectObject);
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Project WHERE project_id='"+ projectObject.getProject_id()+"';"; 
		String psqlVerify = "SELECT * FROM cs4311team9sp16.TRANSITFUNDEDPROJECT WHERE ftproject_id='"+ projectObject.getProject_id()+"';";
		try{
			editStmt = conn.createStatement();
			if(sql[0].length() > string2.length()){
			editStmt.execute(sql[0]);
			resultVerify = editStmt.executeQuery(sqlVerify);
			resultVerify.next();
			}
			secondeditStmt = conn.createStatement();
			if(sql[1].length() > string1.length()){
			secondeditStmt.execute(sql[1]);
			secondVerify = secondeditStmt.executeQuery(psqlVerify);
			secondVerify.next();
			}
			if(editVerification(projectObject,resultVerify,secondVerify))
				result = true;
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(TransitProposedProject projectObject){
		String string1 = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		String string2 = "UPDATE cs4311team9sp16.Projects SET ";
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Statement secondeditStmt;
		Boolean result = false;
		ResultSet resultVerify = null;
		ResultSet secondVerify = null;
		String [] sql = editQueryBuilder(projectObject);
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Project WHERE project_id='"+ projectObject.getProject_id()+"';"; 
		String psqlVerify = "SELECT * FROM cs4311team9sp16.TRANSITPROPOSEDPROJECT WHERE f_approved_project_id='"+ projectObject.getProject_id()+"';";
		try{
			editStmt = conn.createStatement();
			if(sql[0].length() > string2.length()){
			editStmt.execute(sql[0]);
			resultVerify = editStmt.executeQuery(sqlVerify);
			resultVerify.next();
			}
			secondeditStmt = conn.createStatement();
			if(sql[1].length() > string1.length()){
			secondeditStmt.execute(sql[1]);
			secondVerify = secondeditStmt.executeQuery(psqlVerify);
			secondVerify.next();
			}
			if(editVerification(projectObject,resultVerify,secondVerify))
				result = true;
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public String [] editQueryBuilder(ProposedProject projectObject){
		String query = "UPDATE cs4311team9sp16.Projects SET ";
		if(projectObject.getAir_quality_analysis_co()!= null && !projectObject.getAir_quality_analysis_co().equals(" "))
			query = query.concat("air_quality_analysis_co = '"+ projectObject.getAir_quality_analysis_co()+"'");
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" "))
			query = query.concat(",air_quality_analysis_nox = '"+ projectObject.getAir_quality_analysis_nox()+"'");
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" "))
			query = query.concat(",air_quality_analysis_voc = '"+ projectObject.getAir_quality_analysis_voc()+"'");
		if(projectObject.getArea() != -1)
			query = query.concat(",area = " + projectObject.getArea()+",");
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false)
			query = query.concat(",capacity_project = " + projectObject.isCapacity_project());
		if(projectObject.getCity() != -1)
			query = query.concat(",city =" + projectObject.getCity());
		if(projectObject.getCounty() != -1)
			query = query.concat(",county = " + projectObject.getCounty());
		if(projectObject.getDistrict() != -1)
			query = query.concat(",district = " + projectObject.getDistrict());
		if(projectObject.getFederal_fiscal_year() != null)
			query = query.concat(",federal_fiscal_year = '" + projectObject.getFederal_fiscal_year() + "'");
		if(projectObject.getClassification() != -1)
			query = query.concat(",classification =" + projectObject.getClassification());
		if(projectObject.getFund_type() != -1)
			query = query.concat(",fund_type = " + projectObject.getFund_type());
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" "))
			query = query.concat(",nameOfHighwayorRoadway = '"+ projectObject.getNameOfHighwayorRoadway()+"'");
		if(projectObject.getNetwork_Year() != null)
			query = query.concat(",network_Year = '"+ projectObject.getNetwork_Year() +"'");
		if(projectObject.getNumber_of_existing_lanes() != -1)
			query = query.concat(",number_of_existing_lanes = "+ projectObject.getNumber_of_existing_lanes());
		if(projectObject.getNumber_of_miles() != -1)
			query = query.concat(",number_of_miles = " + projectObject.getNumber_of_miles());
		if(projectObject.getNumber_of_project_lanes() != -1)
			query = query.concat(",number_of_project_lanes = " + projectObject.getNumber_of_project_lanes());
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" "))
			query = query.concat(",project_description = '" + projectObject.getProject_description() + "'");
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" "))
			//query = query.concat(",project_id = '" + projectObject.getProject_id() + "'");
		if(projectObject.getIdentity() != -1)
			query = query.concat(",identity = " + projectObject.getIdentity());
		if(projectObject.getPhases() != -1)
			query = query.concat(",phases = " + projectObject.getPhases());
		if(projectObject.getType() != -1)
			query = query.concat(",type = " + projectObject.getType());
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" "))
			query = query.concat(",remarks = '" + projectObject.getRemarks() + "'");
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" "))
			query = query.concat(",scope_of_work = '" + projectObject.getScope_of_work()+"'");
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" "))
			query = query.concat(",sponsoring_agency = '" + projectObject.getSponsoring_agency()+ "'");
		if(projectObject.getState_system() != -1)
			query = query.concat(",state_system = " + projectObject.getState_system());
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" "))
			query = query.concat(",project_name = '" + projectObject.getProject_name() + "'");
		if(projectObject.getLimitFrom().getLatitude() != 1.0)
			query = query.concat(",limitFrom_latitude = " + projectObject.getLimitFrom().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitFrom_longitude =" + projectObject.getLimitFrom().getLongitude());
		if(projectObject.getLimitTo().getLatitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitTo().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitFrom().getLongitude());
		query.concat(";");
		System.out.println(query);
		//Begin proposed project exclusive fields
		String secondQuery = "UPDATE cs4311team9sp16.PROPOSEDPROJECT SET ";
		//if(!projectObject.getApproved_project_id().equals(" "))
			//secondQuery = secondQuery.concat("approved_project_id = '" + projectObject.getApproved_project_id()+ "'");
		if(projectObject.getElement() != -1)
			secondQuery = secondQuery.concat(",project_readiness_elements = " + projectObject.getElement());
		if(projectObject.getWorkflow_status() != -1)
			secondQuery = secondQuery.concat(",workflow_status = " + projectObject.getWorkflow_status());
		if(projectObject.getSubmission_deadline() != null)
			secondQuery = secondQuery.concat(",submission_deadline = " + projectObject.getSubmission_deadline());
		if(!projectObject.getCn().equals(" "))
			secondQuery = secondQuery.concat(",cs = '" + projectObject.getCn() + "'");
		if(!projectObject.getCsj().equals(" "))
			secondQuery = secondQuery.concat(",csj ='" + projectObject.getCsj()+ "'");
		if(projectObject.getFund_type() != -1)
			secondQuery = secondQuery.concat(",funded_project_type = " + projectObject.getFund_type());
		if(!projectObject.getMpo_id().equals(" "))
			secondQuery = secondQuery.concat(",mpo_id = '" + projectObject.getMpo_id() + "'");
		//if(!projectObject.getProject_id().equals(" "))
			//secondQuery = secondQuery.concat("pro_lead_id = '" + projectObject.getProject_id() + "'");
		secondQuery.concat(";");
		System.out.println(secondQuery);
		String [] queries = {query,secondQuery};
		return queries;
	}
	public String [] editQueryBuilder(FundedProject projectObject){
		String query = "UPDATE cs4311team9sp16.Projects SET ";
		if(projectObject.getAir_quality_analysis_co()!= null && !projectObject.getAir_quality_analysis_co().equals(" "))
			query = query.concat("air_quality_analysis_co = '"+ projectObject.getAir_quality_analysis_co()+"'");
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" "))
			query = query.concat(",air_quality_analysis_nox = '"+ projectObject.getAir_quality_analysis_nox()+"'");
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" "))
			query = query.concat(",air_quality_analysis_voc = '"+ projectObject.getAir_quality_analysis_voc()+"'");
		if(projectObject.getArea() != -1)
			query = query.concat(",area = " + projectObject.getArea()+",");
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false)
			query = query.concat(",capacity_project = " + projectObject.isCapacity_project());
		if(projectObject.getCity() != -1)
			query = query.concat(",city =" + projectObject.getCity());
		if(projectObject.getCounty() != -1)
			query = query.concat(",county = " + projectObject.getCounty());
		if(projectObject.getDistrict() != -1)
			query = query.concat(",district = " + projectObject.getDistrict());
		if(projectObject.getFederal_fiscal_year() != null)
			query = query.concat(",federal_fiscal_year = '" + projectObject.getFederal_fiscal_year() + "'");
		if(projectObject.getClassification() != -1)
			query = query.concat(",classification =" + projectObject.getClassification());
		if(projectObject.getFund_type() != -1)
			query = query.concat(",fund_type = " + projectObject.getFund_type());
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" "))
			query = query.concat(",nameOfHighwayorRoadway = '"+ projectObject.getNameOfHighwayorRoadway()+"'");
		if(projectObject.getNetwork_Year() != null)
			query = query.concat(",network_Year = '"+ projectObject.getNetwork_Year() +"'");
		if(projectObject.getNumber_of_existing_lanes() != -1)
			query = query.concat(",number_of_existing_lanes = "+ projectObject.getNumber_of_existing_lanes());
		if(projectObject.getNumber_of_miles() != -1)
			query = query.concat(",number_of_miles = " + projectObject.getNumber_of_miles());
		if(projectObject.getNumber_of_project_lanes() != -1)
			query = query.concat(",number_of_project_lanes = " + projectObject.getNumber_of_project_lanes());
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" "))
			query = query.concat(",project_description = '" + projectObject.getProject_description() + "'");
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" "))
			//query = query.concat(",project_id = '" + projectObject.getProject_id() + "'");
		if(projectObject.getIdentity() != -1)
			query = query.concat(",identity = " + projectObject.getIdentity());
		if(projectObject.getPhases() != -1)
			query = query.concat(",phases = " + projectObject.getPhases());
		if(projectObject.getType() != -1)
			query = query.concat(",type = " + projectObject.getType());
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" "))
			query = query.concat(",remarks = '" + projectObject.getRemarks() + "'");
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" "))
			query = query.concat(",scope_of_work = '" + projectObject.getScope_of_work()+"'");
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" "))
			query = query.concat(",sponsoring_agency = '" + projectObject.getSponsoring_agency()+ "'");
		if(projectObject.getState_system() != -1)
			query = query.concat(",state_system = " + projectObject.getState_system());
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" "))
			query = query.concat(",project_name = '" + projectObject.getProject_name() + "'");
		if(projectObject.getLimitFrom().getLatitude() != 1.0)
			query = query.concat(",limitFrom_latitude = " + projectObject.getLimitFrom().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitFrom_longitude =" + projectObject.getLimitFrom().getLongitude());
		if(projectObject.getLimitTo().getLatitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitTo().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitFrom().getLongitude());
		query.concat(";");
		//Begin proposed project exclusive fields
		String secondQuery = "UPDATE cs4311team9sp16.FUNDEDPROJECT SET ";
		if(projectObject.getDate() != null)
			secondQuery = secondQuery.concat("ammended_date = " + projectObject.getDate());
		if(!projectObject.getTip_name().equals(" "))
			secondQuery = secondQuery.concat(",tip_name =" + projectObject.getTip_name());
		if(!projectObject.getTip_year().toString().equals(" "))
			secondQuery = secondQuery.concat(",tip_year = " + projectObject.getTip_year());
		//if(!projectObject.getProject_id().equals(" "))
			//secondQuery = secondQuery.concat(",fproject_id = '" + projectObject.getProject_id()+ "'");
		secondQuery.concat(";");
		String [] queries = {query,secondQuery};
		return queries;
	}
	public String [] editQueryBuilder(SubmittedProject projectObject){
		String query = "UPDATE cs4311team9sp16.Projects SET ";
		if(projectObject.getAir_quality_analysis_co()!= null && !projectObject.getAir_quality_analysis_co().equals(" "))
			query = query.concat("air_quality_analysis_co = '"+ projectObject.getAir_quality_analysis_co()+"'");
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" "))
			query = query.concat(",air_quality_analysis_nox = '"+ projectObject.getAir_quality_analysis_nox()+"'");
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" "))
			query = query.concat(",air_quality_analysis_voc = '"+ projectObject.getAir_quality_analysis_voc()+"'");
		if(projectObject.getArea() != -1)
			query = query.concat(",area = " + projectObject.getArea()+",");
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false)
			query = query.concat(",capacity_project = " + projectObject.isCapacity_project());
		if(projectObject.getCity() != -1)
			query = query.concat(",city =" + projectObject.getCity());
		if(projectObject.getCounty() != -1)
			query = query.concat(",county = " + projectObject.getCounty());
		if(projectObject.getDistrict() != -1)
			query = query.concat(",district = " + projectObject.getDistrict());
		if(projectObject.getFederal_fiscal_year() != null)
			query = query.concat(",federal_fiscal_year = '" + projectObject.getFederal_fiscal_year() + "'");
		if(projectObject.getClassification() != -1)
			query = query.concat(",classification =" + projectObject.getClassification());
		if(projectObject.getFund_type() != -1)
			query = query.concat(",fund_type = " + projectObject.getFund_type());
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" "))
			query = query.concat(",nameOfHighwayorRoadway = '"+ projectObject.getNameOfHighwayorRoadway()+"'");
		if(projectObject.getNetwork_Year() != null)
			query = query.concat(",network_Year = '"+ projectObject.getNetwork_Year() +"'");
		if(projectObject.getNumber_of_existing_lanes() != -1)
			query = query.concat(",number_of_existing_lanes = "+ projectObject.getNumber_of_existing_lanes());
		if(projectObject.getNumber_of_miles() != -1)
			query = query.concat(",number_of_miles = " + projectObject.getNumber_of_miles());
		if(projectObject.getNumber_of_project_lanes() != -1)
			query = query.concat(",number_of_project_lanes = " + projectObject.getNumber_of_project_lanes());
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" "))
			query = query.concat(",project_description = '" + projectObject.getProject_description() + "'");
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" "))
			//query = query.concat(",project_id = '" + projectObject.getProject_id() + "'");
		if(projectObject.getIdentity() != -1)
			query = query.concat(",identity = " + projectObject.getIdentity());
		if(projectObject.getPhases() != -1)
			query = query.concat(",phases = " + projectObject.getPhases());
		if(projectObject.getType() != -1)
			query = query.concat(",type = " + projectObject.getType());
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" "))
			query = query.concat(",remarks = '" + projectObject.getRemarks() + "'");
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" "))
			query = query.concat(",scope_of_work = '" + projectObject.getScope_of_work()+"'");
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" "))
			query = query.concat(",sponsoring_agency = '" + projectObject.getSponsoring_agency()+ "'");
		if(projectObject.getState_system() != -1)
			query = query.concat(",state_system = " + projectObject.getState_system());
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" "))
			query = query.concat(",project_name = '" + projectObject.getProject_name() + "'");
		if(projectObject.getLimitFrom().getLatitude() != 1.0)
			query = query.concat(",limitFrom_latitude = " + projectObject.getLimitFrom().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitFrom_longitude =" + projectObject.getLimitFrom().getLongitude());
		if(projectObject.getLimitTo().getLatitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitTo().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitFrom().getLongitude());
		query.concat(";");
		//Begin proposed project exclusive fields
		String secondQuery = "UPDATE cs4311team9sp16.SUBMITTEDPROJECT SET ";
		if(!projectObject.getTpb_approval().equals(" "))
			secondQuery = secondQuery.concat("tpb_approval = '" + projectObject.getTpb_approval() + "'");
		if(!projectObject.getFederal_approval().equals(" "))
			secondQuery = secondQuery.concat(",federal_approval ='" + projectObject.getFederal_approval()+ "'");
		if(!projectObject.getState_approval().equals(" "))
			secondQuery = secondQuery.concat(",state_approval = '" + projectObject.getState_approval() + "'");
		if(!projectObject.getSubmission_status().equals(" "))
			secondQuery = secondQuery.concat(",submission_status = '" + projectObject.getSubmission_status() + "'");
		secondQuery.concat(";");
		String [] queries = {query,secondQuery};
		return queries;
	}
	public String [] editQueryBuilder(TransitFundedProject projectObject){
		String query = "UPDATE cs4311team9sp16.Projects SET ";
		if(projectObject.getAir_quality_analysis_co()!= null && !projectObject.getAir_quality_analysis_co().equals(" "))
			query = query.concat("air_quality_analysis_co = '"+ projectObject.getAir_quality_analysis_co()+"'");
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" "))
			query = query.concat(",air_quality_analysis_nox = '"+ projectObject.getAir_quality_analysis_nox()+"'");
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" "))
			query = query.concat(",air_quality_analysis_voc = '"+ projectObject.getAir_quality_analysis_voc()+"'");
		if(projectObject.getArea() != -1)
			query = query.concat(",area = " + projectObject.getArea()+",");
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false)
			query = query.concat(",capacity_project = " + projectObject.isCapacity_project());
		if(projectObject.getCity() != -1)
			query = query.concat(",city =" + projectObject.getCity());
		if(projectObject.getCounty() != -1)
			query = query.concat(",county = " + projectObject.getCounty());
		if(projectObject.getDistrict() != -1)
			query = query.concat(",district = " + projectObject.getDistrict());
		if(projectObject.getFederal_fiscal_year() != null)
			query = query.concat(",federal_fiscal_year = '" + projectObject.getFederal_fiscal_year() + "'");
		if(projectObject.getClassification() != -1)
			query = query.concat(",classification =" + projectObject.getClassification());
		if(projectObject.getFund_type() != -1)
			query = query.concat(",fund_type = " + projectObject.getFund_type());
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" "))
			query = query.concat(",nameOfHighwayorRoadway = '"+ projectObject.getNameOfHighwayorRoadway()+"'");
		if(projectObject.getNetwork_Year() != null)
			query = query.concat(",network_Year = '"+ projectObject.getNetwork_Year() +"'");
		if(projectObject.getNumber_of_existing_lanes() != -1)
			query = query.concat(",number_of_existing_lanes = "+ projectObject.getNumber_of_existing_lanes());
		if(projectObject.getNumber_of_miles() != -1)
			query = query.concat(",number_of_miles = " + projectObject.getNumber_of_miles());
		if(projectObject.getNumber_of_project_lanes() != -1)
			query = query.concat(",number_of_project_lanes = " + projectObject.getNumber_of_project_lanes());
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" "))
			query = query.concat(",project_description = '" + projectObject.getProject_description() + "'");
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" "))
			//query = query.concat(",project_id = '" + projectObject.getProject_id() + "'");
		if(projectObject.getIdentity() != -1)
			query = query.concat(",identity = " + projectObject.getIdentity());
		if(projectObject.getPhases() != -1)
			query = query.concat(",phases = " + projectObject.getPhases());
		if(projectObject.getType() != -1)
			query = query.concat(",type = " + projectObject.getType());
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" "))
			query = query.concat(",remarks = '" + projectObject.getRemarks() + "'");
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" "))
			query = query.concat(",scope_of_work = '" + projectObject.getScope_of_work()+"'");
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" "))
			query = query.concat(",sponsoring_agency = '" + projectObject.getSponsoring_agency()+ "'");
		if(projectObject.getState_system() != -1)
			query = query.concat(",state_system = " + projectObject.getState_system());
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" "))
			query = query.concat(",project_name = '" + projectObject.getProject_name() + "'");
		if(projectObject.getLimitFrom().getLatitude() != 1.0)
			query = query.concat(",limitFrom_latitude = " + projectObject.getLimitFrom().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitFrom_longitude =" + projectObject.getLimitFrom().getLongitude());
		if(projectObject.getLimitTo().getLatitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitTo().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitFrom().getLongitude());
		query.concat(";");
		//Begin proposed project exclusive fields
		String secondQuery = "UPDATE cs4311team9sp16.TRANSITFUNDEDPROJECT SET ";
		if(!projectObject.getTdc_award_amount().equals(" "))
			secondQuery = secondQuery.concat("tdc_award_amount = '" + projectObject.getTdc_award_amount() + "'");
		if(projectObject.getTdc_award_date() != null)
			secondQuery = secondQuery.concat(",tdc_award_date = '" + projectObject.getTdc_award_date() + "'");
		//if(!projectObject.getProject_id().equals(" "))
			//secondQuery = secondQuery.concat(",frproject_id = '" + projectObject.getProject_id() + "'");
		secondQuery.concat(";");
		String [] queries = {query,secondQuery};
		return queries;
	}
	public String [] editQueryBuilder(TransitProposedProject projectObject){
		String query = "UPDATE cs4311team9sp16.Projects SET ";
		if(projectObject.getAir_quality_analysis_co()!= null && !projectObject.getAir_quality_analysis_co().equals(" "))
			query = query.concat("air_quality_analysis_co = '"+ projectObject.getAir_quality_analysis_co()+"'");
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" "))
			query = query.concat(",air_quality_analysis_nox = '"+ projectObject.getAir_quality_analysis_nox()+"'");
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" "))
			query = query.concat(",air_quality_analysis_voc = '"+ projectObject.getAir_quality_analysis_voc()+"'");
		if(projectObject.getArea() != -1)
			query = query.concat(",area = " + projectObject.getArea()+",");
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false)
			query = query.concat(",capacity_project = " + projectObject.isCapacity_project());
		if(projectObject.getCity() != -1)
			query = query.concat(",city =" + projectObject.getCity());
		if(projectObject.getCounty() != -1)
			query = query.concat(",county = " + projectObject.getCounty());
		if(projectObject.getDistrict() != -1)
			query = query.concat(",district = " + projectObject.getDistrict());
		if(projectObject.getFederal_fiscal_year() != null)
			query = query.concat(",federal_fiscal_year = '" + projectObject.getFederal_fiscal_year() + "'");
		if(projectObject.getClassification() != -1)
			query = query.concat(",classification =" + projectObject.getClassification());
		if(projectObject.getFund_type() != -1)
			query = query.concat(",fund_type = " + projectObject.getFund_type());
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" "))
			query = query.concat(",nameOfHighwayorRoadway = '"+ projectObject.getNameOfHighwayorRoadway()+"'");
		if(projectObject.getNetwork_Year() != null)
			query = query.concat(",network_Year = '"+ projectObject.getNetwork_Year() +"'");
		if(projectObject.getNumber_of_existing_lanes() != -1)
			query = query.concat(",number_of_existing_lanes = "+ projectObject.getNumber_of_existing_lanes());
		if(projectObject.getNumber_of_miles() != -1)
			query = query.concat(",number_of_miles = " + projectObject.getNumber_of_miles());
		if(projectObject.getNumber_of_project_lanes() != -1)
			query = query.concat(",number_of_project_lanes = " + projectObject.getNumber_of_project_lanes());
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" "))
			query = query.concat(",project_description = '" + projectObject.getProject_description() + "'");
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" "))
			//query = query.concat(",project_id = '" + projectObject.getProject_id() + "'");
		if(projectObject.getIdentity() != -1)
			query = query.concat(",identity = " + projectObject.getIdentity());
		if(projectObject.getPhases() != -1)
			query = query.concat(",phases = " + projectObject.getPhases());
		if(projectObject.getType() != -1)
			query = query.concat(",type = " + projectObject.getType());
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" "))
			query = query.concat(",remarks = '" + projectObject.getRemarks() + "'");
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" "))
			query = query.concat(",scope_of_work = '" + projectObject.getScope_of_work()+"'");
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" "))
			query = query.concat(",sponsoring_agency = '" + projectObject.getSponsoring_agency()+ "'");
		if(projectObject.getState_system() != -1)
			query = query.concat(",state_system = " + projectObject.getState_system());
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" "))
			query = query.concat(",project_name = '" + projectObject.getProject_name() + "'");
		if(projectObject.getLimitFrom().getLatitude() != 1.0)
			query = query.concat(",limitFrom_latitude = " + projectObject.getLimitFrom().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitFrom_longitude =" + projectObject.getLimitFrom().getLongitude());
		if(projectObject.getLimitTo().getLatitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitTo().getLatitude());
		if(projectObject.getLimitFrom().getLongitude() != 1.0)
			query = query.concat(",limitTo_latitude = " + projectObject.getLimitFrom().getLongitude());
		query.concat(";");
		//Begin proposed project exclusive fields
		String secondQuery = "UPDATE cs4311team9sp16.TRANSITFUNDEDPROJECT SET ";
		if(projectObject.getApportionment_year() != null)
			secondQuery = secondQuery.concat("apportionment_year = '" + projectObject.getApportionment_year() + "'");
		if(!projectObject.getSection_5309ID().equals(" "))
			secondQuery = secondQuery.concat(",section_5309ID = '" + projectObject.getSection_5309ID() + "'");
		if(!projectObject.getTcd_amount_requested().equals(" "))
			secondQuery = secondQuery.concat(",tcd_amount_requested = '" + projectObject.getTcd_amount_requested() + "'");
		if(projectObject.getTptype() >= 0)
			secondQuery = secondQuery.concat(",tptype = '" + projectObject.getTcd_amount_requested() + "'");
		//if(!projectObject.getProject_id().equals(" "))
			//secondQuery = secondQuery.concat(",frproject_id = " + projectObject.getTptype());
		secondQuery.concat(";");
		String [] queries = {query,secondQuery};
		return queries;
	}
	
	public boolean editVerification(ProposedProject projectObject,ResultSet resultVerify, ResultSet secondVerify) throws SQLException{
		if(resultVerify != null){
		if(projectObject.getAir_quality_analysis_co() != null && !projectObject.getAir_quality_analysis_co().equals(" ") && !projectObject.getAir_quality_analysis_co().equals(resultVerify.getString(1)))
			return false;
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" ") && !projectObject.getAir_quality_analysis_nox().equals(resultVerify.getString(2)))
			return false;
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" ") && !projectObject.getAir_quality_analysis_voc().equals(resultVerify.getString(3)))
			return false;
		if(projectObject.getArea() != -1 && projectObject.getArea() != resultVerify.getInt(4))
			return false;
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false && (!projectObject.isCapacity_project() == resultVerify.getBoolean(5)))
			return false;
		if(projectObject.getCity() != -1 && projectObject.getCity() != resultVerify.getInt(6))
			return false;
		if(projectObject.getCounty() != -1 && projectObject.getCounty() != resultVerify.getInt(7))
			return false;
		if(projectObject.getDistrict() != -1 && projectObject.getDistrict() != resultVerify.getInt(8))
			return false;
		if(projectObject.getFederal_fiscal_year() != null && !projectObject.getFederal_fiscal_year().toString().equals(resultVerify.getDate(9).toString()))
			return false;
		if(projectObject.getClassification() != -1 && projectObject.getClassification() != resultVerify.getInt(10))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != resultVerify.getInt(11))
			return false;
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" ") && !projectObject.getNameOfHighwayorRoadway().equals(resultVerify.getString(12)))
			return false;
		if(projectObject.getNetwork_Year() != null && !projectObject.getNetwork_Year().toString().equals(resultVerify.getString(13).toString()))
			return false;
		if(projectObject.getNumber_of_existing_lanes() != -1 && projectObject.getNumber_of_existing_lanes() != resultVerify.getInt(14))
			return false;
		if(projectObject.getNumber_of_miles() != -1 && projectObject.getNumber_of_miles() != resultVerify.getInt(15))
			return false;
		if(projectObject.getNumber_of_project_lanes() != -1 && projectObject.getNumber_of_project_lanes() != resultVerify.getInt(16))
			return false;
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" ") && !projectObject.getProject_description().equals(resultVerify.getString(17)))
			return false;
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(resultVerify.getString(17)))
			//return false;
		if(projectObject.getIdentity() != -1 && projectObject.getIdentity() != resultVerify.getInt(18))
			return false;
		if(projectObject.getPhases() != -1 && projectObject.getPhases() != resultVerify.getInt(19))
			return false;
		if(projectObject.getType() != -1 && projectObject.getType() !=  resultVerify.getInt(20))
			return false;
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" ") && !projectObject.getRemarks().equals(resultVerify.getString(20)))
			return false;
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" ") && !projectObject.getScope_of_work().equals(resultVerify.getString(21)))
			return false;
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" ") && !projectObject.getSponsoring_agency().equals(resultVerify.getString(22)))
			return false;
		if(projectObject.getState_system() != -1 && projectObject.getState_system() != resultVerify.getInt(23))
			return false;
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" ") &&!projectObject.getProject_name().equals(resultVerify.getString(23)))
			return false;
		if(projectObject.getLimitFrom().getLatitude() != -1.0 && projectObject.getLimitFrom().getLatitude() != resultVerify.getDouble(24))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(25))
			return false;
		if(projectObject.getLimitTo().getLatitude() != -1.0 && projectObject.getLimitTo().getLatitude() != resultVerify.getDouble(26))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(27))
			return false;
		}
		//Begin proposed project exclusive fields
		if(secondVerify != null){
		//if(!projectObject.getApproved_project_id().equals(" ") && !projectObject.getApproved_project_id().equals(resultVerify.getString(27)))
			//return false;
		if(projectObject.getElement() != -1 && projectObject.getElement() != resultVerify.getInt(28))
			return false;
		if(projectObject.getWorkflow_status() != -1 && projectObject.getWorkflow_status() != resultVerify.getInt(29))
			return false;
		if(projectObject.getSubmission_deadline() != null && !projectObject.getSubmission_deadline().equals(resultVerify.getInt(30)))
			return false;
		if(!projectObject.getCn().equals(" ") && !projectObject.getCn().equals(secondVerify.getInt(1)))
			return false;
		if(!projectObject.getCsj().equals(" ") && !projectObject.getCsj().equals(secondVerify.getInt(2)))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != secondVerify.getInt(3))
			return false;
		if(!projectObject.getMpo_id().equals(" ") && !projectObject.getMpo_id().equals(secondVerify.getString(4)))
			return false;
		//if(!projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(secondVerify.getString(5)))
			//return false;
		//return true;
		}
		return true;
	}
	public boolean editVerification(FundedProject projectObject,ResultSet resultVerify, ResultSet secondVerify) throws SQLException{
		if(projectObject.getAir_quality_analysis_co() != null && !projectObject.getAir_quality_analysis_co().equals(" ") && !projectObject.getAir_quality_analysis_co().equals(resultVerify.getString(1)))
			return false;
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" ") && !projectObject.getAir_quality_analysis_nox().equals(resultVerify.getString(2)))
			return false;
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" ") && !projectObject.getAir_quality_analysis_voc().equals(resultVerify.getString(3)))
			return false;
		if(projectObject.getArea() != -1 && projectObject.getArea() != resultVerify.getInt(4))
			return false;
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false && (!projectObject.isCapacity_project() == resultVerify.getBoolean(5)))
			return false;
		if(projectObject.getCity() != -1 && projectObject.getCity() != resultVerify.getInt(6))
			return false;
		if(projectObject.getCounty() != -1 && projectObject.getCounty() != resultVerify.getInt(7))
			return false;
		if(projectObject.getDistrict() != -1 && projectObject.getDistrict() != resultVerify.getInt(8))
			return false;
		if(projectObject.getFederal_fiscal_year() != null && !projectObject.getFederal_fiscal_year().toString().equals(resultVerify.getDate(9).toString()))
			return false;
		if(projectObject.getClassification() != -1 && projectObject.getClassification() != resultVerify.getInt(10))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != resultVerify.getInt(11))
			return false;
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" ") && !projectObject.getNameOfHighwayorRoadway().equals(resultVerify.getString(12)))
			return false;
		if(projectObject.getNetwork_Year() != null && !projectObject.getNetwork_Year().toString().equals(resultVerify.getString(13).toString()))
			return false;
		if(projectObject.getNumber_of_existing_lanes() != -1 && projectObject.getNumber_of_existing_lanes() != resultVerify.getInt(14))
			return false;
		if(projectObject.getNumber_of_miles() != -1 && projectObject.getNumber_of_miles() != resultVerify.getInt(15))
			return false;
		if(projectObject.getNumber_of_project_lanes() != -1 && projectObject.getNumber_of_project_lanes() != resultVerify.getInt(16))
			return false;
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" ") && !projectObject.getProject_description().equals(resultVerify.getString(17)))
			return false;
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(resultVerify.getString(17)))
			//return false;
		if(projectObject.getIdentity() != -1 && projectObject.getIdentity() != resultVerify.getInt(18))
			return false;
		if(projectObject.getPhases() != -1 && projectObject.getPhases() != resultVerify.getInt(19))
			return false;
		if(projectObject.getType() != -1 && projectObject.getType() !=  resultVerify.getInt(20))
			return false;
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" ") && !projectObject.getRemarks().equals(resultVerify.getString(20)))
			return false;
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" ") && !projectObject.getScope_of_work().equals(resultVerify.getString(21)))
			return false;
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" ") && !projectObject.getSponsoring_agency().equals(resultVerify.getString(22)))
			return false;
		if(projectObject.getState_system() != -1 && projectObject.getState_system() != resultVerify.getInt(23))
			return false;
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" ") &&!projectObject.getProject_name().equals(resultVerify.getString(23)))
			return false;
		if(projectObject.getLimitFrom().getLatitude() != -1.0 && projectObject.getLimitFrom().getLatitude() != resultVerify.getDouble(24))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(25))
			return false;
		if(projectObject.getLimitTo().getLatitude() != -1.0 && projectObject.getLimitTo().getLatitude() != resultVerify.getDouble(26))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(27))
			return false;
		//Begin funded project exclusive fields
		if(projectObject.getDate() != null && !projectObject.getDate().toString().equals(secondVerify.getString(1)))
			return false;
		if(!projectObject.getTip_name().equals(" ") && projectObject.getTip_name().equals(secondVerify.getString(2)))
			return false;
		if(!projectObject.getTip_year().toString().equals(" ") && !projectObject.getTip_year().toString().equals(secondVerify.getString(3)))
			return false;
		//if(!projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(secondVerify.getString(4)))
			//return false;
		return true;
	}

	public boolean editVerification(SubmittedProject projectObject,ResultSet resultVerify, ResultSet secondVerify) throws SQLException{
		if(projectObject.getAir_quality_analysis_co() != null && !projectObject.getAir_quality_analysis_co().equals(" ") && !projectObject.getAir_quality_analysis_co().equals(resultVerify.getString(1)))
			return false;
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" ") && !projectObject.getAir_quality_analysis_nox().equals(resultVerify.getString(2)))
			return false;
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" ") && !projectObject.getAir_quality_analysis_voc().equals(resultVerify.getString(3)))
			return false;
		if(projectObject.getArea() != -1 && projectObject.getArea() != resultVerify.getInt(4))
			return false;
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false && (!projectObject.isCapacity_project() == resultVerify.getBoolean(5)))
			return false;
		if(projectObject.getCity() != -1 && projectObject.getCity() != resultVerify.getInt(6))
			return false;
		if(projectObject.getCounty() != -1 && projectObject.getCounty() != resultVerify.getInt(7))
			return false;
		if(projectObject.getDistrict() != -1 && projectObject.getDistrict() != resultVerify.getInt(8))
			return false;
		if(projectObject.getFederal_fiscal_year() != null && !projectObject.getFederal_fiscal_year().toString().equals(resultVerify.getDate(9).toString()))
			return false;
		if(projectObject.getClassification() != -1 && projectObject.getClassification() != resultVerify.getInt(10))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != resultVerify.getInt(11))
			return false;
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" ") && !projectObject.getNameOfHighwayorRoadway().equals(resultVerify.getString(12)))
			return false;
		if(projectObject.getNetwork_Year() != null && !projectObject.getNetwork_Year().toString().equals(resultVerify.getString(13).toString()))
			return false;
		if(projectObject.getNumber_of_existing_lanes() != -1 && projectObject.getNumber_of_existing_lanes() != resultVerify.getInt(14))
			return false;
		if(projectObject.getNumber_of_miles() != -1 && projectObject.getNumber_of_miles() != resultVerify.getInt(15))
			return false;
		if(projectObject.getNumber_of_project_lanes() != -1 && projectObject.getNumber_of_project_lanes() != resultVerify.getInt(16))
			return false;
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" ") && !projectObject.getProject_description().equals(resultVerify.getString(17)))
			return false;
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(resultVerify.getString(17)))
			//return false;
		if(projectObject.getIdentity() != -1 && projectObject.getIdentity() != resultVerify.getInt(18))
			return false;
		if(projectObject.getPhases() != -1 && projectObject.getPhases() != resultVerify.getInt(19))
			return false;
		if(projectObject.getType() != -1 && projectObject.getType() !=  resultVerify.getInt(20))
			return false;
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" ") && !projectObject.getRemarks().equals(resultVerify.getString(20)))
			return false;
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" ") && !projectObject.getScope_of_work().equals(resultVerify.getString(21)))
			return false;
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" ") && !projectObject.getSponsoring_agency().equals(resultVerify.getString(22)))
			return false;
		if(projectObject.getState_system() != -1 && projectObject.getState_system() != resultVerify.getInt(23))
			return false;
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" ") &&!projectObject.getProject_name().equals(resultVerify.getString(23)))
			return false;
		if(projectObject.getLimitFrom().getLatitude() != -1.0 && projectObject.getLimitFrom().getLatitude() != resultVerify.getDouble(24))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(25))
			return false;
		if(projectObject.getLimitTo().getLatitude() != -1.0 && projectObject.getLimitTo().getLatitude() != resultVerify.getDouble(26))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(27))
			return false;
		//Begin submitted project exclusive fields
		if(!projectObject.getTpb_approval().equals(" ") && projectObject.getTpb_approval().equals(secondVerify.getDouble(1)))
			return false;
		if(!projectObject.getFederal_approval().equals(" ") && projectObject.getFederal_approval().equals(secondVerify.getDouble(2)))
			return false;
		if(!projectObject.getState_approval().equals(" ") && projectObject.getState_approval().equals(secondVerify.getDouble(3)))
			return false;
		if(!projectObject.getSubmission_status().equals(" ") && projectObject.getSubmission_status().equals(secondVerify.getDouble(4)))
			return false;
		return true;
	}
	public boolean editVerification(TransitFundedProject projectObject,ResultSet resultVerify, ResultSet secondVerify) throws SQLException{
		if(projectObject.getAir_quality_analysis_co() != null && !projectObject.getAir_quality_analysis_co().equals(" ") && !projectObject.getAir_quality_analysis_co().equals(resultVerify.getString(1)))
			return false;
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" ") && !projectObject.getAir_quality_analysis_nox().equals(resultVerify.getString(2)))
			return false;
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" ") && !projectObject.getAir_quality_analysis_voc().equals(resultVerify.getString(3)))
			return false;
		if(projectObject.getArea() != -1 && projectObject.getArea() != resultVerify.getInt(4))
			return false;
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false && (!projectObject.isCapacity_project() == resultVerify.getBoolean(5)))
			return false;
		if(projectObject.getCity() != -1 && projectObject.getCity() != resultVerify.getInt(6))
			return false;
		if(projectObject.getCounty() != -1 && projectObject.getCounty() != resultVerify.getInt(7))
			return false;
		if(projectObject.getDistrict() != -1 && projectObject.getDistrict() != resultVerify.getInt(8))
			return false;
		if(projectObject.getFederal_fiscal_year() != null && !projectObject.getFederal_fiscal_year().toString().equals(resultVerify.getDate(9).toString()))
			return false;
		if(projectObject.getClassification() != -1 && projectObject.getClassification() != resultVerify.getInt(10))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != resultVerify.getInt(11))
			return false;
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" ") && !projectObject.getNameOfHighwayorRoadway().equals(resultVerify.getString(12)))
			return false;
		if(projectObject.getNetwork_Year() != null && !projectObject.getNetwork_Year().toString().equals(resultVerify.getString(13).toString()))
			return false;
		if(projectObject.getNumber_of_existing_lanes() != -1 && projectObject.getNumber_of_existing_lanes() != resultVerify.getInt(14))
			return false;
		if(projectObject.getNumber_of_miles() != -1 && projectObject.getNumber_of_miles() != resultVerify.getInt(15))
			return false;
		if(projectObject.getNumber_of_project_lanes() != -1 && projectObject.getNumber_of_project_lanes() != resultVerify.getInt(16))
			return false;
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" ") && !projectObject.getProject_description().equals(resultVerify.getString(17)))
			return false;
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(resultVerify.getString(17)))
			//return false;
		if(projectObject.getIdentity() != -1 && projectObject.getIdentity() != resultVerify.getInt(18))
			return false;
		if(projectObject.getPhases() != -1 && projectObject.getPhases() != resultVerify.getInt(19))
			return false;
		if(projectObject.getType() != -1 && projectObject.getType() !=  resultVerify.getInt(20))
			return false;
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" ") && !projectObject.getRemarks().equals(resultVerify.getString(20)))
			return false;
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" ") && !projectObject.getScope_of_work().equals(resultVerify.getString(21)))
			return false;
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" ") && !projectObject.getSponsoring_agency().equals(resultVerify.getString(22)))
			return false;
		if(projectObject.getState_system() != -1 && projectObject.getState_system() != resultVerify.getInt(23))
			return false;
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" ") &&!projectObject.getProject_name().equals(resultVerify.getString(23)))
			return false;
		if(projectObject.getLimitFrom().getLatitude() != -1.0 && projectObject.getLimitFrom().getLatitude() != resultVerify.getDouble(24))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(25))
			return false;
		if(projectObject.getLimitTo().getLatitude() != -1.0 && projectObject.getLimitTo().getLatitude() != resultVerify.getDouble(26))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(27))
			return false;
		//Begin transit funded project exclusive fields
		if(!projectObject.getTdc_award_amount().equals(" ") && !projectObject.getTdc_award_amount().equals(secondVerify.getString(1)))
			return false;
		if(projectObject.getTdc_award_date() != null && !projectObject.getTdc_award_date().toString().equals(secondVerify.getDate(2).toString()))
			return false;
		//if(!projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals((secondVerify.getString(3))))
			//return false;
		return true;
	}
	public boolean editVerification(TransitProposedProject projectObject,ResultSet resultVerify, ResultSet secondVerify) throws SQLException{
		if(projectObject.getAir_quality_analysis_co() != null && !projectObject.getAir_quality_analysis_co().equals(" ") && !projectObject.getAir_quality_analysis_co().equals(resultVerify.getString(1)))
			return false;
		if(projectObject.getAir_quality_analysis_nox() != null && !projectObject.getAir_quality_analysis_nox().equals(" ") && !projectObject.getAir_quality_analysis_nox().equals(resultVerify.getString(2)))
			return false;
		if(projectObject.getAir_quality_analysis_voc() != null && !projectObject.getAir_quality_analysis_voc().equals(" ") && !projectObject.getAir_quality_analysis_voc().equals(resultVerify.getString(3)))
			return false;
		if(projectObject.getArea() != -1 && projectObject.getArea() != resultVerify.getInt(4))
			return false;
		if(projectObject.isCapacity_project() == true || projectObject.isCapacity_project() == false && (!projectObject.isCapacity_project() == resultVerify.getBoolean(5)))
			return false;
		if(projectObject.getCity() != -1 && projectObject.getCity() != resultVerify.getInt(6))
			return false;
		if(projectObject.getCounty() != -1 && projectObject.getCounty() != resultVerify.getInt(7))
			return false;
		if(projectObject.getDistrict() != -1 && projectObject.getDistrict() != resultVerify.getInt(8))
			return false;
		if(projectObject.getFederal_fiscal_year() != null && !projectObject.getFederal_fiscal_year().toString().equals(resultVerify.getDate(9).toString()))
			return false;
		if(projectObject.getClassification() != -1 && projectObject.getClassification() != resultVerify.getInt(10))
			return false;
		if(projectObject.getFund_type() != -1 && projectObject.getFund_type() != resultVerify.getInt(11))
			return false;
		if(projectObject.getNameOfHighwayorRoadway() != null && !projectObject.getNameOfHighwayorRoadway().equals(" ") && !projectObject.getNameOfHighwayorRoadway().equals(resultVerify.getString(12)))
			return false;
		if(projectObject.getNetwork_Year() != null && !projectObject.getNetwork_Year().toString().equals(resultVerify.getString(13).toString()))
			return false;
		if(projectObject.getNumber_of_existing_lanes() != -1 && projectObject.getNumber_of_existing_lanes() != resultVerify.getInt(14))
			return false;
		if(projectObject.getNumber_of_miles() != -1 && projectObject.getNumber_of_miles() != resultVerify.getInt(15))
			return false;
		if(projectObject.getNumber_of_project_lanes() != -1 && projectObject.getNumber_of_project_lanes() != resultVerify.getInt(16))
			return false;
		if(projectObject.getProject_description() != null && !projectObject.getProject_description().equals(" ") && !projectObject.getProject_description().equals(resultVerify.getString(17)))
			return false;
		//if(projectObject.getProject_id() != null && !projectObject.getProject_id().equals(" ") && !projectObject.getProject_id().equals(resultVerify.getString(17)))
			//return false;
		if(projectObject.getIdentity() != -1 && projectObject.getIdentity() != resultVerify.getInt(18))
			return false;
		if(projectObject.getPhases() != -1 && projectObject.getPhases() != resultVerify.getInt(19))
			return false;
		if(projectObject.getType() != -1 && projectObject.getType() !=  resultVerify.getInt(20))
			return false;
		if(projectObject.getRemarks() != null && !projectObject.getRemarks().equals(" ") && !projectObject.getRemarks().equals(resultVerify.getString(20)))
			return false;
		if(projectObject.getScope_of_work() != null && !projectObject.getScope_of_work().equals(" ") && !projectObject.getScope_of_work().equals(resultVerify.getString(21)))
			return false;
		if(projectObject.getSponsoring_agency() != null && !projectObject.getSponsoring_agency().equals(" ") && !projectObject.getSponsoring_agency().equals(resultVerify.getString(22)))
			return false;
		if(projectObject.getState_system() != -1 && projectObject.getState_system() != resultVerify.getInt(23))
			return false;
		if(projectObject.getProject_name() != null && !projectObject.getProject_name().equals(" ") &&!projectObject.getProject_name().equals(resultVerify.getString(23)))
			return false;
		if(projectObject.getLimitFrom().getLatitude() != -1.0 && projectObject.getLimitFrom().getLatitude() != resultVerify.getDouble(24))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(25))
			return false;
		if(projectObject.getLimitTo().getLatitude() != -1.0 && projectObject.getLimitTo().getLatitude() != resultVerify.getDouble(26))
			return false;
		if(projectObject.getLimitFrom().getLongitude() != -1.0 && projectObject.getLimitFrom().getLongitude() != resultVerify.getDouble(27))
			return false;
		//Begin transit proposed project exclusive fields
		if(projectObject.getApportionment_year() != null && !projectObject.getApportionment_year().toString().equals(secondVerify.getDate(1).toString()))
			return false;
		if(!projectObject.getSection_5309ID().equals(" ") && !projectObject.getSection_5309ID().equals(secondVerify.getString(2)))
			return false;
		if(!projectObject.getTcd_amount_requested().equals(" ") && !projectObject.getTcd_amount_requested().equals(secondVerify.getString(3)))
			return false;
		//if(!projectObject.getProject_id().equals(" "))
			//return false;
		return true;
	}
}
