package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.ExportToCSVPage;
import pages.LoginPage;
import pages.MyTimesheetsPage;

public class TimePage_step extends BaseClass {

	LoginPage login;
	DashboardPage dashboard=new DashboardPage();
	MyTimesheetsPage mytimesheet;
	ExportToCSVPage exportTocsv;
	
	
	
	@Given("User is on Time page")
	public void user_is_on_time_page() {
	    
		dashboard.Timeclick();
		
	}

	@When("User click Timesheets tab and My Timesheets option in left navigation")
	public void user_click_timesheets_tab_and_my_timesheets_option_in_left_navigation() throws InterruptedException {
	   
		dashboard.Timesheetsclick();
		Thread.sleep(2000);
		mytimesheet= dashboard.MyTimesheetsTabclick();
		Thread.sleep(3000);
		
	}

	@Then("My Timesheets page  is displayed with correct Project,Activity,From,To,Duration fields")
	public void my_timesheets_page_is_displayed_with_correct_project_activity_from_to_duration_fields() {
	    
		String title= mytimesheet.MyTimesheetsPageTitle();
		Assert.assertEquals("title is not correct", "Detailed Timesheet", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1=mytimesheet.validateMyTimesheets_fields();
		
		System.out.println("project label of My timesheet is correct: " +arr1[0]);
		Assert.assertEquals("project label of My timesheet is not correct", "Project", arr1[0]);
		
		Assert.assertEquals("activity level of My timesheet is not correct", "Activity", arr1[1]);
		System.out.println("activity level of My timesheet is correct: " +arr1[1]);
		
		Assert.assertEquals("From label of My timesheet is not correct", "From", arr1[2]);
		System.out.println("From label of My timesheet is correct: " +arr1[2]);
		
		Assert.assertEquals("To label of My timesheet is not correct", "To", arr1[3]);
		System.out.println("To label of My timesheet is correct: " +arr1[3]);
		
		Assert.assertEquals("Duration label of My timesheet is not correct", "Duration", arr1[4]);
		System.out.println("Duration label of My timesheet is correct: " +arr1[4]);
	}

	@When("User clicks on Export To csv tab under Timesheets tab in left navigation")
	public void user_clicks_on_export_to_csv_tab_under_timesheets_tab_in_left_navigation() {
		
	    exportTocsv=dashboard.myTimeSheetExportCSVClick();
	    
	}

	@Then("Export To csv page is displayed")
	public void export_to_csv_page_is_displayed() {
		
	 	String title=exportTocsv.validateExportToCSVTitle();
	    System.out.println("export to CSV title: "+title);
	    Assert.assertEquals("Export to CSV title is not correct", "Detailed Timesheet", title);
	    driver.switchTo().frame("noncoreIframe");
	}


}
