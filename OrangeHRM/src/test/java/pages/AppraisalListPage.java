package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class AppraisalListPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/ui-view/div/div/crud-panel/div/div/list/table/tbody/tr[1]/td[2]/ng-include/span")
	WebElement empName;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/ui-view/div/div/crud-panel/div/div/list/table/tbody/tr[1]/td[6]/ng-include/span")
	WebElement description;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/ui-view/div/div/crud-panel/div/div/list/table/tbody/tr[1]/td[7]/ng-include/span")
	WebElement appraisalStatus;
	
	public AppraisalListPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String appraisalListPageTitle() {
		
		return driver.getTitle();
		
	}
	public String[] appraisalListPageValidate() {
		
		String[] arr= {empName.getText(),description.getText(),appraisalStatus.getText()};
		return arr;
		
	}


}
