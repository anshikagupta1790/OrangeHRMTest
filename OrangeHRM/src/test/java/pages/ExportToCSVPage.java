package pages;


import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ExportToCSVPage extends BaseClass{
	
	
	
	 public ExportToCSVPage() {
		 PageFactory.initElements(driver, this);
		 
	}
	
	public String validateExportToCSVTitle() {
		
		return driver.getTitle();
		
	}

}
