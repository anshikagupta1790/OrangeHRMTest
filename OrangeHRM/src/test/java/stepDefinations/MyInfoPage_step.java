package stepDefinations;

import org.junit.Assert;
import base.BaseClass;
import base.PersonalDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.MyInfoPage;

public class MyInfoPage_step extends BaseClass{
	
	MyInfoPage myinfo;
	PersonalDetails _detail;
	DashboardPage dashboard=new DashboardPage();

	@Given("User is on Dashboard page")
	public void user_is_on_Dashboard_page() {
		
		System.out.println("user is already on dashboard page");
	    
	}
	@When("User clicks on MyInfo tab in left navigation")
	public void user_clicks_on_my_info_tab_in_left_navigation() {
	    myinfo=dashboard.MyInfoclick();
	}

	@Given("User is on MyInfo page")
	public void user_is_on_my_info_page() {
	    
		String info_title=myinfo.validateMyInfoPageTitle();
		Assert.assertEquals("title is not correct", "My Info",info_title);
	}
	@When("User validate firstname,employee Id,Gender")
	public void user_validate_firstname_employee_id_gender() {
		
		 _detail=myinfo.validatePersonalDetails();
		
		System.out.println("firstName: "+_detail.firstname);
		System.out.println("EmployeeID: "+_detail.employeeid);
		System.out.println("Gender: " +_detail.gender_value);
		Assert.assertEquals("firstname is not correct", "Jacqueline",_detail.firstname);
		Assert.assertEquals("empid is not correct", "1020",_detail.employeeid);
		Assert.assertEquals("gender is not correct", "Female",_detail.gender_value);
	}

	@Then("MyInfo validation is successful")
	public void my_info_validation_is_successful() {
		
		System.out.println("validation done");
		
	}
	
	

}
