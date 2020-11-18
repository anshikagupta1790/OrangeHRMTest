package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.CommonActivitiesPage;
import pages.DashboardPage;
import pages.ProjectsPage;

public class ActivityInfoPage_step extends BaseClass {
	DashboardPage dashboard=new DashboardPage();
	ProjectsPage projectspage;
	CommonActivitiesPage commonactivities;
	
	@Given("User is on Activity Info tab in left navigation")
	public void user_is_on_activity_info_tab_in_left_navigation() {
	    dashboard.Timeclick();
	    dashboard.activityInfoClick();
	}

	@When("User click Projects tab under Activity Info page in left navigation")
	public void user_click_projects_tab_under_activity_info_page_in_left_navigation() {
	   projectspage= dashboard.projectsClick();
	}

	@Then("Projects page is displayed with correct Customer Name and Project")
	public void projects_page_is_displayed_with_correct_customer_name_and_project() {
		
		String title= projectspage.projectsPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is: " +title);
		
		driver.switchTo().frame("noncoreIframe"); //switch to frame
		
		String[] arr1=projectspage.validateProjectPageValues();
		
		System.out.println("Customer name is: " +arr1[0]);
		Assert.assertEquals("Customer name is not correct", "ACME Ltd", arr1[0]);
		
		Assert.assertEquals("Project is not correct", "ACME Ltd", arr1[1]);
		System.out.println("Project is: " +arr1[1]);
	}

	@When("User clicks on Common Activities tab under Activity Info in left navigation")
	public void user_clicks_on_common_activities_tab_under_activity_info_in_left_navigation() throws InterruptedException {
	    
		Thread.sleep(4000);
		commonactivities=dashboard.commonActivitiesClick();
	}

	@Then("Common Activities page is displayed with correct Activity column")
	public void common_activities_page_is_displayed_with_correct_activity_column() {
		
		String title= commonactivities.commonActivitiesPageTitle();
		Assert.assertEquals("title is not correct", "Common Activities", title);
		System.out.println("title is: " +title);
	}
}
