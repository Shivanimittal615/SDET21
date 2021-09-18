package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class AccountStatus_UnitTest {
	@Test
	public void testAccountType() throws SQLException 
	{
		Connection con= null;
		
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
			Statement stat = con.createStatement();
			String query = "select * from account";
			ResultSet result = stat.executeQuery(query);
			while(result.next()) {
				int acctNum = result.getInt("accno");
				System.out.println(acctNum);
			if(acctNum==123 && result.getString("accountType").equals("gold"));
					System.out.println("Account Type Gold & Verified==PASS");
					break;
				}
			
		}catch(Exception e) {
			System.err.println("Account Type is not Gold==FAIL");
		}finally {
			con.close();
		}
	}

	}

