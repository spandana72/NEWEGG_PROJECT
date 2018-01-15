package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Base.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Spandana on 01/14/2018.
 */

public class ForgotPassword extends BaseUtil{

    public BaseUtil base;
    
       public ForgotPassword(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='usaSite']/a")
    public WebElement loginButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='bodyCenterArea']/div[1]/h3")
    public WebElement secureLogIntxt;

    @FindBy(how = How.ID, using = "UserName")
    public WebElement newEggUserID;

    @FindBy(how = How.XPATH, using = ".//*[@id='QuickLinks']/dd[1]/form/table/tbody/tr[5]/td[2]/span/a")
    public WebElement forgotPasswordLink;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyCenterArea']/div[1]/h3")
    public WebElement logInAssistancetxt;

    @FindBy(how = How.XPATH, using = ".//*[@id='QuickLinks']/dd/form/table/tbody/tr[3]/td[2]/input")
    public WebElement emailAddress;
    
    @FindBy(how = How.NAME, using = "submit")
    public WebElement submit;
   
    
    public WebElement loginButton() {
		return loginButton;
	}
    
    public WebElement forgotPasswordLink() {
		return forgotPasswordLink;
	}
   
    public WebElement emailAddress() {
		return emailAddress;
	}
    
    public WebElement submit() {
		return submit;
	}
    
    
  /*  public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    
    @When("^Tap on Login/RegisterButton$")
    public void tapOnLogin() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.loginButton();
    }
    
    @Then("^Click on Forgot Password Link on a page$")
    public void forgotPasswordLink() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.forgotPasswordLink();
    }
    
    @When("^Enter Email address$")
    public void emailAddress() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.emailAddress();
    }

    @When("^Tap on SubmitButton$")
    public void submitButton() throws Throwable {
    	ForgotPassword FP = new ForgotPassword(base.driver);
    	FP.emailAddress();
    }
    */

}
