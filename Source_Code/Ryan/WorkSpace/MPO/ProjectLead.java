package MPO;
import Project.ProposedProject;
import Project.TransitProposedProject;

public class ProjectLead extends User{
	private String username;
	private String password;
	public ProjectLead(String fname, String lname,String username,String password){
		this.setFirstName(fname);
		this.setLastName(lname);
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void createProject(ProposedProject project)
	{
		
	}
	public void createTransitProject(TransitProposedProject project)
	{
		
	}

}
