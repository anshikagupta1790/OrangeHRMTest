package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CommonActivitiesPage extends BaseClass {
	@FindBy(xpath="//*[@id=\"commonActivities\"]/div/crud-panel/div/div/list/table/thead/tr/th[2]")
	WebElement activitycolumn;


	public CommonActivitiesPage() {
		
		PageFactory.initElements(driver, this);
		  
		}
			
		
		public String commonActivitiesPageTitle() // actions
		{
			return driver.getTitle();
		}
		
		public String validatecommonActivityColumn()
		{
			return activitycolumn.getText();
			
		}
}
