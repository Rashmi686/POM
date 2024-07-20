package TC;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import library.page.loginfun;
import utils.AppUtils;

public class logintest extends AppUtils
{
     
	
	@Test
	public void loginfuntest()
	
	{
		
	loginfun lp = PageFactory.initElements(driver, loginfun.class);
	lp.login("Admin", "Qedge123!@#");
	lp.closeApp();
Boolean res = lp.isadminmoduledisplayed();	
		
	lp.logout();
	lp.closeApp();
		
		
		
		
		
		
		
		
		
	}
	
}
