package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Project.ProposedProject;

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
				+ projectObject.getCapacity_project() + ", "
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
		String sqlVerify =  "SELECT * FROM cs4311team9sp16.Projects WHERE air_quality_analysis_co='"+ projectObject.getAir_quality_analysis_co()+"';"; 
		try{
			createStmt = conn.createStatement();
			createStmt.execute(sql);
			resultVerify = createStmt.executeQuery(sqlVerify);
			resultVerify.next();
			if(resultVerify.getString(1).equals(projectObject.getAir_quality_analysis_co())
				&& resultVerify.getString(2).equals(projectObject.getAir_quality_analysis_nox())
				&& resultVerify.getString(3).equals(projectObject.getAir_quality_analysis_voc())
				&& resultVerify.getInt(4) == (projectObject.getArea())
				&& resultVerify.getInt(5) == (projectObject.getCapacity_project())
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
			conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
		}
		
		return result;
	}
	

}
