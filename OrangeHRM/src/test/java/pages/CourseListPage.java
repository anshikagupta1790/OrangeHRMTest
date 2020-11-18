package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CourseListPage extends BaseClass {

	@FindBy(xpath = "//a[contains(text(),'Docker Training')]")
	WebElement title_course;

	@FindBy(xpath = "//td[contains(text(),'QA Team')]")
	WebElement subunit_name;

	@FindBy(xpath = "//*[@id=\'resultTable\']/tbody/tr[1]/td[4]")
	WebElement coordinator_name;

	public CourseListPage() {

		PageFactory.initElements(driver, this);

	}

	public String validateCourseListPageTitle() // actions
	{
		return driver.getTitle();
	}

	public String validateCourseListTitleName() {

		return title_course.getText();
	}

	public String validateCourseListSubunitName() {

		return subunit_name.getText();
	}

	public String validateCourseListCoordinatorName() {

		return coordinator_name.getText();
	}

}
