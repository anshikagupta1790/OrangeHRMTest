package stepDefinations;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LeaveCalendarPage;
import pages.MyLeaveListPage;

public class LeavePage_step  extends BaseClass{
	
	DashboardPage dashboard=new DashboardPage();
	MyLeaveListPage myLeave;
	LeaveCalendarPage leaveCalendar;
	
	
	@When("User clicks on My Leave tab in left navigation")
	public void user_clicks_on_my_leave_tab_in_left_navigation() {
	    
		dashboard.leaveClick();
		myLeave=dashboard.MyLeaveClick();
		
	}
	@Then("My Leave List page is displayed")
	public void my_leave_list_page_is_displayed() {
		
		String title=myLeave.MyLeaveListPageTitle();
		Assert.assertEquals("title is not correct", "My Leave List", title);
	}
	@Given("User is on My Leave List page")
	public void user_is_on_my_leave_list_page() {
	    
		System.out.println("User is already on MyLeave List Page");
		
	}
	@When("User validate Employee, Date,Leave Type,Number of Days fields")
	public void user_validate_employee_date_leave_type_number_of_days_fields() throws InterruptedException {
	    Thread.sleep(3000);
		String[] arr1=myLeave.validateMyLeaveListPageValues();
		
		System.out.println("Employee Name: " +arr1[0]);
		Assert.assertEquals("Employee Name is not correct", "Jacqueline White", arr1[0]);
		
		Assert.assertEquals("Leave type is not correct", "FMLA - US", arr1[1]);
		System.out.println("Leave Type: " +arr1[1]);
		
		Assert.assertEquals("No of Leave days are not correct", "1.00", arr1[2]);
		System.out.println("Number of Leave Days: " +arr1[2]);
		
	}
	@Then("My Leave List page validation is successful")
	public void my_leave_list_page_validation_is_successful() {
	   
		System.out.println("Applied Leave is validated successfully");
		
		
	}
	@When("User click Leave Calendar tab in left navigation")
	public void user_click_leave_calendar_tab_in_left_navigation() {
	   
		leaveCalendar=dashboard.leaveCalendarPage();
		
	}
	@Then("Leave Calendar page is displayed")
	public void leave_calendar_page_is_displayed() {
	   
		String title=leaveCalendar.LeaveCalendarPageTitle();
		Assert.assertEquals("LeaveCalendar Page title is not correct", "Leave Calendar", title);
		
	}

}
