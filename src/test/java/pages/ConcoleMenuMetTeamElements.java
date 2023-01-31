package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConcoleMenuMetTeamElements extends BaseClass{

	@FindBy (id = "btn-mnuMaintenance")
	public WebElement btnMaintenance;
	
	
public ConcoleMenuMetTeamElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}
