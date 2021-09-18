package practise;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TC11_GetTitle_CreateOrganisation {
	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.linkText("Organizations")).click();
			String ele = driver.findElement(By.xpath("//img[@title='Create Organization...']")).getAttribute("title");
		
			System.out.println(ele);
			driver.close();
			
		}

	

}

