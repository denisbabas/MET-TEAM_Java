package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class MaintenanceSubMenuElements extends BaseClass {

	@FindBy (id = "txt-mnuMaintAssets")
	public WebElement maintAssets;
	
	
public MaintenanceSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

