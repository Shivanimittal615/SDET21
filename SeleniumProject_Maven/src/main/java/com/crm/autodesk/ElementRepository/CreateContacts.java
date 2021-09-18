package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContacts {
	public CreateContacts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(name= "lastname")
private WebElement LastNameEdt;

@FindBy (name="button")
private WebElement SaveBtn;
@FindBy(name = "Edit")
private WebElement EditBtn;

public WebElement getEditBtn() {
	return EditBtn;
}

public WebElement getLastNameEdt() {
	return LastNameEdt;
}

public WebElement getSaveBtn() {
	return SaveBtn;
}

public void createLastName( String lastName)
{
	LastNameEdt.sendKeys(lastName);
	
}

public void saveContacts()
{
	SaveBtn.click();
}

public void editContacts()
{
	EditBtn.click();
}

}
