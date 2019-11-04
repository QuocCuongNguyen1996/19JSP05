package jsp05.cuong.connect;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	public static Connection myConnect = null;
	public static Statement myStatement = null;
	public static ResultSet myResultset = null;
	public Connect() {
		try {
			myConnect = DriverManager.getConnection("jdbc:mysql://localhost:8889/News", "root", "Trang929670!");
			myStatement = myConnect.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
