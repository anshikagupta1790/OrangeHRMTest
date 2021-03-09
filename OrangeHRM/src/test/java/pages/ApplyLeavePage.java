package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ApplyLeavePage extends BaseClass {
	
	@FindBy(xpath="//*[@id='leaveType_inputfileddiv']/div/input")
	WebElement leavetypedropdown;
	
	@FindBy(xpath="//input[@id='from']")
	WebElement fromDate;
	
	@FindBy(xpath="//input[@id='to']")
	WebElement toDate;
	
	@FindBy(xpath="//*[@id=\"applyLeaveForm\"]/div[2]/div/button")
	WebElement applyleave;
	
public ApplyLeavePage() {
		
		PageFactory.initElements(driver, this);
		
	}

public String ApplyLeavePageTitle() // actions
	{
		return driver.getTitle();
	}

public void validateApplyLeave() throws InterruptedException
	{
		Thread.sleep(3000);
		//leavetypedropdown.click();
		
		//driver.findElement(By.xpath("//*[@id='select-options-3f3c6e99-967e-6c01-a643-e784b4eaaeb7']/li[3]/span")).click();
		 
		fromDate.sendKeys("Fri, 18 Dec 2020");
		Thread.sleep(3000);
		toDate.sendKeys("Fri, 18 Dec 2020");
		//Thread.sleep(4000);
		applyleave.submit();
		System.out.println("Hi");
		System.out.println("Check");

		System.out.println("done the chnages1");

		
	}
}
