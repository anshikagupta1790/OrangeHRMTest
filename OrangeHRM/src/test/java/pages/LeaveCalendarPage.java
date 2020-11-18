package pages;

import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LeaveCalendarPage extends BaseClass {
public LeaveCalendarPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	public String LeaveCalendarPageTitle() // actions
	{
		return driver.getTitle();
	}

}
