package practise;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.autodesk.ElementRepository.ContactsPage;
import com.crm.autodesk.ElementRepository.CreateContacts;
import com.crm.autodesk.ElementRepository.HomePage;
import com.crm.autodesk.GenericLiabraries.BaseClass;



//@Listeners(com.crm.autodesk.GenericLiabraries.ListenerS.class)
public class TC_09_CreateContactTest extends BaseClass{
	
	/**
	 * 
	 * @throws Throwable
	 * @throws Throwable
	 */
	
	@Test(groups = "RegressionSuite", retryAnalyzer = com.crm.autodesk.GenericLiabraries.RetryAnalyzer.class)
	public void creatContactWithOrganizatio() throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContacts();
			
		
		
		ContactsPage ContPage = new ContactsPage(driver);
		ContPage.clickContacts();
		
		String lastName = eLib.getExcelData("Sheet1", 1, 1);
		
		CreateContacts CrtCon = new CreateContacts(driver);
		CrtCon.createLastName(lastName);
		CrtCon.saveContacts();
		Assert.assertEquals(false, true);
		
	}
	


		
	@Test (groups = "RegressionSuite", retryAnalyzer = com.crm.autodesk.GenericLiabraries.RetryAnalyzer.class)
	public void editContact() throws Throwable
	
	{
		HomePage hp1 = new HomePage(driver);
		hp1.clickOnContacts();
			
		
		
		ContactsPage  cp = new ContactsPage(driver);
		cp.clickContacts();
		
		String lstName = eLib.getExcelData("Sheet2", 1, 1);
		
		CreateContacts cc = new CreateContacts(driver);
		cc.createLastName(lstName);
		cc.saveContacts();
		cc.editContacts();
		cc.saveContacts();
		Assert.assertEquals(false, true);
		
	
}
}