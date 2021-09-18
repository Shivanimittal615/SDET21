package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule 1:- Create a seperate class for every Webpage
public class LoginPage {
	WebDriver driver ;
	
	//Rule 4:- Create a seperate constructor and used Pagefactory class
	public LoginPage (WebDriver driver) {
		
		this.driver=driver;		
		PageFactory.initElements(driver, this);
		
	}
	
	//Rule 2:- Identify all the web elements using @FindBy, @FineBys, @FinaAll annotations
	
	@FindBy(name= "user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;

	
	
	//Rule3:- Declare all the webelements as private and provide the getters
	
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Rule 5:- Access the WebElements using getters()/business methods
	
	public void login(String username, String password)
	{
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
}
