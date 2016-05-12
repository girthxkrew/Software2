package Project;

import java.sql.Date;

public class Project {

	private String air_quality_analysis_co;

	private String air_quality_analysis_nox;

	private String air_quality_analysis_voc;

	private String Area [] = {
		"Regional", "West", "Northeast", "Central", "East", "Mission", "Lower_Valley", "New_Mexico"
	};

	private int area;
	
	private int capacity_project;

	public String City [] =  {
		"Anthony_NM", "Anthony_TX", "Butterfield", "Canutillo", "Chaparral", 
		"Clint", "El_Paso", "Fabens", "Fort_Bliss", "Homestead_Meadows_North", 
		"Homestead_Meadows_South", "Horizon_City", "La_Union_NM", "San_Elizario", 
		"Santa_Teresa", "Socorro", "Sparks", "Sunland_Park", "Tornillo", "Vinton", "Westway"
	};

	private int city;

	private String County[] = {
		"El_Paso", "Dona_Ana"
	};

	private int county;

	private String Dot_District[] = {
		"Texas_District_24", "NM_DISTRICT_1", "NM_DISTRICT_2"
	};

	private int district;

	private Date federal_fiscal_year;

	private String Federal_Functional_Classifications[] = {
		"Local", "Collector", "Minor_Arterial", "Principal_Arterial", "Major_Arterial",
		"Interstate", "Freeway", "Expressway", "Miscellaneous", "Landscape", "Signals", 
		"Transit", "Enhancements", "Bridge", "Border_Crossings", "Rehabilitation", 
		"Financial", "Other", "Operations_and_Planning", "Rail", "Study", "Preliminary", 
		"Engineering", "Change_Order", "_5307_Ops_Planning", "_5339_Ops_Planning", "Bus_Purchase" , "Developer"
	};
	
	private int classification;
	
	private String Fund_Project_Type [] = {"Highway", "Roadway", "Transit"};
	
	private int fund_type;
	
	private String nameOfHighwayorRoadway;
	
	private Coordinate limitTo;
	
	private Coordinate limitFrom;

	private Date network_Year;
	
	private int number_of_existing_lanes;
	
	private double number_of_miles;
	
	private int number_of_project_lanes;
	
	private String project_description;
	
	private String project_id;
	
	private String Project_Phase_Identity[] = {"Phase_1", "Phase_2", "Phase_3", "No_additional_phase"};
	
	private int identity;
	
	private String Project_Phases[] = {"Construction", "Pre_Engineering", "Right_of_Way", "Construction_and_Pre_Engineering",
		"Construction_and_Right_of_Way", "Construction_Engineering_and_Right_of_Way", "Engineering_and_Right_of_Way",
		"FHWA_to_FTA_Transfer", "Non_Construction", "Environmental_Document", "Right_of_Way_Acquired", "Right_of_Way_Utilities_Completed"};
	
	private int phases;
	
	private String Project_Type[] = {
		"Additional_lanes", "Administration", "Bike", "Bikeway", "Border_crossing_operations", 
		"Bridge", "Bus_purchase", "Bus_service", "Capital", "Change_Order", "Developer", "Design", 
		"Enhancements", "Financial", "Freeway", "Expressway", "Improvements", "Intelligent_Transportation_Systems", 
		"Intermodal", "Interstates", "Landscape", "Minor_Arterial", "Miscellaneous", "Multimodal", "New_road", 
		"Operating, Operations_and_planning", "Pedestrian, Other", "Port_of_entry", "Principal_Arterial", 
		"Major_Arterial", "Rail", "Rehabilitation", "Right_of_Way", "Roadway_operations", "Safety", "Signals", 
		"Study", "Transit", "Transit_operations", "Transit_programs", "Transit_terminal"
	};
	
	private int type;
	
	private String remarks;
	
	private String scope_of_work;
	
	private String sponsoring_agency;
	
	private String project_name;
	
	private String State_System_Road[] = {"ON_STATE_SYSTEM_ROAD", "OFF_STATE_SYSTEM_ROAD", "ON_OFF_STATE_SYSTEM_ROAD"};
	
	private int state_system;
	
	public Project()
	{
		this.air_quality_analysis_co = " ";
		this.air_quality_analysis_nox = " ";
		this.air_quality_analysis_voc = " ";
		this.capacity_project = 0;
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
		this.area = 0;
		this.city = 0;
		this.classification = 0;
		this.county = 0;
		this.district = 0;
		this.fund_type = 0;
		this.identity = 0;
		this.phases = 0;
		this.state_system = 0;
		this.type = 0;
		
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getCapacity_project() {
		return capacity_project;
	}

	public void setCapacity_project(int capacity_project) {
		this.capacity_project = capacity_project;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getCounty() {
		return county;
	}

	public void setCounty(int county) {
		this.county = county;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public Date getFederal_fiscal_year() {
		return federal_fiscal_year;
	}

	public void setFederal_fiscal_year(Date federal_fiscal_year) {
		this.federal_fiscal_year = federal_fiscal_year;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public int getFund_type() {
		return fund_type;
	}

	public void setFund_type(int fund_type) {
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

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public int getPhases() {
		return phases;
	}

	public void setPhases(int phases) {
		this.phases = phases;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
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

	public int getState_system() {
		return state_system;
	}

	public void setState_system(int state_system) {
		this.state_system = state_system;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	
	public int indexOf (String[] array, int indexToFind, String toFind)
	{
		for (int i = 0; i < array.length; i++) {
			if(array[i].matches(toFind))
			{
				indexToFind = i;
			}
		}
		return indexToFind;
	}
	public String[] getAreaArray(){
		return Area;
	}
	public String[] getCountyArray(){
		return County;
	}
	public String[] getDotDistrictArray(){
		return Dot_District;
	}
	public String[] getFederalFunctionalClassificationsArray(){
		return Federal_Functional_Classifications;
	}
	public String[] getProjectPhaseIdentityArray(){
		return Project_Phase_Identity;
	}
	public String[] getProjectPhasesArray(){
		return Project_Phases;
	}
	public String[] getFundProjectTypeArray(){
		return Fund_Project_Type;
	}
	public String[] getProjectTypeArray(){
		return Project_Type;
	}
	public String[] getStateSystemRoad(){
		return State_System_Road;
	}
}
