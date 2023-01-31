package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class EditWorkOrderElements extends BaseClass {

	@FindBy (xpath ="//*[@id=\"frame_5\"]")
	public WebElement FrameWorkOrder;
	
	
	@FindBy (id = "btn-tbAddResult")
	public WebElement buttonAddResult;
	
	
	
	
public EditWorkOrderElements() {
		
	    PageFactory.initElements(driver, this);
}
}
