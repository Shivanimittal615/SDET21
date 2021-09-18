package practise;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericLiabraries.jSONFileUtility;

public class DynamicWebTable {
	
	WebDriver driver;
	@Test
	
	public void handlingDynamicWebTable() throws Throwable
	{
		jSONFileUtility jsonLib = new jSONFileUtility();
		
		//Fetch the common data from external resource
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String URL = jsonLib.readDataFromJSON("url");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		
		//Choose the Browser
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver =new InternetExplorerDriver();
		}
		//Load the URL
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		//Login to application
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//Click on organizations
		
		driver.findElement(By.linkText("Organizations")).click();
		
		//Click on all checkboxes
		//List <WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td/input[@name='selected_id']"));
		
		//Check 3rd checkbox only
		List <WebElement> list = driver.findElements(By.id("4"));
		
		for(WebElement wb:list)
		{
			wb.click();
			
		}
		
		driver.findElement(By.linkText("edit")).click();
	}

}
