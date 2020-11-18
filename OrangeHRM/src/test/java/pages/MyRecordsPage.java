package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyRecordsPage extends BaseClass {
	
	@FindBy(xpath="//div/h4[contains(text(),'My Attendance Records')]")
	WebElement myAttendanceRecordslabel;
	
public MyRecordsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String MyRecordsPageTitle() // actions
{
	return driver.getTitle();
}

public String validateMyRecordsPageLabel()
{
	return myAttendanceRecordslabel.getText();
}
}
