package steps;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import Base.BaseUtil;
import Pages.ForgotPassword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Spandana on 01/14/2018.
 */
public class ForgotPasswordstep extends BaseUtil{

    public BaseUtil base;
    public ForgotPassword ForgotPassword;
    
    Properties prop = new Properties();
   	InputStream input = null;
   	
    public ForgotPasswordstep(BaseUtil base) {
        this.base = base;
    }
    
  
    @Given("^Launch Browser and Navigate to Application URL$")
    public void LoginPage() throws Throwable {
        System.out.println("Navigate Login Page");
        input = new FileInputStream("src//test//resources//config//configuration.properties");
		prop.load(input);
		base.driver.manage().window().maximize();
		base.driver.get(prop.getProperty("BaseURL"));
    }

    @When("^Tap on Login/RegisterButton$")
    public void tapOnLogin() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.loginButton().click();
    }
    
    @Then("^Click on Forgot Password Link on a page$")
    public void forgotPasswordLink() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.forgotPasswordLink().click();;
    }
    
    @When("^Enter Email address$")
    public void emailAddress() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.emailAddress().sendKeys("ctschallenge@gmail.com");;
    }

    @When("^Tap on SubmitButton$")
    public void submitButton() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.submit().click();
    }
}
