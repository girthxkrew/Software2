package MPO;

public class Admin extends User{
	private String username;
	private String password;
	public Admin(String fname, String lname,String username,String password){
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
	public void createUserAccount(){
		
	}
	public void editUserAccount(){
		
	}
	public void deleteUserAccount(){
		
	}
}
