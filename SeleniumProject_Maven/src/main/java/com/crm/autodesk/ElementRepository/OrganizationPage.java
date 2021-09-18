package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	
	public OrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Organizations")
	private WebElement clickOnCreateOrgImg;
	

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganization;

	public WebElement getCreateOrganization() {
		return createOrganization;
	}
	
	public void clickOnOrganization()
	{
		createOrganization.click();
	}

}
