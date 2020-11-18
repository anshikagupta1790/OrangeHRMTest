package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ViewMyActionsPage  extends BaseClass{

	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[1]")
	WebElement employee;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
	WebElement action;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	WebElement description;
	
public ViewMyActionsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String ViewMyActionsPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateViewMyActionsPageValues()
{
	String[] arr= {employee.getText(),action.getText(), description.getText()};
	return arr;
}
}
