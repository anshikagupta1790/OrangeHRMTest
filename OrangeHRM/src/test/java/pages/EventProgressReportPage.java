package pages;

import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EventProgressReportPage extends BaseClass {
public EventProgressReportPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String EventProgressReportPageTitle() // actions
{
	return driver.getTitle();
}
}
