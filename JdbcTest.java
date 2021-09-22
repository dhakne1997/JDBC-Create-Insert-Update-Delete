

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String args[])
	{
		try{  
		Class.forName("com.mysql.jdbc.Driver"); 
		
		System.out.println("Driver loaded...");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
					
		System.out.println("Finally connected successfully...");
		Statement stmt=con.createStatement();
		String sql=("insert into student values('Akshay',3,'Shirampur',500000.00)");
				stmt.executeUpdate(sql);
				
				String sql1="update student set address='Ahmadpur' where id=1";
				stmt.executeUpdate(sql1);
		String q="select * from student";
		ResultSet rs=stmt.executeQuery(q);
		
		if(rs.next())
		{
			do
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+ rs.getFloat(4));
			
		}while(rs.next());
		}
	
		
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
	
		
		}
}
