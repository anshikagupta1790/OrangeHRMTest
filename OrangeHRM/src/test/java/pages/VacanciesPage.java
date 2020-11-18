package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class VacanciesPage extends BaseClass{

	@FindBy(xpath="//*[@id='vacancyTableContainer']/div[2]/table/tbody/tr[1]/td[2]")
	WebElement vacancyname;
	
	@FindBy(xpath="//*[@id='vacancyTableContainer']/div[2]/table/tbody/tr[1]/td[3]")
	WebElement jobtitle;
	
	@FindBy(xpath="//*[@id='vacancyTableContainer']/div[2]/table/tbody/tr[1]/td[5]")
	WebElement location;

	public VacanciesPage() {
	
	PageFactory.initElements(driver, this);
	  
	}
		
		 

		

	
	public String vacanciesPageTitle() // actions
	{
		return driver.getTitle();
	}
	
	public String[] validateVacanciesPageValues()
	{
		String[] arr= {vacancyname.getText(),jobtitle.getText(),location.getText()};
		return arr;
	}
}
