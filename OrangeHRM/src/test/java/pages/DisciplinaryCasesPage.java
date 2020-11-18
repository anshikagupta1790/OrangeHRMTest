package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DisciplinaryCasesPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]")
	WebElement employee;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]/a")
	WebElement casename;
	
	
   @FindBy(xpath="//*[@id='commentContainer-{id}'and contains(text(),'Tacitus has bought some drugs and sold them to his colleagues during the working hours.')]")
   WebElement description;
   
public DisciplinaryCasesPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String DisciplinaryCasesPageTitle() // actions
{
	return driver.getTitle();
}

public String[] validateDisciplinaryCasesPageValues()
{
	String[] arr= {employee.getText(),casename.getText(), description.getText()};
	return arr;
}
}
