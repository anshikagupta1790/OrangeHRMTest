package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class ExpenseClaimsPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]")
	WebElement employeename;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	WebElement ClaimSubmissionDate;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[6]")
	WebElement AmountDue;
	
public ExpenseClaimsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String ExpenseClaimsPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateExpenseClaimsPageValues()
{
	String[] arr= {employeename.getText(),ClaimSubmissionDate.getText(),AmountDue.getText()};
	return arr;
}
}
