package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static constants.Constant.*;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath = "//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy(name = "txtPassword")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='Submit']")
	WebElement login_button;
	
	@FindBy(id = "btnLogin")
	WebElement login_retry;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public DashboardPage loginUserPass() {
		
		username.clear();
		password.clear();
		username.sendKeys(prop.getProperty(USERNAME));
		password.sendKeys(prop.getProperty(PASSWORD));
		
	
		login_button.click();
		username.sendKeys(prop.getProperty(USERNAME));
		password.sendKeys(prop.getProperty(PASSWORD));
		login_retry.click();
		return new DashboardPage();
		
	}
	

}
