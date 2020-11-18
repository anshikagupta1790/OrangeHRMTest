package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.AssestsPage;
import pages.DashboardPage;
import pages.PublishedDocumentsPage;

public class MorePage_step extends BaseClass {
	
	DashboardPage dashboard=new DashboardPage();
	PublishedDocumentsPage publisheddocumentspage;
	AssestsPage assestspage;
	
	@Given("User is on More tab")
	public void user_is_on_more_tab() {
	    dashboard.moreClick();
	}

	@When("User click on Announcements tab under More tab in left navigation and click on Documents")
	public void user_click_on_announcements_tab_under_more_tab_in_left_navigation_and_click_on_documents() {
	    dashboard.AnnouncementsClick();
	    publisheddocumentspage= dashboard.documentsClick();
	}

	@Then("Published Documents page is displayed")
	public void published_documents_page_is_displayed() {
	   
		String title=publisheddocumentspage.publishedDocumentsPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		
	}

	@Given("User is on Assets tab")
	public void user_is_on_assets_tab() {
		driver.switchTo().frame("noncoreIframe");
	    dashboard.assestsClick();
	    
	}

	@When("User clicks on View Assets tab under Assets tab in left navigation")
	public void user_clicks_on_view_assets_tab_under_assets_tab_in_left_navigation() {
		assestspage=dashboard.viewAssestsClick();
	}

	@Then("Assets page is displayed with correct location,Assigned Employee,asset id")
	public void assets_page_is_displayed_with_correct_location_assigned_employee_asset_id() {
		
		String title= assestspage.AssestsPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1=assestspage.validateAssestsPageValues();
		
		System.out.println("Assest id is: " +arr1[0]);
		Assert.assertEquals("Assest id is not correct", "00001", arr1[0]);
		
		
		System.out.println("Location is: " +arr1[1]);
		Assert.assertEquals("Location is not correct", "Australian Regional HQ", arr1[1]);
		
		
		System.out.println("Assigned employee is: " +arr1[2]);
		Assert.assertEquals("Assigned employee is not correct", "Brody Alan", arr1[2]);
	}


}
