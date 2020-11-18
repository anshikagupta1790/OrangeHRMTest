package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;

public class LogoutPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"user-dropdown\"]")
	WebElement profile;
	
	@FindBy(xpath = "//*[@id=\"logoutLink\"]")
	WebElement logout;
	
	
	public LogoutPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void LogoutClick() {
		
		profile.click();
		logout.click();
		
	}
	
	
}
