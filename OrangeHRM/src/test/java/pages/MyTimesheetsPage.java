package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import base.MyTimesheet_fields;

public class MyTimesheetsPage extends BaseClass {

	
	@FindBy(xpath="//div[@class='col s4']/b[contains(text(),'Project')]")
	WebElement project_label;
	
	@FindBy(xpath="//div[@class='col s4']/b[contains(text(),'Activity')]")
	WebElement activity_label;
	
	@FindBy(xpath="//div[@class='col s1 reducedHeadingPadding']/b[contains(text(),'From')]")
	WebElement From_label;
	
	@FindBy(xpath="//div[@class='col s1 reducedHeadingPadding']/b[contains(text(),'To')]")
	WebElement To_label;
	
	@FindBy(xpath="//div[@class='col s1 noLeftPadding']/b[contains(text(),'Duration')]")
	WebElement Duration_label;
	
	
	public MyTimesheetsPage() {

		PageFactory.initElements(driver, this);

	}
	
	
	public String MyTimesheetsPageTitle() // actions
	{
		return driver.getTitle();
	}
	
	public String[] validateMyTimesheets_fields()
	{
		String[] arr= {project_label.getText(),activity_label.getText(),From_label.getText(),To_label.getText(),Duration_label.getText()};
		return arr;
	}

	

}
