package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyMonthlyAttendancePage extends BaseClass{
	
	@FindBy(xpath="//*[@id='searchBtnTrigger']")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id='resultTable']/thead/tr/th[1]")
	WebElement date;
	
	@FindBy(xpath="//*[@id='resultTable']/thead/tr/th[2]")
	WebElement no_of_hours_worked;
	
public MyMonthlyAttendancePage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String myMonthlyAttendancePageTitle() // actions
	{
		return driver.getTitle();
	}

public void searchReport()
	{
		searchbutton.click();
	}

public String[] validateMyMonthlyAttendancePageValues() throws InterruptedException
	{	Thread.sleep(2000);
		System.out.println("Date column: "+ date.getText());
		String[] arr= {date.getText(),no_of_hours_worked.getText()};
		return arr;
	}
}
