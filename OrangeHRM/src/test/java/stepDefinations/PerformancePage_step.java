package stepDefinations;

import java.sql.Driver;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.AppraisalListPage;
import pages.DashboardPage;
import pages.MygoalsPage;
import pages.PerformanceTrackerListPage;

public class PerformancePage_step extends BaseClass {
	
	DashboardPage dashboard=new DashboardPage();
	PerformanceTrackerListPage performanceTracker;
	MygoalsPage mygoal;
	AppraisalListPage appraisalList;
	
	@Given("User is on Performance tab")
	public void user_is_on_performance_tab() {
		
		dashboard.performanceTabClick();
		
	}

	@When("User click on Employee Trackers under Performance tab in left navigation and click on Trackers list tab")
	public void user_click_on_employee_trackers_under_performance_tab_in_left_navigation_and_click_on_trackers_list_tab() {

		performanceTracker=dashboard.empTrackerTabClick();
		String title=performanceTracker.performanceTrackerPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		
	}
	@Then("Performance Trackers page is displayed with correct Tracker name,Employee details")
	public void performance_trackers_page_is_displayed_with_correct_tracker_name_employee_details() {
		
		driver.switchTo().frame("noncoreIframe");
		driver.switchTo().frame("legacyViewHolder");
		String[] arr1=performanceTracker.validatePerformTracker();
		
		System.out.println("Tracker Name is: " +arr1[0]);
		Assert.assertEquals("Tracker Name is not correct", "2011 October Time of arrival", arr1[0]);
		
		Assert.assertEquals("Employee Name is not correct", "Aaliyah Haq", arr1[1]);
		System.out.println("Employee Name is correct: " +arr1[1]);
		
	}
	@Given("User is on Goals tab")
	public void user_is_on_goals_tab() {
		driver.switchTo().parentFrame();
		dashboard.goalsTabClick();
		
	}
	@When("User clicks on My Goals tab under Performance->Goals tab in left navigation")
	public void user_clicks_on_my_goals_tab_under_performance_goals_tab_in_left_navigation() {

		mygoal=dashboard.myGoalsTabClick();
		String title=mygoal.myGoalsPageTitle();
		Assert.assertEquals("title is not correct", "My Goals", title);
		
	}
	@Then("My Goals page is displayed with correct Goal status,Owner details")
	public void my_goals_page_is_displayed_with_correct_goal_status_owner_details() {

		String[] arr1=mygoal.myGoalDetails();
		
		System.out.println("Goal Status is: " +arr1[0]);
		Assert.assertEquals("Goal Status is not correct", "Pending", arr1[0]);
		
		Assert.assertEquals("Owner Name is not correct", "Jacqueline %%%%%%%% White", arr1[1]);
		System.out.println("Owner Name is: " +arr1[1]);
	
	}
	@Given("User is on Appraisals tab")
	public void user_is_on_appraisals_tab() {

		dashboard.appraisalTabClick();
		
	}
	@When("User clicks on Appraisal List tab under Performance->Appraisals tab")
	public void user_clicks_on_appraisal_list_tab_under_performance_appraisals_tab() {

		appraisalList=dashboard.appraisalListClick();
		String title=appraisalList.appraisalListPageTitle();
		Assert.assertEquals("AppraisalList Page Title is not correct", "Employee Appraisals",title );
	
	}
	@Then("Employee Appraisals page is displayed with correct Employee name,Description,Appraisal Status details")
	public void employee_appraisals_page_is_displayed_with_correct_employee_name_description_appraisal_status_details() {

		String[] arr1=appraisalList.appraisalListPageValidate();
		
		System.out.println("Employee Name is: " +arr1[0]);
		Assert.assertEquals("Employee NAme is not correct", "Brody Alan", arr1[0]);
		
		Assert.assertEquals("Appraisal Description is not correct", "Mid Year Review 2020-Brody", arr1[1]);
		System.out.println("Appraisal Description is: " +arr1[1]);
		
		Assert.assertEquals("Appraisal Status is not correct", "INITIATED", arr1[2]);
		System.out.println("Appraisal Status is: " +arr1[2]);
	}

}
