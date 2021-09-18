package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule 1:- Create a seperate class for every Webpage
public class OpportunityPage {
	WebDriver driver;
	
	
		//Rule 4:- Create a seperate constructor and used Pagefactory class
		public OpportunityPage (WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		//Rule 2:- Identify all the web elements using @FindBy, @FineBys, @FinaAll annotations
		
		@FindBy(linkText= "Opportunities")
		private WebElement opportunitiesLnk;
		
		@FindBy(xpath= "//img[@title='Create Opportunity...']")
		private WebElement createLnk;
		
		@FindBy(name= "potentialname")
		private WebElement opportunityNameEdt;
		
		@FindBy(id="related_to_display")
		private WebElement relatedtotbx;
		
		@FindBy(xpath="//img[@title='Select']")
		private WebElement relatedtoImg;
		
		
		

}
