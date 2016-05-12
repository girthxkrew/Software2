package MPO;
import Project.*;
import java.sql.*;
import java.util.Calendar;

import Database.ProjectHandler;

public class TESTOFTESTERS {

	public static void main(String[] args) {
					ProposedProject projectObject = new ProposedProject();
					//long time = System.currentTimeMillis();
					//java.sql.Date date = new java.sql.Date(time);
					Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
					System.out.println(date);
		 			projectObject.setAir_quality_analysis_co("test");
		 			projectObject.setAir_quality_analysis_nox("test");
					projectObject.setAir_quality_analysis_voc("test");
					projectObject.setArea(2);
					projectObject.setCapacity_project(0);
					projectObject.setCity(2);
					projectObject.setCounty(2);
					projectObject.setDistrict(2);
					projectObject.setFederal_fiscal_year(date);
					projectObject.setClassification(2);
					projectObject.setFund_type(2);
					projectObject.setNameOfHighwayorRoadway("test");
					projectObject.setNetwork_Year(date) ;
					projectObject.setNumber_of_existing_lanes(5);
					projectObject.setNumber_of_miles(5);
					projectObject.setNumber_of_project_lanes(5);
					projectObject.setProject_description("Got that swag son");
					projectObject.setProject_id("test");
					projectObject.setIdentity(3);
					projectObject.setPhases(3);
					projectObject.setType(3);
					projectObject.setRemarks("Got that swag son");
					projectObject.setScope_of_work("Potato");
					projectObject.setSponsoring_agency("Potato");
					projectObject.setState_system(4);
					projectObject.setProject_name("Get Wrekt Son");
					projectObject.getLimitFrom().setLatitude(23.3);
					projectObject.getLimitFrom().setLongitude(23.3);
					projectObject.getLimitTo().setLatitude(23.3);
					projectObject.getLimitTo().setLongitude(23.3);
					
					projectObject.setApproved_project_id("test");
					projectObject.setElement(12);
					projectObject.setSubmission_deadline(date);
					projectObject.setWorkflow_status(3);
					projectObject.setCn("12");
					projectObject.setCsj("14");
					projectObject.setFund_type(13);
					projectObject.setMpo_id("123");
					projectObject.setPro_lead_id("124345");
					ProjectHandler h = new ProjectHandler();
					boolean swag = h.create(projectObject);
					System.out.print(swag);
					

	}

}
