package practise;


import org.testng.annotations.Test;

import com.crm.autodesk.ElementRepository.CreateOrganizationPage;
import com.crm.autodesk.ElementRepository.HomePage;
import com.crm.autodesk.ElementRepository.OrganizationPage;
import com.crm.autodesk.GenericLiabraries.BaseClass;



public class TC_02_CreateOrganizationTest extends BaseClass {

   /**
 * @throws Throwable 
    * 
    */
	
	@Test(groups="SmokeSuite")
	public void CreateOrganization() throws Throwable {
		
	HomePage hp = new HomePage(driver);
	hp.clickOnOrganisation();
	
	OrganizationPage OrgPage=new OrganizationPage(driver);
	OrgPage.clickOnOrganization();
	
	CreateOrganizationPage createOrg=new CreateOrganizationPage(driver);
	createOrg.dropDownIndustry();
	
	}

}
