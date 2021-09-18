package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MYSQL_DB {
	public static void main(String[]args) throws Throwable {
	//Step1: Register/Load the MySql database
	Driver driverRef=new Driver();
	DriverManager.registerDriver(driverRef);

	
	//Step 2: get connect to database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
	
	//Step3: Create SQL Statement 
	
	Statement stat = con.createStatement();
	String query = "select * from students_info";
	
	
	//Step4: Execute Statement/Query
	ResultSet result = stat.executeQuery(query);
	
	while (result.next()) {
		System.out.println(result.getInt(1) + "\t" + result.getString(2)+ "\t" + result.getString(3)+ "\t" + result.getString(4));
			}
	
	//Step5: Close the connection
	
	con.close();
}}
