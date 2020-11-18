package stepDefinations;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.CandidatesPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.VacanciesPage;

public class RecruitmentPage_step extends BaseClass {

	LoginPage login;
	DashboardPage dashboard= new DashboardPage();
	VacanciesPage vacancies;
	CandidatesPage candidates;
	
	@Given("User is on Recruitment tab")
	public void user_is_on_recruitment_tab() {
	    
		dashboard.recruitmentClick();
	}

	@When("User click on Vacancies under Recruitment page in left navigation")
	public void user_click_on_vacancies_under_recruitment_page_in_left_navigation() {
	    
		vacancies=dashboard.vacanciesClick();
	}

	@Then("Vacancies page  is displayed with correct Vacancy, Job Title,Location")
	public void vacancies_page_is_displayed_with_correct_vacancy_job_title_location() {
	    
		String title= vacancies.vacanciesPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		driver.switchTo().frame("noncoreIframe");
		
		String[] arr1= vacancies.validateVacanciesPageValues();
		
		System.out.println("vacancy name of vacancies page is correct: " +arr1[0]);
		Assert.assertEquals("vacancy name of vacancies page is not correct", "Customer Success Executive", arr1[0]);
		
		Assert.assertEquals("job title of vacancies page is not correct", "Customer Success Executive", arr1[1]);
		System.out.println("job title of vacancies page is correct: " +arr1[1]);
		
		Assert.assertEquals("location of vacancies page is not correct", "HQ - CA, USA", arr1[2]);
		System.out.println("location of vacancies page is correct: " +arr1[2]);
	}

	@When("User clicks on Candidates tab under Recruitment tab in left navigation")
	public void user_clicks_on_candidates_tab_under_recruitment_tab_in_left_navigation() {
	   
		candidates= dashboard.CandidatesClick();
	}

	@Then("Candidates page is displayed with correct vacancy,candidate,email")
	public void candidates_page_is_displayed_with_correct_vacancy_candidate_email() {
		
		String title= candidates.candidatesPageTitle();
		Assert.assertEquals("title is not correct", "OrangeHRM", title);
		System.out.println("title is correct: " +title);
		
		String[] arr1= candidates.validateCandidatesPageValues();
		
		System.out.println("vacancy name of candidates page is correct: " +arr1[0]);
		Assert.assertEquals("vacancy name of candidates page is not correct", "Sales Manager", arr1[0]);
		
		Assert.assertEquals("candidate name of candidates page is not correct", "John Abruzzi", arr1[1]);
		System.out.println("candidate name of candidates page is correct: " +arr1[1]);
		
		Assert.assertEquals("email of candidates page is not correct", "johnabruzzi@gmail.com", arr1[2]);
		System.out.println("email of candidates page is correct: " +arr1[2]);
	}

}
