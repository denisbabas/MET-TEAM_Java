package stepDefinitions;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class CreateWorkOrderFromAsset extends CommonMethods {
	
	@When("Click on Maintenance and click on the Asset")
	public void click_on_Maintenance_and_click_on_the_Asset() throws InterruptedException {
		Thread.sleep(2000);
		concoleMenuMetTeamElements.btnMaintenance.click();
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintAssets.click();
		
		}

	
	@Then("Find Asset {string} is open and click on Add button")
	public void find_Asset_is_open_and_click_on_Add_button(String WindowName) throws Throwable {
		
		CommonMethods.swithToFrame(findScreenWindowElements.WindowSwitch);
		Thread.sleep(2000);
		
		
		CommonMethods.click(findScreenWindowElements.addButton);
		Thread.sleep(1000);
		
	}
	@Then("{string} window is opened and click on Elipsis button next to the Customer")
	public void window_is_opened_and_click_on_Elipsis_button_next_to_the_Customer(String WindowName) throws InterruptedException {
		CommonMethods.swithToFrame(addAssetWindowElements.windowSwitch);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.elipsisButtonCustomer);
		
		
	}
	 
	@Then("{string} window is open werify title and click on Find button")
	public void window_is_open_werify_title_and_click_on_Find_button(String WindowName) throws Throwable {		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommonMethods.swithToFrame(findScreenWindowElements.windowSwitchTo);
		
		CommonMethods.waitForVisib(findScreenWindowElements.FindButton);
		CommonMethods.click(findScreenWindowElements.FindButton);
		Thread.sleep(1000);
		
	}
	
	@Then("find specific {string} from the grid and click ok button")
	public void find_specific_from_the_grid_and_click_ok_button(String string) throws Throwable {
	 	
		for (WebElement element : findScreenWindowElements.gridTypesFromTheFindFacility ) {
    		String name = element.getText();
    	
    	
    	if(name.equals(string)){
    		
    	JsCommonMethods.drawBlueBorder(element);
    	CommonMethods.click(element);
    	Thread.sleep(2000);
    	
    	}
    	
}   CommonMethods.click(findTypeWindowElements.okButton); 

}
	@Then("Click on elipsis button next to the Type Description {string} window is open")
	public void click_on_elipsis_button_next_to_the_Type_Description_window_is_open(String string) throws Throwable {
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(addAssetWindowElements.windowSwitch);
	    CommonMethods.click(addAssetWindowElements.elipsisButtonTypeDescription);
	    Thread.sleep(1000);
	}

	@Then("Click on the Find button then find {string} from the grid and click ok button")
	public void click_on_the_Find_button_then_find_from_the_grid_and_click_ok_button(String string) throws Throwable  {
		
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		CommonMethods.swithToFrame(findScreenWindowElements.switch2);
		
	    CommonMethods.click(findScreenWindowElements.FindButton);
	    Thread.sleep(1000);
	    	    	
	    	for (WebElement element : findTypeWindowElements.gridTypesFromTheFindType ) {
	    		String name = element.getText();
	    	
	    	
	    	if(name.equals(string)){
	    		
	    	JsCommonMethods.drawBlueBorder(element);
	    	CommonMethods.click(element);
	    	Thread.sleep(2000);
	    	
	    	}
	    	
	}   CommonMethods.click(findTypeWindowElements.okButton); 

	}
	@Then("click yes on Update all Asset data with current Type data?\" window")
	public void click_yes_on_Update_all_Asset_data_with_current_Type_data_window() throws Throwable {
		Thread.sleep(3000);
	    CommonMethods.swithToFrame(addAssetWindowElements.windowSwitch);
	    CommonMethods.click(findTypeWindowElements.buttonYesOnChildWindow);
	    Thread.sleep(2000);
	    
	}
	
	
	@Then("click on save button and Receive Asset")
	public void click_on_save_button_and_Receive_Asset() throws Throwable {
		driver.switchTo().parentFrame();
		CommonMethods.swithToFrame(addAssetWindowElements.windowSwitch);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.buttonSave);
		
		Thread.sleep(2000);
		JsCommonMethods.drawRedBorder(addAssetWindowElements.buttonReceive);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.buttonReceive);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.buttonReceive);
		Thread.sleep(2000);
	}
	
	@Then("{string} window is opened verify title and click on Add Result button")
	public void window_is_opened_verify_title_and_click_on_Add_Result_button(String string) throws Throwable {
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		CommonMethods.swithToFrame(editWorkOrderElements.FrameWorkOrder);
		CommonMethods.waitForClickability(editWorkOrderElements.buttonAddResult);
		CommonMethods.click(editWorkOrderElements.buttonAddResult);
		Thread.sleep(3000);
	}
	
	@Then("Open Chromidium")
	public void open_Chromidium() throws Throwable {
		
		
		DesktopOptions options  = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files (x86)\\Fluke\\METCAL\\mcrt.exe");
		//WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		
		
		
//		WebElement el = driver.findElementByName("Open mcrt");
//		WebElement close = driver.findElementByName("Close");
//		close.click();
		
		
		//CommonMethods.click(el);
		Thread.sleep(7000);

		Thread.sleep(3000);
	}

	
	
	}



	


