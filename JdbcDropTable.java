import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDropTable {

	public static void main(String[] args) throws Exception{
		
	
	
	String dclass="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/student";
	String USER="root";
	String PASS="root";
	Class.forName(dclass); 
try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		
		) {		
	
	
	String sql = "DROP TABLE REGISTRATION";
    stmt.executeUpdate(sql);

  	  
 } catch (SQLException e) {
    e.printStackTrace();
 } 

}

}

