package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ProjectTimeReportPage extends BaseClass {
	
	@FindBy(xpath="//input[@name='date-from']")
	WebElement datefrom;
	
	@FindBy(xpath="//input[@name='date-to']")
	WebElement dateto;
	
	@FindBy(xpath="//*[@id='pimReportFilterForm']/div[3]/div/button")
	WebElement generatebutton;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div/div[1]/h4/a[3]/i")
	WebElement pdf_icon;
	
public ProjectTimeReportPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String projecttimereportPageTitle() // actions
{
	return driver.getTitle();
}


}
