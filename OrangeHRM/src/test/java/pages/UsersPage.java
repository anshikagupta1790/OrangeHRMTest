package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class UsersPage extends BaseClass {

	@FindBy(xpath="//ng-include/span[contains(text(),'aaliyah.haq')]")
	WebElement username;
	
	@FindBy(xpath="//*[@id='systemUserDiv']/crud-panel/div/div/list/table/tbody/tr[1]/td[3]/ng-include/span")
	WebElement userrole;
	
public UsersPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String usersPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateUsersPageValues()
{
	String[] arr= {username.getText(),userrole.getText()};
	return arr;
}
}
