package oppss;
import java.sql.*;
public class CreateDB {
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL ="jdbc:mysql://localhost:3306/";


	//database username and password
	static final String USER ="demo";
	static  String PWD ="abc@123#";
	
	
	
	public static void main(String[] args) {
		Connection con =null;
		Statement statement =null;
		try {
			//2register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			//3open a connection
			System.out.println("Connecting to database...");
			con =DriverManager.getConnection(DB_URL,USER,PWD);
			//4.Execute a query
			System.out.println("Creating to database...");
			statement=con.createStatement();
			
			String sql ="create database student";
			boolean result =statement.execute(sql);
			System.out.println(result);
			System.out.println("Datebase created...");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement!=null) {
					statement.close();
				}
				if(con!=null) {
					con.close();
				}
	
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
   }
}
