package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SalaryComponentsPage extends BaseClass {
	
	@FindBy(xpath="//ng-include/span[contains(text(),'Annual Basic Payment')]")
	WebElement componentName;
	
	@FindBy(xpath="//*[@id='salaryComponentDiv']/crud-panel/div/div/list/table/tbody/tr[1]/td[3]/ng-include/span")
	WebElement type;
	
public SalaryComponentsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String salaryComponentsPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateSalaryComponentsPageValues()
{
	String[] arr= {componentName.getText(),type.getText()};
	return arr;
}
}
