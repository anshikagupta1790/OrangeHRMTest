package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.CourseListPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TrainingSessionListPage;

public class Training_step extends BaseClass{

	LoginPage login;
	DashboardPage dashboard;
	CourseListPage courselist;
	TrainingSessionListPage trainingsession;
	
	@When("Login on OrangeHRM page")
	public void Login_on_OrangeHRM_page() {
		initialization(); 
		login=new LoginPage();
		dashboard=login.loginUserPass();
	    
	}
	
	@Given("User is on Training tab")
	public void user_is_on_training_tab() {
	    
		dashboard.TrainingTabclick();
	}

	@When("User click on Courses under Training tab in left navigation")
	public void user_click_on_courses_under_training_tab_in_left_navigation() {
	    courselist=dashboard.CoursesTabclick();
	    
	}

	@Then("Course list page is displayed with correct title,subunit,Coordinator details")
	public void course_list_page_is_displayed_with_correct_title_subunit_coordinator_details() {
	    
		String title= courselist.validateCourseListPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		driver.switchTo().frame("noncoreIframe");
		
		String titleName=courselist.validateCourseListTitleName();
		System.out.println("title name of courselist is correct: " +titleName);
		Assert.assertEquals("title name of courselist is not correct", "Docker Training", titleName);
		
		
		String subunitName=courselist.validateCourseListSubunitName();
		Assert.assertEquals("subunit name of courselist is not correct", "QA Team", subunitName);
		System.out.println("subunit name of courselist is correct: " +subunitName);
		
		String coordinatorName=courselist.validateCourseListCoordinatorName();
		Assert.assertEquals("coordinator name of courselist is not correct", "Linda Jane Anderson", coordinatorName);
		System.out.println("coordinator name of courselist is correct: " +coordinatorName);
		
	}
	
	@Given("User is already on Training tab")
	public void user_is_already_on_training_tab() {
		
		System.out.println("user is on training tab");
		
	}
	@When("User clicks on Training Sessions tab under Training tab in left navigation")
	public void user_clicks_on_training_sessions_tab_under_training_tab_in_left_navigation() {
		
		
			trainingsession=dashboard.TrainingSessionsTabclick();
		
	    
	}

	@Then("Training Session list page is displayed with correct Session name,Training Course,Status details")
	public void training_session_list_page_is_displayed_with_correct_session_name_training_course_status_details() {
	    
		
		String title= trainingsession.TrainingSessionListPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		
		String sessionName=trainingsession.validateTrainingList_SessionName();
		System.out.println("session name of trainingsession is correct: " +sessionName);
		Assert.assertEquals("session name of trainingsession is not correct", "Introduction to Request Tracker", sessionName);
		
		
		String trainingCourseName=trainingsession.validateTrainingList_TrainingCourse();
		Assert.assertEquals("training course name of trainingsession is not correct", "Request Tracker Management", trainingCourseName);
		System.out.println("training course name of trainingsession is correct: " +trainingCourseName);
		
		String statusName=trainingsession.validateTrainingList_Status();
		Assert.assertEquals("status name of trainingsession is not correct", "Scheduled", statusName);
		System.out.println("status name of trainingsession is correct: " +statusName);
		
	}

}
