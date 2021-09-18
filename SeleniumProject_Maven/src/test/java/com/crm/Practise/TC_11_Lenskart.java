package com.crm.Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_11_Lenskart {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.lenskart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.name("q")).click();
			
		
			List<WebElement> ele = driver.findElements(By.xpath("//ul[@class= 'trending_list menu-link']"));
			Thread.sleep(2000);
			for(WebElement web:ele)
			{
				System.out.println(web.getText());
			}
		driver.close();	
	}

}
