package library.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.AppUtils;


public class loginfun extends AppUtils 
{

	
	
	@FindBy(id = "txtUsername")
	WebElement uid_element;
	
	@FindBy(name = "txtPassword")
	WebElement pwd_element;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement login_element;
	
	
	@FindBy(linkText = "Admin")
	WebElement admin_link;
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcome_link;
	
	@FindBy(linkText = "Logout")
	WebElement logout_link;
	public void login(String uid, String pwd)
	
	{
		
		uid_element.sendKeys(uid);
		pwd_element.sendKeys(pwd);
		login_element.click();
			
	}
	public boolean isadminmoduledisplayed()
	{
		if(admin_link.isDisplayed())
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
public void logout()
{
	welcome_link.click();
	logout_link.click();
}
}
