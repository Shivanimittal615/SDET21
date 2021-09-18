package UtilitiesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericLiabraries.WebDriverUtility;
import com.crm.autodesk.GenericLiabraries.jSONFileUtility;

public class TC_03_CreateProductAndSearchTest {
	
	
	
	WebDriver driver;
	
	@Test

	
	public void CreateProductAndVerify() throws Throwable
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
	wLib.waitForPageLoad(driver);
	wLib.maximizeWindow(driver);
	
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Products")).click();
	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	driver.findElement(By.name("productname")).sendKeys(PRODUCTNAME);
	driver.findElement(By.name("productcode")).sendKeys(PRODUCTNUM);
	driver.findElement(By.name("button")).click();
	
	

	driver.findElement(By.linkText("Products")).click();
	driver.findElement(By.name("search_text")).sendKeys(PRODUCTNUM);
	driver.findElement(By.name("submit")).click();
	
	
}
}
