package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PublishedDocumentsPage extends BaseClass {
	@FindBy(xpath="//*[@id='header' and @class='articleTopic col s10 truncate' and contains(text(),'Global Company Meeting')]")
	WebElement documentname;
	
public PublishedDocumentsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String publishedDocumentsPageTitle() // actions
{
	return driver.getTitle();
}


}
