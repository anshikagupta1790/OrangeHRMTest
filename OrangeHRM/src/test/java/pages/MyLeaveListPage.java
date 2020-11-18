package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyLeaveListPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='viewLeaveEntitlement']/crud-panel/div/div/list/table/tbody/tr[1]/td[1]/ng-include/span")
	WebElement employee;
	
	@FindBy(xpath="//*[@id='viewLeaveEntitlement']/crud-panel/div/div/list/table/tbody/tr[1]/td[3]/ng-include/span")
	WebElement leavetype;
	
	@FindBy(xpath="//*[@id='viewLeaveEntitlement']/crud-panel/div/div/list/table/tbody/tr[1]/td[5]/ng-include/span")
	WebElement numberofdays;
	
public MyLeaveListPage() 
	{
		
		PageFactory.initElements(driver, this);
		
	}

public String MyLeaveListPageTitle() // actions
	{
		return driver.getTitle();
	}

public String[] validateMyLeaveListPageValues()
	{
	
		String[] arr= {employee.getText(),leavetype.getText(),numberofdays.getText()};
		return arr;
	}
}
