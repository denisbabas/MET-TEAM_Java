package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FindScreenWindowElements extends BaseClass {
	
	/**
     * Beginning Elements which give the Title finds screen Name"
     */ 
	
	@FindBy (id = "ext-gen74")
	public WebElement TextFromTheTitle;
	/**
     * End Elements which give the Title finds screen Name"
     */
	
	
	/**
	 * Beginning Elements from FindScreen
	 */
	//this element switch to frame from main page to find screen
	@FindBy (xpath = "//*[@id =\"frame_1\"]")
	public WebElement WindowSwitch;
	
	//this element switch to frame from Add Asset screen to Find Facility screen
	@FindBy (xpath = "//*[@id=\"frame_3\"]")
	public WebElement windowSwitchTo;
		     
	@FindBy (xpath = "//*[@id=\"frame_4\"]")
	public WebElement switch2;
	
	@FindBy (xpath = "//*[@id=\"frame_16\"]")
	public WebElement switch3;
	

	@FindBy (xpath = "//*[@id=\"btn-btnAdd\"]")
	public WebElement addButton;
	
	@FindBy (id = "btn-btnFind")
	public WebElement FindButton;
	
	@FindBy (xpath = "//*[@class=\"x-grid3-body\"]/div/table/tbody/tr/td/div")
	public List<WebElement> gridTypesFromTheFindFacility;
	
	
		
	public FindScreenWindowElements() {
		
	    PageFactory.initElements(driver, this);
	    
	    /**
	     * End Elements from FindScreen
	     */ 
		
}
}