package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginPage_step extends BaseClass{
	
	
	@When("Login with valid username and password")
	public DashboardPage login_with_valid_username_and_password() {
		
		initialization();
		
		LoginPage login = new LoginPage(); 
		return login.loginUserPass();
		
	}


}
