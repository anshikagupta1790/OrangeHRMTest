package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.DevelopmentPlanPage;
import pages.IndividualDevelopmentPlansPage;
import pages.LoginPage;

public class SuccessionAndDevelopmentPage_step extends BaseClass{

	LoginPage login;
	DashboardPage dashboard= new DashboardPage();
	IndividualDevelopmentPlansPage individual;
	DevelopmentPlanPage development;
	
	

	@Given("User is on Succession & Development tab")
	public void user_is_on_succession_development_tab() {
	   
		
		dashboard.successionAndDevelopClick();
	}

	@When("User click on Individual Development Plans tab under Succession & Development tab in left navigation")
	public void user_click_on_individual_development_plans_tab_under_succession_development_tab_in_left_navigation() {
	    
		individual=dashboard.individualAndDevelopmentClick();
	}

	@Then("Individual Development Plans page is displayed with correct Employee, Idp name,coach details")
	public void individual_development_plans_page_is_displayed_with_correct_employee_idp_name_coach_details() {
	   
		String title= individual.individualPageTitle();
		Assert.assertEquals("title is not correct", "Individual Development Plans", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1= individual.validateIndividualDevelopmentPlansValues();
		
		System.out.println("employee name of individual development plans is correct: " +arr1[0]);
		Assert.assertEquals("employee name of individual development plans is not correct", "Odis Adalwin", arr1[0]);
		
		Assert.assertEquals("idp name of individual development plans is not correct", "Individual Development Plan - Odis Adalwin", arr1[1]);
		System.out.println("idp name of individual development plans is correct: " +arr1[1]);
		
		Assert.assertEquals("coach name of individual development plans is not correct", "Jacqueline White", arr1[2]);
		System.out.println("coach name of individual development plans is correct: " +arr1[2]);
		
		
	}

	@When("User clicks on My IDP tab under Succession & Development tab in left navigation")
	public void user_clicks_on_my_idp_tab_under_succession_development_tab_in_left_navigation() {
	    
		development= dashboard.myIDPClick();
	}

	@Then("My Development Plan page is displayed with correct IDP name,Coach details")
	public void my_development_plan_page_is_displayed_with_correct_idp_name_coach_details() {
		
		String title= development.DevelopmentPageTitle();
		Assert.assertEquals("title is not correct", "My Development Plan", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1= development.validateDevelopmentPlanValues();
		
		
		Assert.assertEquals("idp name of development plan is not correct", "Individual Development Plan - Jacqueline White", arr1[0]);
		System.out.println("idp name of development plan is correct: " +arr1[0]);
		
		Assert.assertEquals("coach name of development plan is not correct", "John Smith", arr1[1]);
		System.out.println("coach name of  development plan is correct: " +arr1[1]);
		
	}
}
