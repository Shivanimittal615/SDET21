package practise;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

import com.crm.autodesk.GenericLiabraries.ExcelFileUtility;
import com.crm.autodesk.GenericLiabraries.WebDriverUtility;
import com.crm.autodesk.GenericLiabraries.jSONFileUtility;
import com.crm.autodesk.GenericLiabraries.javaUtility;

	

	public class TC07_CreateOrganisationWithEducationTest {
		WebDriver driver;
		/**
		 * 
		 * @throws Throwable
		 * @throws Throwable
		 */
		
		@Test
		public void creatContactWithOrganizatio() throws Throwable
		{
			//read all the necessary data
			jSONFileUtility jsonLib=new jSONFileUtility();
			javaUtility jLib=new javaUtility();
			WebDriverUtility wLib=new WebDriverUtility(); 
			ExcelFileUtility Lib=new ExcelFileUtility();
			String URL = jsonLib.readDataFromJSON("url");
			String BROWSER = jsonLib.readDataFromJSON("browser");
			String USERNAME = jsonLib.readDataFromJSON("username");
			String PASSWORD = jsonLib.readDataFromJSON("password");
			String ContactName = Lib.getExcelData("Sheet1", 1, 2);
			String OrgName = Lib.getExcelData("Sheet1", 1, 3);
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
			wLib.waitForPageLoad(driver);
			wLib.maximizeWindow(driver);
			
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			
			driver.findElement(By.linkText("Organizations")).click();
			
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			
			WebElement ele = driver.findElement(By.name("industry"));
		      
			
			wLib.select(ele, 8);
			wLib.select(ele, "Education");
		     
			
		}

	}


