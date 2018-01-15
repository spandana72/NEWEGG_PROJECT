package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.BaseUtil;
import Pages.ForgotPassword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Spandana on 01/14/2018.
 */

public class GmailValidationStep extends BaseUtil{

    public BaseUtil base;
    public ForgotPassword ForgotPassword;
    
    Properties prop = new Properties();
   	InputStream input = null;
   	
    public GmailValidationStep(BaseUtil base) {
        this.base = base;
    }
    
  
    @When("^Validate Email for Reset Password$")
    public void LoginPage() throws Throwable {
        System.out.println("Navigate Login Page");
        input = new FileInputStream("src//test//resources//config//configuration.properties");
		prop.load(input);
		base.driver.manage().window().maximize();
		base.driver.get(prop.getProperty("GmailURL"));
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("ctschallenge@gmail.com");
        base.driver.findElement(By.xpath("identifierNext")).click();
        base.driver.findElement(By.name("password")).sendKeys("challenge2017");
        base.driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
    }

    @Then("^Tap on Reset Password Link$")
    public void ResetPasswordLink() throws Throwable {
    	List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
        System.out.println(a.size());
	        for(int i=0;i<a.size();i++){
	            System.out.println(a.get(i).getText());
	            if(a.get(i).getText().equals("info")){ 
	                a.get(i).click();
	                driver.findElement(By.xpath("//a[contains(.,'Reset Password Link')]")).click();
	            }
	        }
        
	}

 }
