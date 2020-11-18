package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PerformanceTrackerListPage extends BaseClass{
	
	@FindBy(xpath  = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[1]/a")
	WebElement trackerName;
	
	@FindBy(xpath  = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
	WebElement empName;
	
	public PerformanceTrackerListPage() {

		PageFactory.initElements(driver, this);
	}
	
	public String performanceTrackerPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public String[] validatePerformTracker() {
		
		String[] arr= {trackerName.getText(),empName.getText()};
		return arr;
		
	}
	
	

}
