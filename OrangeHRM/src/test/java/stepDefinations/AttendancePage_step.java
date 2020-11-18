package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.MyRecordsPage;
import pages.PunchInOutPage;

public class AttendancePage_step extends BaseClass {
	
	DashboardPage dashboard=new DashboardPage();
	MyRecordsPage myRecordpage;
	PunchInOutPage punchinout;
	
	@Given("User is on Attendance page")
	public void user_is_on_attendance_page() {

		dashboard.Timeclick();
		dashboard.AttendanceClick();
	}

	@When("User click My Records tab under Attendance page in left navigation")
	public void user_click_my_records_tab_under_attendance_page_in_left_navigation() {

		myRecordpage=dashboard.MyRecordsClick();
		
	}
	@Then("My Records page  is displayed with My Attendance Records label")
	public void my_records_page_is_displayed_with_my_attendance_records_label() {

		String title=myRecordpage.MyRecordsPageTitle();
		
		Assert.assertEquals("tile is not correct", "OrangeHRM", title);
		
		driver.switchTo().frame("noncoreIframe");
		
		String label=myRecordpage.validateMyRecordsPageLabel();
		Assert.assertEquals("label is not correct", "My Attendance Records", label);
		
	}
	@Given("User is on Punch in\\/out page")
	public void user_is_on_punch_in_out_page() {
		
		System.out.println("Click punch in out page");
		
	
	}
	@When("User clicks on Punch in\\/out tab under Attendance tab in left navigation")
	public void user_clicks_on_punch_in_out_tab_under_attendance_tab_in_left_navigation() {
	    
		punchinout=dashboard.PunchInClick();
	}
	@Then("Punch in\\/out page is displayed with correct Punch_in Time")
	public void punch_in_out_page_is_displayed_with_correct_punch_in_time() {
		
		String title= punchinout.PunchInOutPageTitle();
		Assert.assertEquals("title is not correct", "Punch In/Out", title);
		System.out.println("title is: " +title);
		
		String time=punchinout.validatePunchedtimeValue();
		Assert.assertEquals("Punched in time is not correct", "Thu, 22 Oct 2020 12:40", time);
		System.out.println("Punched in time is: " +time);
	}

}
