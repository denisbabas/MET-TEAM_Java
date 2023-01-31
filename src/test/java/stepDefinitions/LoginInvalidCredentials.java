package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class LoginInvalidCredentials extends CommonMethods {
	
	@Given("Login With ivalid login {string} and valid password {string}")
	public void login_With_ivalid_login_and_valid_password(String UserName, String Password) {
	    sendKeys(loginPageElements.login, UserName);
	    sendKeys(loginPageElements.password, Password);
	    click(loginPageElements.logInButton);
	}

	@Then("verify error message {string} from the page and header {string}")
	public void verify_error_message_from_the_page_and_header(String TextFromPage, String Header) throws InterruptedException {
	Thread.sleep(2000);
	
		Assert.assertEquals(Header,loginPageElements.errorWindowsHeader.getText());
	    Assert.assertEquals(TextFromPage,loginPageElements.errorWindowsText.getText());
	    click(loginPageElements.okButton);
	    
	}



}
