package Database;
import java.sql.Connection;

public abstract class Handler {
	public Connection requestConnection(String userType){
		DBConnector connector = new DBConnector();
		Connection conn = connector.connect(userType);
		return conn;
	}
}
