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

public abstract class Handler {
	public Connection requestConnection(String userType){
		DBConnector connector = new DBConnector();
		Connection conn = connector.connect(userType);
		return conn;
	}
}