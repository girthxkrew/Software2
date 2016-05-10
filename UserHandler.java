package MPO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserHandler extends Handler{
	public boolean edit(Admin userObject){
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.Users SET FirstName = '" + userObject.getFirstName()+"', LastName = '"+ userObject.getLastName()+"', Username = '"+ userObject.getUsername()+"',Password = '"+ userObject.getPassword()+"'WHERE FirstName='"+ userObject.getFirstName()+"' AND LastName='"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		
		try{
		editStmt = conn.createStatement();
		editStmt.execute(sql);
		resultVerify = editStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getString(1).equals(userObject.getFirstName()) && resultVerify.getString(2).equals(userObject.getLastName()) && resultVerify.getString(3).equals(userObject.getUsername()) && resultVerify.getString(4).equals(userObject.getPassword()))
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(MpoLead userObject){
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.Users SET FirstName = '" + userObject.getFirstName()+"', LastName = '"+ userObject.getLastName()+"', Username = '"+ userObject.getUsername()+"',Password = '"+ userObject.getPassword()+"'WHERE FirstName='"+ userObject.getFirstName()+"' AND LastName='"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		try{
		editStmt = conn.createStatement();
		editStmt.execute(sql);
		resultVerify = editStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getString(1).equals(userObject.getFirstName()) && resultVerify.getString(2).equals(userObject.getLastName()) && resultVerify.getString(3).equals(userObject.getUsername()) && resultVerify.getString(4).equals(userObject.getPassword()))
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(MpoStaff userObject){
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.Users SET FirstName = '" + userObject.getFirstName()+"', LastName = '"+ userObject.getLastName()+"', Username = '"+ userObject.getUsername()+"',Password = '"+ userObject.getPassword()+"'WHERE FirstName='"+ userObject.getFirstName()+"' AND LastName='"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		try{
		editStmt = conn.createStatement();
		editStmt.execute(sql);
		resultVerify = editStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getString(1).equals(userObject.getFirstName()) && resultVerify.getString(2).equals(userObject.getLastName()) && resultVerify.getString(3).equals(userObject.getUsername()) && resultVerify.getString(4).equals(userObject.getPassword()))
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean edit(ProjectLead userObject){
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "UPDATE cs4311team9sp16.Users SET FirstName = '" + userObject.getFirstName()+"', LastName = '"+ userObject.getLastName()+"', Username = '"+ userObject.getUsername()+"',Password = '"+ userObject.getPassword()+"'WHERE FirstName='"+ userObject.getFirstName()+"' AND LastName='"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		try{
		editStmt = conn.createStatement();
		editStmt.execute(sql);
		resultVerify = editStmt.executeQuery(sqlVerify);
		resultVerify.next();
		if(resultVerify.getString(1).equals(userObject.getFirstName()) && resultVerify.getString(2).equals(userObject.getLastName()) && resultVerify.getString(3).equals(userObject.getUsername()) && resultVerify.getString(4).equals(userObject.getPassword()))
			result = true;
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return false;
		}
		return result;
	}
	public boolean create(Admin userObject){
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Users VALUES ('" + userObject.getFirstName()+"', '" + userObject.getLastName()+"', '" + userObject.getUsername()+"', '" + userObject.getPassword()+"',False,False, False,False, False, True, True, True,False,False,False,False,False,True,True,True);";
		String sqlVerify = "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
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
		}
		return result;
	}
	public boolean create(MpoLead userObject){
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Users VALUES ('" + userObject.getFirstName()+"', '" + userObject.getLastName()+"', '" + userObject.getUsername()+"', '" + userObject.getPassword()+"',False,False,False,True,True,True,True,True,True,True,True,True,True,True,True,True);";
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
		}
		return result;
	}
	public boolean create(MpoStaff userObject){
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Users VALUES ('" + userObject.getFirstName()+"', '" + userObject.getLastName()+"', '" + userObject.getUsername()+"', '" + userObject.getPassword()+"',False,False, False,True, False,False,False,False,True,True,True,True,True,True,True, True);";
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
		}
		return result;
	}
	public boolean create(ProjectLead userObject){
		Connection conn = requestConnection("admin");
		Statement createStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "INSERT INTO cs4311team9sp16.Users VALUES ('" + userObject.getFirstName()+"', '" + userObject.getLastName()+"', '" + userObject.getUsername()+"', '" + userObject.getPassword()+"',True,True,True,False, False, False,False,False,False,False,False,False,True,True,True, True);";
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
		}
		return result;
	}
	public boolean delete(Admin userObject){
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Users WHERE FirstName = '"+ userObject.getFirstName()+"' AND LastName = '"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
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
	public boolean delete(MpoLead userObject){
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Users WHERE FirstName = '"+ userObject.getFirstName()+"' AND LastName = '"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
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
	public boolean delete(MpoStaff userObject){
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Users WHERE FirstName = '"+ userObject.getFirstName()+"' AND LastName = '"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
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
	public boolean delete(ProjectLead userObject){
		Connection conn = requestConnection("admin");
		Statement deleteStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = "DELETE FROM cs4311team9sp16.Users WHERE FirstName = '"+ userObject.getFirstName()+"' AND LastName = '"+ userObject.getLastName()+"';";
		String sqlVerify = "SELECT FirstName, LastName, Username, Password FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';"; 
		
		try{
		deleteStmt = conn.createStatement();
		deleteStmt.execute(sql);
		resultVerify = deleteStmt.executeQuery(sqlVerify);
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
	public String editQueryBuilder(Admin userObject){
		String query = "UPDATE cs4311team9sp16.Users SET ";
		if(!userObject.getFirstName().isEmpty())
			query = query.concat("FirstName = '"+ userObject.getFirstName()+"'");
		if(!userObject.getLastName().isEmpty())
			query = query.concat("LastName = '"+ userObject.getLastName()+"'");
		if(!userObject.getPassword().isEmpty())
			query = query.concat("Password= '"+ userObject.getPassword()+"'");
		query.concat(";");
		return query;
	}
	public String editQueryBuilder(MpoLead userObject){
		String query = "UPDATE cs4311team9sp16.Users SET ";
		if(!userObject.getFirstName().isEmpty())
			query = query.concat("FirstName = '"+ userObject.getFirstName()+"'");
		if(!userObject.getLastName().isEmpty())
			query = query.concat("LastName = '"+ userObject.getLastName()+"'");
		if(!userObject.getPassword().isEmpty())
			query = query.concat("Password= '"+ userObject.getPassword()+"'");
		query.concat(";");
		return query;
	}
	public String editQueryBuilder(MpoStaff userObject){
		String query = "UPDATE cs4311team9sp16.Users SET ";
		if(!userObject.getFirstName().isEmpty())
			query = query.concat("FirstName = '"+ userObject.getFirstName()+"'");
		if(!userObject.getLastName().isEmpty())
			query = query.concat("LastName = '"+ userObject.getLastName()+"'");
		if(!userObject.getPassword().isEmpty())
			query = query.concat("Password= '"+ userObject.getPassword()+"'");
		query.concat(";");
		return query;
	}
	public String editQueryBuilder(ProjectLead userObject){
		String query = "UPDATE cs4311team9sp16.Users SET ";
		if(!userObject.getFirstName().isEmpty())
			query = query.concat("FirstName = '"+ userObject.getFirstName()+"'");
		if(!userObject.getLastName().isEmpty())
			query = query.concat("LastName = '"+ userObject.getLastName()+"'");
		if(!userObject.getPassword().isEmpty())
			query = query.concat("Password= '"+ userObject.getPassword()+"'");
		query.concat(";");
		return query;
	}
}
