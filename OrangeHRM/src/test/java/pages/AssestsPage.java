package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class AssestsPage  extends BaseClass{
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
	WebElement assestid;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	WebElement location;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[6]")
	WebElement assignedemployee;
	
public AssestsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String AssestsPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateAssestsPageValues()
{
	String[] arr= {assestid.getText(),location.getText(),assignedemployee.getText()};
	return arr;
}
}
