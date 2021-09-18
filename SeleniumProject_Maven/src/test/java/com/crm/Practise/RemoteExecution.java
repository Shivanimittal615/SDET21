package com.crm.Practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	
	@Test
	
	public void remoteExecutionTest() throws MalformedURLException
	{
		URL url = new URL("http://3.16.165.90:5555/wd/hub");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver= new RemoteWebDriver(url, cap);
		driver.get("https://gmail.com");
		System.out.println("Browswer Launched Successfully");
	}

}
