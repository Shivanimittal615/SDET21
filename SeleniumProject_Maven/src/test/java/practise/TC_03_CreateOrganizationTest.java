package practise;



import org.testng.annotations.Test;

import com.crm.autodesk.ElementRepository.CreateOrganizationPage;
import com.crm.autodesk.ElementRepository.HomePage;
import com.crm.autodesk.ElementRepository.OrganizationPage;
import com.crm.autodesk.GenericLiabraries.BaseClass;


public class TC_03_CreateOrganizationTest extends BaseClass {

   /**
 * @throws Throwable 
    * 
    */
	
	@Test(groups="RegressionSuite")
	public void CreateOrganization() throws Throwable {
		
	HomePage hp = new HomePage(driver);
	String IndType = eLib.getExcelData("Sheet1",1,4);
	hp.clickOnOrganisation();
	OrganizationPage OrgPage=new OrganizationPage(driver);
	OrgPage.clickOnOrganization();
	
	CreateOrganizationPage createOrg=new CreateOrganizationPage(driver);
	createOrg.OrganizationWithIndustry(IndType);
	
	}

}
