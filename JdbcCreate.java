
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCreate {

	public static void main(String[] args) throws Exception{
		
	
	
	String dclass="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/student";
	String USER="root";
	String PASS="root";
	Class.forName(dclass); 
	
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		          String sql = "CREATE TABLE REGISTRATION " +
		                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 

		         stmt.executeUpdate(sql);
		         System.out.println("Created table in given database...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
	}

}