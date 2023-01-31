package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPageElements extends BaseClass {
	
/**
 * Beginning Elements from LoginPage
 */
	@FindBy (id = "username")
	public WebElement login;
	                
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy (id ="btn-auth-submit")
	public WebElement logInButton;
	
	@FindBy (id = "ext-gen45")
	public WebElement errorWindowsHeader; 
	
	
	@FindBy (id = "ext-gen57")
	public WebElement errorWindowsText; 
	
//This is Ok button from the Login Error message. 
	 @FindBy (id = "ext-comp-1002")
	 public WebElement 	okButton;
	/**
	 * End Elements from LoginPage
	 */
	 
	 //this is how you login text from main page
	 @FindBy (id = "logged-in-user")
	 public WebElement howYouLoginText;
	
	
	public LoginPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
