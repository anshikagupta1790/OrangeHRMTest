package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CandidatesPage extends BaseClass {

	
	@FindBy(xpath="//*[@id='content']/div[7]/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement vacancy;
	
	@FindBy(xpath="//*[@id='content']/div[7]/div/div[2]/table/tbody/tr[1]/td[3]")
	WebElement candidate;
	
	@FindBy(xpath="//*[@id='content']/div[7]/div/div[2]/table/tbody/tr[1]/td[4]")
	WebElement email;
	
  public CandidatesPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String candidatesPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateCandidatesPageValues()
{
	String[] arr= {vacancy.getText(),candidate.getText(),email.getText()};
	return arr;
}


}
