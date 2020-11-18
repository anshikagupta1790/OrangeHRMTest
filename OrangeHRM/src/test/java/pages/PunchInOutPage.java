package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PunchInOutPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='myPunchedInTimeDiv']/span[2]")
	WebElement punchintime;
	
public PunchInOutPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String PunchInOutPageTitle() // actions
{
	return driver.getTitle();
}

public String validatePunchedtimeValue()
{
	return punchintime.getText();
}

}
