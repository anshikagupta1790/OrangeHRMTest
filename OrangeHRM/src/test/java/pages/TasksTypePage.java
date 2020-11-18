package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class TasksTypePage extends BaseClass {
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
	WebElement name;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	WebElement defaultowner;
	
	
	
public TasksTypePage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String TasksPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateTasksPageValues()
{
	String[] arr= {name.getText(),defaultowner.getText()};
	return arr;
}
}
