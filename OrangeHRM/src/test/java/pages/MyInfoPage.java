package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import base.PersonalDetails;

public class MyInfoPage extends BaseClass{

	@FindBy(id = "personal_details_tab")
	WebElement Personaldetail_label;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement Firstname;
	
	@FindBy(xpath= "//input[@id='employeeId']")
	WebElement employeeid;
	
	@FindBy(xpath ="//input[@value='Female']")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\'15Baseball\']")
	WebElement sportcheckbox;
	
	@FindBy(xpath="//*[@id=\'content\']/div[2]/ui-view/div[2]/div/custom-fields-panel/div[1]/form/materializecss-decorator[3]/div/sf-decorator/div/button")
	WebElement savebutton;
	
	@FindBy(xpath = "//*[@id=\'1_inputfileddiv\']/div/input")
	WebElement dropdown_bloodgroup;
	
	@FindBy(xpath = "//*[@id='select-options-bb6efc69-c95c-0f8f-2338-b9469793e4a1']/li[3]/span")
	WebElement selectdropdown;
	
	@FindBy(tagName= "li")
	List<WebElement>litag;
	
	
   public MyInfoPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public String validateMyInfoPageTitle() //actions
	{
		return driver.getTitle();
	}
	
	public void clickSportCheckbox()
	{
	
		sportcheckbox.click();
	}
	
	public void updateBloogGroup()
	{
		dropdown_bloodgroup.click(); 
		savebutton.click();
	}
	
	public boolean validateSportCheckboxselected()
	{
		
		return sportcheckbox.isSelected();
	}
	
	
	public PersonalDetails validatePersonalDetails()
	{
		String firstname=Firstname.getAttribute("value");
		String empid= employeeid.getAttribute("value");
		String gender_name=gender.getAttribute("value");
		
		PersonalDetails details=new PersonalDetails(firstname, empid,gender_name );
		return details;
	}
	
	
	
}
