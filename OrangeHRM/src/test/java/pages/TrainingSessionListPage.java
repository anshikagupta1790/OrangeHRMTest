package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class TrainingSessionListPage extends BaseClass {
	
	@FindBy(xpath="//a[contains(text(),'Introduction to Request Tracker')]")
	WebElement sessionName;
	
	@FindBy(xpath="//td[contains(text(),'Request Tracker Management')]")
	WebElement TrainingCourse;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[4]")
	WebElement Status;
	
	public TrainingSessionListPage() {

		PageFactory.initElements(driver, this);

	}

	public String TrainingSessionListPageTitle() // actions
	{
		return driver.getTitle();
	}

	public String validateTrainingList_SessionName() {

		return sessionName.getText();
	}

	public String validateTrainingList_TrainingCourse() {

		return TrainingCourse.getText();
	}

	public String validateTrainingList_Status() {

		return Status.getText();
	}


}
