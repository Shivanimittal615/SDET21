package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.GenericLiabraries.WebDriverUtility;

//Rule 1:- Create a seperate class for every Webpage

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	
	//Rule 4:- Create a seperate constructor and used Pagefactory class
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	//Rule 2:- Identify all the web elements using @FindBy, @FineBys, @FinaAll annotations
	
	
	@FindBy(linkText= "Organisations")
	private WebElement organizationLnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutLnk;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLnk;
	
	@FindBy(linkText= "Products")
	private WebElement productLnk;


	
	//Rule3:- Declare all the webelements as private and provide the getters
	
     public WebDriver getDriver() {
    	 return driver;
     	}

     public WebElement getOrganizationLnk() {
    	 return organizationLnk;
     	}

     public WebElement getAdministratorImg() {
    	 return administratorImg;
     }

     public WebElement getSignOutLnk() {
    	 return signOutLnk;
     }

     public WebElement getContactLnk() {
    	 return contactLnk;
     }

     public WebElement getProductLnk() {
    	 return productLnk;
	
     }
     
   //Rule 5:- Access the WebElements using getters()/business methods
     
     public void clickOnOrganisation() 
     {
    	 organizationLnk.click();
     }
     
     public void clickOnContacts()
     {
    	 contactLnk.click();
     }
     
     public void signOut(WebDriver driver)
     {
    	 mouseOver(driver,administratorImg);
    	 signOutLnk.click();
    	 
     }
    	 public void productionLnk()
    	 {
    	 productLnk.click();
     }

	

	

		
	}
    	 
    	 
    	 
    	 
     


	
	

