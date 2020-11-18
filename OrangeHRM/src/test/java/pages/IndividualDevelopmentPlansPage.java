package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class IndividualDevelopmentPlansPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"libraryDiv\"]/crud-panel/div/div/list/table/tbody/tr[1]/td[2]/ng-include/span")
	WebElement employee_name;
	
	@FindBy(xpath="//ng-include/span[contains(text(),'Individual Development Plan - Odis Adalwin')]")
	WebElement idp_name;
	
	@FindBy(xpath="//ng-include/span[contains(text(),'Jacqueline White')]")
	WebElement coach_name;

	public IndividualDevelopmentPlansPage() {
		
	 

		PageFactory.initElements(driver, this);

	}
	
	
	public String individualPageTitle() // actions
	{
		return driver.getTitle();
	}
	
	public String[] validateIndividualDevelopmentPlansValues()
	{
		String[] arr= {employee_name.getText(),idp_name.getText(),coach_name.getText()};
		return arr;
	}
}
