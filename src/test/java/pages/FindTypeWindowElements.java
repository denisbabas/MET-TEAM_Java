package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FindTypeWindowElements extends BaseClass {

	@FindBy (xpath ="//*[@class=\"x-grid3-body\"]/div/table/tbody/tr/td/div")
	public List<WebElement> gridTypesFromTheFindType;
	
	@FindBy (xpath ="//*[@id=\"btn-btnOk\"]")
	public WebElement okButton;
	
	
	@FindBy(id = "id-Yes")
	public WebElement buttonYesOnChildWindow;
		
	
public FindTypeWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}