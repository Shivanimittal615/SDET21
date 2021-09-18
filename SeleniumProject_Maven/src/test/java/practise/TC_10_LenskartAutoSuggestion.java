package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10_LenskartAutoSuggestion {
	
	public void lenskartautosuggestion()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement autosuggestion = driver.findElement(By.name("q"));
		List<WebElement> listele = autosuggestion.findElements(By.xpath("//input[@name='q']"));
		listele.get(2);
		
	}

}
