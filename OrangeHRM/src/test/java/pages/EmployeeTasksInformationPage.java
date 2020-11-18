 package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EmployeeTasksInformationPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
	WebElement task;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	WebElement owner;
	
public EmployeeTasksInformationPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String EmployeeTasksInformationPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateEmployeeTasksInformationPageValues()
{
	String[] arr= {task.getText(),owner.getText()};
	return arr;
}

}
