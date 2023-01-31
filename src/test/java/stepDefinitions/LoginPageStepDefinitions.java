package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigsReader;
import utils.JsCommonMethods;

public class LoginPageStepDefinitions extends CommonMethods{
	
	
	@Given("Login With valid credentials")
	public void login_With_valid_credentials() {
	    sendKeys(loginPageElements.login, ConfigsReader.getPropValue("username"));
	    sendKeys(loginPageElements.password, ConfigsReader.getPropValue("password"));
	    click(loginPageElements.logInButton);
	}

	@When("Verify you login in as {string}")
	public void verify_you_login_in_as(String LoginNameFromMainPage) {
		JsCommonMethods.drawRedBorder(loginPageElements.howYouLoginText);
		Assert.assertEquals(LoginNameFromMainPage,loginPageElements.howYouLoginText.getText());
	}

}
