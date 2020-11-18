package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.EmployeeTasksInformationPage;
import pages.EventProgressReportPage;
import pages.LoginPage;
import pages.TasksTypePage;

public class OnboardingPage_step extends BaseClass {

	LoginPage login;
	DashboardPage dashboard=new DashboardPage();
	TasksTypePage tasktype;
	EmployeeTasksInformationPage employeetasksinformation;
	EventProgressReportPage eventprogressreport;
	
	@Given("User is on Onboarding tab")
	public void user_is_on_onboarding_tab() {
	    dashboard.onboardingClick();
	}

	@When("User click on Task Types tab under Onboarding tab in left navigation")
	public void user_click_on_task_types_tab_under_onboarding_tab_in_left_navigation() {
	    
		tasktype=dashboard.taskTypesClick();
	}

	@Then("Tasks Types page is displayed with correct Name,Default owner details")
	public void tasks_types_page_is_displayed_with_correct_name_default_owner_details() {
		
		String title= tasktype.TasksPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		driver.switchTo().frame("noncoreIframe");    //switch to frame
		
		String[] arr1=tasktype.validateTasksPageValues();
		
		System.out.println("Name is: " +arr1[0]);
		Assert.assertEquals("Name is not correct", "Allocate Assets", arr1[0]);
		
		
		System.out.println("Default Owner is: " +arr1[1]);
		Assert.assertEquals("Default Owner is not correct", "Linda Jane Anderson", arr1[1]);
	}

	@When("User clicks on Employee tasks tab under Onboarding tab in left navigation")
	public void user_clicks_on_employee_tasks_tab_under_onboarding_tab_in_left_navigation() {
	    
		employeetasksinformation=dashboard.employeeTasksClick();
	}

	@Then("Employee tasks Information page is displayed with correct Task, Owner details")
	public void employee_tasks_information_page_is_displayed_with_correct_task_owner_details() {
		
		String title= employeetasksinformation.EmployeeTasksInformationPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1=employeetasksinformation.validateEmployeeTasksInformationPageValues();
		
		System.out.println("Task is: " +arr1[0]);
		Assert.assertEquals("Task is not correct", "Allocate Assets", arr1[0]);
		
		
		System.out.println("Owner name is: " +arr1[1]);
		Assert.assertEquals("Owner name is not correct", "Peter Mac Anderson", arr1[1]);
	}

	@Given("User is on Reports tab under Onboarding tab in left navigation")
	public void user_is_on_reports_tab_under_onboarding_tab_in_left_navigation() {
	    
		dashboard.reportsClick();
	}

	@When("User clicks on Event Progress tab under Onboarding tab in left navigation")
	public void user_clicks_on_event_progress_tab_under_onboarding_tab_in_left_navigation() {
	    
		eventprogressreport= dashboard.eventProgressClick();
	    
	}

	@Then("Event progress Report page is displayed")
	public void event_progress_report_page_is_displayed() throws InterruptedException {
	    Thread.sleep(3000);
		String title=eventprogressreport.EventProgressReportPageTitle();
		Assert.assertEquals("title is not correct", "Event Progress Report", title);
		System.out.println("title is correct: " +title);
	}

}
