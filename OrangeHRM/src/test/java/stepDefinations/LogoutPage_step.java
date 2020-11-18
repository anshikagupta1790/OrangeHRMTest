package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.When;
import pages.LogoutPage;

public class LogoutPage_step extends BaseClass{
	
	LogoutPage logout=new LogoutPage();
	
	@When("User Logout from the page")
	public void user_logout_from_the_page() throws InterruptedException {
		
		logout.LogoutClick();
		driver.close();
	}


}
