
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass2 {

	public static void main(String[] args) throws Exception{
		
	
	
	String dclass="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/student";
	String USER="root";
	String PASS="root";
	Class.forName(dclass); 
	
	try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
		// Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   
	         //System.out.println("Created table in given database...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	
}

}
