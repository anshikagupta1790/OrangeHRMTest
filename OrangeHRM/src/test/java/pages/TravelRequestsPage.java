package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class TravelRequestsPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[1]/a")
	WebElement travelrequestid;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]")
	WebElement employeename;
	
public TravelRequestsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String TravelRequestsPageTitle() // actions
	{
		return driver.getTitle();
	}

public String[] validateTravelRequestsPageValues()
	{
		String[] arr= {travelrequestid.getText(),employeename.getText()};
		return arr;
	}
}
