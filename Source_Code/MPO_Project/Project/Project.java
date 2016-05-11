package Project;

import java.sql.Date;

public class Project {

	private String air_quality_analysis_co;

	private String air_quality_analysis_nox;

	private String air_quality_analysis_voc;

	private enum Area {
		Regional, West, Northeast, Central, East, Mission, Lower_Valley, New_Mexico
	};

	private Area area;
	
	private boolean capacity_project;

	private enum City {
		Anthony_NM, Anthony_TX, Butterfield, Canutillo, Chaparral, 
		Clint, El_Paso, Fabens, Fort_Bliss, Homestead_Meadows_North, 
		Homestead_Meadows_South, Horizon_City, La_Union_NM, San_Elizario, 
		Santa_Teresa, Socorro, Sparks, Sunland_Park, Tornillo, Vinton, Westway
	};

	private City city;

	private enum County {
		El_Paso, Dona_Ana
	};

	private County county;

	private enum Dot_District {
		Texas_District_24, NM_DISTRICT_1, NM_DISTRICT_2
	};

	private Dot_District district;

	private Date federal_fiscal_year;

	private enum Federal_Functional_Classifications {
		Local, Collector, Minor_Arterial, Principal_Arterial, Major_Arterial,
		Interstate, Freeway, Expressway, Miscellaneous, Landscape, Signals, 
		Transit, Enhancements, Bridge, Border_Crossings, Rehabilitation, 
		Financial, Other, Operations_and_Planning, Rail, Study, Preliminary, 
		Engineering, Change_Order, _5307_Ops_Planning, _5339_Ops_Planning, Bus_Purchase, Developer
	};
	
	private Federal_Functional_Classifications classification;
	
	private enum Fund_Project_Type {Highway, Roadway, Transit};
	
	private Fund_Project_Type fund_type;
	
	private String nameOfHighwayorRoadway;
	
	private Coordinate limitTo;
	
	private Coordinate limitFrom;

	private Date network_Year;
	
	private int number_of_existing_lanes;
	
	private double number_of_miles;
	
	private int number_of_project_lanes;
	
	private String project_description;
	
	private String project_id;
	
	private enum Project_Phase_Identity {Phase_1, Phase_2, Phase_3, No_additional_phase};
	
	private Project_Phase_Identity identity;
	
	private enum Project_Phases {Construction, Pre_Engineering, Right_of_Way, Construction_and_Pre_Engineering,
		Construction_and_Right_of_Way, Construction_Engineering_and_Right_of_Way, Engineering_and_Right_of_Way,
		FHWA_to_FTA_Transfer, Non_Construction, Environmental_Document, Right_of_Way_Acquired, Right_of_Way_Utilities_Completed};
	
	private Project_Phases phases;
	
	private enum Project_Type {
		Additional_lanes, Administration, Bike, Bikeway, Border_crossing_operations, 
		Bridge, Bus_purchase, Bus_service, Capital, Change_Order, Developer, Design, 
		Enhancements, Financial, Freeway, Expressway, Improvements, Intelligent_Transportation_Systems, 
		Intermodal, Interstates, Landscape, Minor_Arterial, Miscellaneous, Multimodal, New_road, 
		Operating, Operations_and_planning, Pedestrian, Other, Port_of_entry, Principal_Arterial, 
		Major_Arterial, Rail, Rehabilitation, Right_of_Way, Roadway_operations, Safety, Signals, 
		Study, Transit, Transit_operations, Transit_programs, Transit_terminal
	};
	
	private Project_Type type;
	
	private String remarks;
	
	private String scope_of_work;
	
	private String sponsoring_agency;
	
	private String project_name;
	
	private enum State_System_Road {ON_STATE_SYSTEM_ROAD, OFF_STATE_SYSTEM_ROAD, ON_OFF_STATE_SYSTEM_ROAD};
	
	private State_System_Road state_system;
	
	public Project()
	{
		this.air_quality_analysis_co = " ";
		this.air_quality_analysis_nox = " ";
		this.air_quality_analysis_voc = " ";
		this.capacity_project = false;
		this.limitFrom = new Coordinate();
		this.limitTo = new Coordinate();
		this.nameOfHighwayorRoadway = " ";
		this.number_of_existing_lanes = 0;
		this.number_of_miles = 0;
		this.number_of_project_lanes = 0;
		this.project_description = " ";
		this.project_id = " ";
		this.remarks = " ";
		this.scope_of_work = " ";
		this.sponsoring_agency = " ";
		
	}
	
