package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.DisciplinaryCasesPage;
import pages.ViewMyActionsPage;

public class DisciplinePage_step extends BaseClass{
	
	DashboardPage dashboard=new DashboardPage();
	DisciplinaryCasesPage disciplinePage;
	ViewMyActionsPage actionPage;
	
	@Given("User is on Discipline tab")
	public void user_is_on_discipline_tab() {

		dashboard.DisciplineClick();
	}

	@When("User click on Disciplinary Cases under Discipline tab in left navigation")
	public void user_click_on_disciplinary_cases_under_discipline_tab_in_left_navigation() {

		disciplinePage=dashboard.DisciplinaryCasesClick();
	}
	@Then("Disciplinary Cases page  is displayed with correct Employee,Case Name,Description")
	public void disciplinary_cases_page_is_displayed_with_correct_employee_case_name_description() {

		
		String title= disciplinePage.DisciplinaryCasesPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is: " +title);
		
		driver.switchTo().frame("noncoreIframe");
		
		String[] arr1=disciplinePage.validateDisciplinaryCasesPageValues();
		
		System.out.println("Employee Name is: " +arr1[0]);
		Assert.assertEquals("Employee Name is not correct", "Tacitus Tabby", arr1[0]);
		
		Assert.assertEquals("Employee Case Name is not correct", "Drug and alcohol use", arr1[1]);
		System.out.println("aEmployee Case Name is: " +arr1[1]);
		
		Assert.assertEquals("Description is not correct", "Tacitus has bought some drugs and sold them to his colleagues during the working hours.", arr1[2]);
		System.out.println("Description is: " +arr1[2]);
		
	}
	@When("User clicks on My Actions tab under Discipline tab in left navigation")
	public void user_clicks_on_my_actions_tab_under_discipline_tab_in_left_navigation() throws InterruptedException {

		Thread.sleep(3000);
		actionPage=dashboard.MyactionsClick();
	}
	@Then("View My Actions page is displayed with correct Employee,Action,Description")
	public void view_my_actions_page_is_displayed_with_correct_employee_action_description() {

		String title= actionPage.ViewMyActionsPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is: " +title);
		
		String[] arr1=actionPage.validateViewMyActionsPageValues();
		
		System.out.println("Employee Name is: " +arr1[0]);
		Assert.assertEquals("Employee Name is not correct", "Linda Jane Anderson", arr1[0]);
		
		Assert.assertEquals("Action is not correct", "Have disciplinary hearing", arr1[1]);
		System.out.println("Action is: " +arr1[1]);
		
		Assert.assertEquals("Description is not correct", "Should take necessary steps against it.", arr1[2]);
		System.out.println("Description is: " +arr1[2]);
	
	}

}
