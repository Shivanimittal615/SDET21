package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericLiabraries.WebDriverUtility;
import com.crm.autodesk.GenericLiabraries.jSONFileUtility;

public class TC08_CreateOpportunitesTest {

	WebDriver driver;
	@Test
	
	public void CreateOpportunitesTest() throws Throwable
	{
	
	//Read all the neccessary data from the file
	
	jSONFileUtility jsonLib=new jSONFileUtility();
	//javaUtility jLib=new javaUtility();
	WebDriverUtility wLib=new WebDriverUtility(); 
	String URL = jsonLib.readDataFromJSON("url");
	String BROWSER = jsonLib.readDataFromJSON("browser");
	String USERNAME = jsonLib.readDataFromJSON("username");
	String PASSWORD = jsonLib.readDataFromJSON("password");
	String PRODUCTNAME =jsonLib.readDataFromJSON("productname");
	String PRODUCTNUM = jsonLib.readDataFromJSON("productcode");
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("invalid browser");		
		}
	
	
	driver.get(URL);

}
}
