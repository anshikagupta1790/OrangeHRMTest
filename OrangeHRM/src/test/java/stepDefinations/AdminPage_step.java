package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.SalaryComponentsPage;
import pages.UsersPage;

public class AdminPage_step extends BaseClass {
	DashboardPage dashboard=new DashboardPage();
	UsersPage userspage;
	SalaryComponentsPage salarycomponents;
	
	@Given("User is on Admin tab")
	public void user_is_on_admin_tab() {
	    dashboard.adminClick();
	}

	@When("User click on User Management tab under Admin tab in left navigation and click on Users")
	public void user_click_on_user_management_tab_under_admin_tab_in_left_navigation_and_click_on_users() {
	    
		dashboard.userManagementClick();
		userspage= dashboard.usersClick();
		
		
		
	}

	@Then("Users page is displayed with correct username,user role details")
	public void users_page_is_displayed_with_correct_username_user_role_details() {
		
		String title= userspage.usersPageTitle();
		Assert.assertEquals("title is not correct", "Users", title);
		System.out.println("title is: " +title);
		
		
		
		String[] arr1=userspage.validateUsersPageValues();
		
		System.out.println("Username is: " +arr1[0]);
		Assert.assertEquals("Username is not correct", "aaliyah.haq", arr1[0]);
		
		Assert.assertEquals("User role is not correct", "Default ESS, Default Supervisor", arr1[1]);
		System.out.println("User role is: " +arr1[1]);
	}

	@Given("User is on Job tab")
	public void user_is_on_job_tab() {
	    dashboard.jobClick();
	}

	@When("User clicks on Salary Components tab under Admin tab in left navigation")
	public void user_clicks_on_salary_components_tab_under_admin_tab_in_left_navigation() {
	    
		salarycomponents=dashboard.salaryComponentsClick();
	}

	@Then("Salary Components page is displayed with correct component name and type details")
	public void salary_components_page_is_displayed_with_correct_component_name_and_type_details() {
		
		String title= salarycomponents.salaryComponentsPageTitle();
		Assert.assertEquals("title is not correct", "Salary Components", title);
		System.out.println("title is: " +title);
		
		
		
		String[] arr1=salarycomponents.validateSalaryComponentsPageValues();
		
		System.out.println("Component name is: " +arr1[0]);
		Assert.assertEquals("Component name is not correct", "Annual Basic Payment", arr1[0]);
		
		Assert.assertEquals("Type is not correct", "Earning", arr1[1]);
		System.out.println("Type is: " +arr1[1]);
	}

	@Given("User is on Competencies tab")
	public void user_is_on_competencies_tab() {
	    System.out.println("Click on competencies tab below");
	}

	@When("User clicks on Competencies tab under Admin tab in left navigation")
	public void user_clicks_on_competencies_tab_under_admin_tab_in_left_navigation() throws InterruptedException {
	    Thread.sleep(3000);
		dashboard.CompetenciesClick();
	}

	@Then("Competency List tab is displayed")
	public void competency_list_tab_is_displayed() {
	   String value=dashboard.validateCompetencyListTab();
	   Assert.assertEquals("Competency list tab is correct", "Competency List", value);
	   System.out.println("competency list tab is correct: " +value);
	   
	   
	}

}
