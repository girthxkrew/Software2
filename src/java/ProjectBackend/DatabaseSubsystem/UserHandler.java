/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBackend.DatabaseSubsystem;

/**
 *
 * @author Jose
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import ProjectBackend.UserSubsystem.*;

public class UserHandler extends Handler{
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
	public boolean create(MPOLeadUser userObject){
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
	public boolean create(MPOStaff userObject){
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
	public boolean edit(Object object){
		Admin userObject = (Admin)(object);
		Connection conn = requestConnection("admin");
		Statement editStmt;
		Boolean result = false;
		ResultSet resultVerify;
		String sql = editQueryBuilder(userObject);
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
	public boolean delete(RegisteredUser userObject){
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
	public String editQueryBuilder(Object object){
		Admin userObject = (Admin)(object);
		String query = "UPDATE cs4311team9sp16.Users SET ";
		if(!userObject.getFirstName().isEmpty() && userObject.getFirstName() != null)
			query = query.concat("FirstName = '"+ userObject.getFirstName()+"',");
		if(!userObject.getLastName().isEmpty() && userObject.getLastName() != null)
			query = query.concat("LastName = '"+ userObject.getLastName()+"',");
		if(!userObject.getPassword().isEmpty() && userObject.getPassword() != null)
			query = query.concat("Password= '"+ userObject.getPassword()+"'");
		query.concat(";");
		return query;
	}
	public Admin view(Admin userObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet results;
		String sql = "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		results = getStmt.executeQuery(sql);
		results.next();
		userObject.setFirstName(results.getString(1));
		userObject.setLastName(results.getString(2));
		userObject.setPassword(results.getString(4));
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return userObject;
		}
		return userObject;
	}
	public MPOStaff view(MPOStaff userObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet results;
		String sql = "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		results = getStmt.executeQuery(sql);
		results.next();
		userObject.setFirstName(results.getString(1));
		userObject.setLastName(results.getString(2));
		userObject.setPassword(results.getString(4));
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return userObject;
		}
		return userObject;
	}
	public MPOLeadUser view(MPOLeadUser userObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet results;
		String sql = "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		results = getStmt.executeQuery(sql);
		results.next();
		userObject.setFirstName(results.getString(1));
		userObject.setLastName(results.getString(2));
		userObject.setPassword(results.getString(4));
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return userObject;
		}
		return userObject;
	}
	public ProjectLead view(ProjectLead userObject){
		Connection conn = requestConnection("admin");
		Statement getStmt;
		ResultSet results;
		String sql = "SELECT * FROM cs4311team9sp16.Users WHERE Username='"+ userObject.getUsername()+"';";
		try{
		getStmt = conn.createStatement();
		getStmt.execute(sql);
		results = getStmt.executeQuery(sql);
		results.next();
		userObject.setFirstName(results.getString(1));
		userObject.setLastName(results.getString(2));
		userObject.setPassword(results.getString(4));
		conn.close();
		}
		catch(Exception sqlErr){
			System.out.println("SQL Error: " + sqlErr);
			return userObject;
		}
		return userObject;
	}
}