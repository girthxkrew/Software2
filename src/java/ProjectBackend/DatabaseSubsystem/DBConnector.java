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
import java.sql.*;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
public class DBConnector {
	public Connection connect(String userType) { //Class intended to return a connection to the MPO database.
		String username;
		String password;
		String host = "earth.cs.utep.edu";
		String dbName = "cs4311team9sp16";
		Connection conn = null;
		
		String [] credentials = credentialProvider(userType);
		username = credentials[0];
		password = credentials[1];
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setServerName(host);
		dataSource.setDatabaseName(dbName);
		dataSource.setPort(3306);
		try{
			conn = dataSource.getConnection();
		}
		catch(SQLException s){
			System.out.println("SQL Error: " + s);
		}
		return conn;
	}
	public String [] credentialProvider(String userType){ //Method used to provide the credentials based on user request
		switch(userType){
		case("mpoStaff"):
			return new String [] {"mpoStaff","Just@notherMPO!"};
		case("mpoLead"):
			return new String [] {"mpoLead","ItstimetoLe@d!"};
		case("projectLead"):
			return new String [] {"projectLead","!Projecttime!"};
		case("admin"):
			return new String [] {"cs4311team9sp16","cs4311!cs4311team9sp16"};
		default:
			return new String [] {"guest","LetmevisitMPO!"};
		}
	}

}