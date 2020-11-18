package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EmployeeListPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[2]")
	WebElement empID;
	
	@FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[3]")
	WebElement empName;
	
	@FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[4]")
	WebElement jobTitle;
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String employeeListTitle() //actions
	{
		return driver.getTitle();
	}
	
	public String[] validateEmpList() {
		
		String[] arr= {empID.getText(),empName.getText(),jobTitle.getText()};
		return arr;
	}
}
