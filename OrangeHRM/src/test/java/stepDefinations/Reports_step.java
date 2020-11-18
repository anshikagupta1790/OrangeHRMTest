package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.MyMonthlyAttendancePage;
import pages.ProjectTimeReportPage;


public class Reports_step extends BaseClass
{
	DashboardPage dashboard=new DashboardPage();
	ProjectTimeReportPage projecttimereport;
	MyMonthlyAttendancePage mymonthlyattendance;
	
	@Given("User is on Reports page")
	public void user_is_on_reports_page() throws InterruptedException {
		
	    dashboard.Timeclick();
	    Thread.sleep(3000);
	    dashboard.reports_timeClick();
	}

	@When("User click Project Time tab under Reports page in left navigation")
	public void user_click_project_time_tab_under_reports_page_in_left_navigation() throws InterruptedException {
	   
		projecttimereport=dashboard.project_timeClick();
	   
	}

	@Then("Project time report  page  is displayed")
	public void project_time_report_page_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
	   String title= projecttimereport.projecttimereportPageTitle();
	   Assert.assertEquals("title is not correct", "Project Time Report", title);
	}

	
	@Given("User is on My Monthly Attendance page")
	public void user_is_on_my_monthly_attendance_page() {
		mymonthlyattendance=dashboard.my_MonthlyattendanceClick();
	}

	@When("User click on Search button")
	public void user_click_on_search_button() 
	{
		driver.switchTo().frame("noncoreIframe"); // witch to iFrame
	    mymonthlyattendance.searchReport();
	}

	@Then("My Monthly Attendance Report is displayed with date and no of hours worked columns")
	public void my_monthly_attendance_report_is_displayed_with_date_and_no_of_hours_worked_columns() throws InterruptedException {
	   String title=mymonthlyattendance.myMonthlyAttendancePageTitle();
	   Assert.assertEquals("title is not correct", "OrangeHRM", title);
	   
	   String[] arr1= mymonthlyattendance.validateMyMonthlyAttendancePageValues();
	    System.out.println("date label of My monthly attendance report is correct: " +arr1[0]);
		Assert.assertEquals("date label of My monthly attendance is not correct", "Date", arr1[0]);
		
		
		System.out.println("activity level of My timesheet is correct: " +arr1[1]);
		Assert.assertEquals("no of hours worked label of My monthly attendance report is not correct", "No. of Hours Worked", arr1[1]);
	}

}
