package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DevelopmentPlanPage extends BaseClass {

	@FindBy(xpath="//ng-include/span[contains(text(),'Individual Development Plan - Jacqueline White')]")
	WebElement idpname;
	
	@FindBy(xpath="//ng-include/span[contains(text(),'John Smith')]")
	WebElement coachname;
	
	public DevelopmentPlanPage() {
		
		 

		PageFactory.initElements(driver, this);

	}
	public String DevelopmentPageTitle() // actions
	{
		return driver.getTitle();
	}
	
	public String[] validateDevelopmentPlanValues()
	{
		String[] arr= {idpname.getText(),coachname.getText()};
		return arr;
	}
}