	public String getAir_quality_analysis_co() {
		return air_quality_analysis_co;
	}

	public void setAir_quality_analysis_co(String air_quality_analysis_co) {
		this.air_quality_analysis_co = air_quality_analysis_co;
	}

	public String getAir_quality_analysis_nox() {
		return air_quality_analysis_nox;
	}

	public void setAir_quality_analysis_nox(String air_quality_analysis_nox) {
		this.air_quality_analysis_nox = air_quality_analysis_nox;
	}

	public String getAir_quality_analysis_voc() {
		return air_quality_analysis_voc;
	}

	public void setAir_quality_analysis_voc(String air_quality_analysis_voc) {
		this.air_quality_analysis_voc = air_quality_analysis_voc;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public boolean isCapacity_project() {
		return capacity_project;
	}

	public void setCapacity_project(boolean capacity_project) {
		this.capacity_project = capacity_project;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	public Dot_District getDistrict() {
		return district;
	}

	public void setDistrict(Dot_District district) {
		this.district = district;
	}

	public Date getFederal_fiscal_year() {
		return federal_fiscal_year;
	}

	public void setFederal_fiscal_year(Date federal_fiscal_year) {
		this.federal_fiscal_year = federal_fiscal_year;
	}

	public Federal_Functional_Classifications getClassification() {
		return classification;
	}

	public void setClassification(Federal_Functional_Classifications classification) {
		this.classification = classification;
	}

	public Fund_Project_Type getFund_type() {
		return fund_type;
	}

	public void setFund_type(Fund_Project_Type fund_type) {
		this.fund_type = fund_type;
	}

	public String getNameOfHighwayorRoadway() {
		return nameOfHighwayorRoadway;
	}

	public void setNameOfHighwayorRoadway(String nameOfHighwayorRoadway) {
		this.nameOfHighwayorRoadway = nameOfHighwayorRoadway;
	}

	public Coordinate getLimitTo() {
		return limitTo;
	}

	public void setLimitTo(Coordinate limitTo) {
		this.limitTo = limitTo;
	}

	public Coordinate getLimitFrom() {
		return limitFrom;
	}

	public void setLimitFrom(Coordinate limitFrom) {
		this.limitFrom = limitFrom;
	}

	public Date getNetwork_Year() {
		return network_Year;
	}

	public void setNetwork_Year(Date network_Year) {
		this.network_Year = network_Year;
	}

	public int getNumber_of_existing_lanes() {
		return number_of_existing_lanes;
	}

	public void setNumber_of_existing_lanes(int number_of_existing_lanes) {
		this.number_of_existing_lanes = number_of_existing_lanes;
	}

	public double getNumber_of_miles() {
		return number_of_miles;
	}

	public void setNumber_of_miles(double number_of_miles) {
		this.number_of_miles = number_of_miles;
	}

	public int getNumber_of_project_lanes() {
		return number_of_project_lanes;
	}

	public void setNumber_of_project_lanes(int number_of_project_lanes) {
		this.number_of_project_lanes = number_of_project_lanes;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public Project_Phase_Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Project_Phase_Identity identity) {
		this.identity = identity;
	}

	public Project_Phases getPhases() {
		return phases;
	}

	public void setPhases(Project_Phases phases) {
		this.phases = phases;
	}

	public Project_Type getType() {
		return type;
	}

	public void setType(Project_Type type) {
		this.type = type;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getScope_of_work() {
		return scope_of_work;
	}

	public void setScope_of_work(String scope_of_work) {
		this.scope_of_work = scope_of_work;
	}

	public String getSponsoring_agency() {
		return sponsoring_agency;
	}

	public void setSponsoring_agency(String sponsoring_agency) {
		this.sponsoring_agency = sponsoring_agency;
	}

	public State_System_Road getState_system() {
		return state_system;
	}

	public void setState_system(State_System_Road state_system) {
		this.state_system = state_system;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	
	
	
	
}
