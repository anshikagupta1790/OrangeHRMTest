package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.ExpenseClaimsPage;
import pages.TravelRequestsPage;

public class ExpensePage_step extends BaseClass{
	
	DashboardPage dashboard=new DashboardPage();
	TravelRequestsPage travelrequestspage;
	ExpenseClaimsPage expenseclaimspage;
	
	@Given("User is on Expense tab")
	public void user_is_on_expense_tab() {
		dashboard.ExpenseClick();
		
	}

	@When("User click on Travel Requests tab under expense tab in left navigation and click on employee travel requests tab")
	public void user_click_on_travel_requests_tab_under_expense_tab_in_left_navigation_and_click_on_employee_travel_requests_tab() {
    
	dashboard.TravelRequestsClick();
    travelrequestspage=dashboard.EmployeeTravelRequestsClick();
		
	}
	@Then("Travel Requests page is displayed with correct travel request id,employee name details")
	public void travel_requests_page_is_displayed_with_correct_travel_request_id_employee_name_details() {
	    
		String title= travelrequestspage.TravelRequestsPageTitle();
		
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		driver.switchTo().frame("noncoreIframe");
		String[] arr1=travelrequestspage.validateTravelRequestsPageValues();
		
		
		Assert.assertEquals("travel request id is not correct", "201805TVR033", arr1[0]);
		System.out.println("travel request id is : " +arr1[0]);
		
		Assert.assertEquals("employee name is not correct", "Katrina Keifer", arr1[1]);
		System.out.println("employee name is: " +arr1[1]);
	}
	@Given("User is on Claims tab")
	public void user_is_on_claims_tab() {
	    
		dashboard.ClaimsClick();
		
	}
	@When("User clicks on Employee Claims tab under claims tab in left navigation")
	public void user_clicks_on_employee_claims_tab_under_claims_tab_in_left_navigation() {
	    
		expenseclaimspage=dashboard.employeeClaimsClick();
	}
	@Then("Expense Claims page is displayed with correct employee name, Amount Due \\(Total),Claim Submission Date details")
	public void expense_claims_page_is_displayed_with_correct_employee_name_amount_due_total_claim_submission_date_details() {

		String title= expenseclaimspage.ExpenseClaimsPageTitle();
		
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1=expenseclaimspage.validateExpenseClaimsPageValues();
		
		
		Assert.assertEquals("employee name is not correct", "Kevin Mathews", arr1[0]);
		System.out.println("employee name is : " +arr1[0]);
		
		Assert.assertEquals("claim submission date is not correct", "Sun, 30 Jul 2017", arr1[1]);
		System.out.println("claim submission date is: " +arr1[1]);
		
		Assert.assertEquals("amount due is not correct", "907144.00", arr1[2]);
		System.out.println("amount due is: " +arr1[2]);
	}

}
