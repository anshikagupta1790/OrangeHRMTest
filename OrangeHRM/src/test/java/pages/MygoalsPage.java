package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MygoalsPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"goalsList\"]/tbody/tr[1]/td[6]/ng-include/span")
	WebElement goalStatus;
	
	@FindBy(xpath = "//*[@id=\"goalsList\"]/tbody/tr[1]/td[4]/ng-include/span")
	WebElement ownerName;
	
	public MygoalsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String myGoalsPageTitle() {
		
		return driver.getTitle();
	}
	
	public String[] myGoalDetails() {
		String[] arr= {goalStatus.getText(),ownerName.getText()};
		return arr;
	}

}
