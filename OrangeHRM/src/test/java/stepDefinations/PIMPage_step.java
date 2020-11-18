package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.EmployeeListPage;

public class PIMPage_step extends BaseClass{
	
	DashboardPage dashboard=new DashboardPage();
	EmployeeListPage emplist;
	
	@Given("User is on PIM tab")
	public void user_is_on_pim_tab() {
		System.out.println("User is on Dashboard page");
	}

	@When("User click on Employee list tab under PIM tab in left navigation")
	public void user_click_on_employee_list_tab_under_pim_tab_in_left_navigation() {
		
		emplist=dashboard.PIMClick();
		
		String title=emplist.employeeListTitle();
		Assert.assertEquals("title is not correct", "Employee List", title);
		
	}
	@Then("Employee list page is displayed with employee name search text box and correct Employee id,name details")
	public void employee_list_page_is_displayed_with_employee_name_search_text_box_and_correct_employee_id_name_details() {
		
		String[] arr1=emplist.validateEmpList();
		
		System.out.println("employee ID: " +arr1[0]);
		Assert.assertEquals("employee id is not correct", "0044", arr1[0]);
		
		Assert.assertEquals("Employee Name is not correct: ", "Odis Adalwin", arr1[1]);
		System.out.println("Employee Name is: " +arr1[1]);
		
		Assert.assertEquals("Job Title is not correct", "HR Executive", arr1[2]);
		System.out.println("Job Title is: " +arr1[2]);
		
	}
	
	@Given("User is on Add Employee tab")
	public void user_is_on_add_employee_tab() {
		
		System.out.println("User is on Dashboard page");
	}

	@When("User clicks on Add Employee tab under PIM tab in left navigation")
	public void user_clicks_on_add_employee_tab_under_pim_tab_in_left_navigation() throws InterruptedException {
		
		dashboard.addEmployeeTagClick();
		Thread.sleep(4000);
		
	}
	@Then("Add Employee window is displayed")
	public void add_employee_window_is_displayed() {
		
		String alertWindow=dashboard.switchAlert();
		Assert.assertEquals("Add Employee Alert tab is not displayed", "Add Employee",alertWindow);
		
	}


}
