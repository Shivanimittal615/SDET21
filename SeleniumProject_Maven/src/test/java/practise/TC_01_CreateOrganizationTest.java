package practise;

import org.testng.annotations.Test;

import com.crm.autodesk.ElementRepository.CreateOrganizationPage;
import com.crm.autodesk.ElementRepository.HomePage;
import com.crm.autodesk.ElementRepository.OrganizationPage;
import com.crm.autodesk.GenericLiabraries.BaseClass;

public class TC_01_CreateOrganizationTest extends BaseClass {

   /**
 * @throws Throwable 
    * 
    */
	
	@Test
	public void CreateOrganization() throws Throwable {
		
	HomePage hp = new HomePage(driver);
		
	hp.clickOnOrganisation();
	
	
	OrganizationPage OrgPage=new OrganizationPage(driver);
	OrgPage.clickOnOrganization();
	
	String OrgName = eLib.getExcelData("Sheet1",1,1) + jLib.getRandomNum();
	String webName = eLib.getExcelData("Sheet1",1,2) + jLib.getRandomNum();
	
	CreateOrganizationPage createOrg=new CreateOrganizationPage(driver);
	createOrg.createOrganization(OrgName);
	createOrg.createWebsite(webName);
	System.out.println("check the regional regression testing ");
	
	}


}
