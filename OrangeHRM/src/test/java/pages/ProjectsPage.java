package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ProjectsPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]")
	WebElement customername;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/a")
	WebElement project;
	
	public ProjectsPage() {
		
		PageFactory.initElements(driver, this);
		  
		}
			
			 

		public String projectsPageTitle() // actions
		{
			return driver.getTitle();
		}
		
		public String[] validateProjectPageValues()
		{
			String[] arr= {customername.getText(),project.getText()};
			return arr;
		}
}
