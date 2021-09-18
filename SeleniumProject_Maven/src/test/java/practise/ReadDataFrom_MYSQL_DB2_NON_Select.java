package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;


public class ReadDataFrom_MYSQL_DB2_NON_Select {

		public static void main(String[]args) throws Throwable {
		//Step1: Register/Load the MySql database
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);

		
		//Step 2: get connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
		
		//Step3: Create SQL Statement 
		
		Statement stat = con.createStatement();
		String query = "insert into students_info (regno, firstname, middlename, lastname) values ('15', 'Viraj', 'garg', 'gupta')";
		
		
		//Step4: Execute Statement/Query
		int result = stat.executeUpdate(query);
		if(result==1) {
			System.out.println("User is created");
		} else {
			System.out.println("User is NOT Created");
		}
		
		
		//Step5: Close the connection
		
		con.close();
	}}



