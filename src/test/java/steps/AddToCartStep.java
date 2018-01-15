package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseUtil;
import Pages.AddToCart;
import Pages.ForgotPassword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Spandana on 01/14/2018.
 */

public class AddToCartStep extends BaseUtil{

    String productTitle = null;
	public BaseUtil base;
    public AddToCart AddToCart;
    Properties prop = new Properties();
   	InputStream input = null;
   	
    public AddToCartStep(BaseUtil base) {
        this.base = base;
    }
   
    @When("^Search a Product$")
    public void searchProduct() throws Throwable {
    	AddToCart ATC = new AddToCart(base.driver);
    	ATC.searchTextField().sendKeys("Wrist Watches");
    }
    
    @Then("^Tap on Search$")
    public void searchButton() throws Throwable {
    	AddToCart ATC = new AddToCart(base.driver);
    	ATC.searchButton().click();
    }
    
    @When("^Search With a Particular Product$")
    public void searchWithProduct() throws Throwable {
    	AddToCart ATC = new AddToCart(base.driver);
    	ATC.searchWith().sendKeys("Garmin Watches");
    }
   
    @Then("^Tap on Go$")
    public void goButton() throws Throwable {
    	AddToCart ATC = new AddToCart(base.driver);
    	ATC.goButton().click();
    }
    
    @When("^Select item and click on Add To Cart and Validate the item in ADD TO CART$")
    public void clickOnAddToCart() throws Throwable {
		
    	try {
           
         //Get number of rows In table.
   		 int garminWatchListCount = base.driver.findElements(By.xpath(".//*[@id='bodyArea']/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div")).size();
   		 System.out.println("Number Of Garmin Watches in a page = "+garminWatchListCount);
   	
   		 //Used for loop for number of rows.
   		 for (int i=1; i<=garminWatchListCount; i++){
   			 
   		   String productXpath= ".//*[@id='bodyArea']/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div["+i+"]/div/div[2]/div/div[1]/button";
		   
		   String addToCartButton = base.driver.findElement(By.xpath(".//*[@id='bodyArea']/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div["+i+"]/div/div[2]/div/div[1]/button")).getText();   
		   
		    if(addToCartButton.contains("ADD TO CART")){
			
			   int j = i;
			   
			   String productTitle = base.driver.findElement(By.xpath(".//*[@id='bodyArea']/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div["+j+"]/div/a")).getText();
			  
			   base.driver.findElement(By.xpath(productXpath)).click();
			   
			   //Get number of rows In table.
		   		 int productListinAddToCart = base.driver.findElements(By.xpath(".//*[@id='bodyArea']/div[10]/form[1]/table")).size();
		   		
		   		 System.out.println("Number Of Products in a AddtoCart = "+productListinAddToCart);
		   	
		   		 //Used for loop for number of rows.
		   		 for (int k=2; k<=productListinAddToCart; k++){
		   			 
		   			String productinCart = base.driver.findElement(By.xpath(".//*[@id='bodyArea']/div[10]/form[1]/table["+k+"]/tbody/tr/td[1]/div/div/a")).getText();
		   			
		   			Assert.assertTrue(productTitle.contains(productinCart));
		   			
		   			break;
		   		
		   		 }
		   		 
		   		String productCount = base.driver.findElement(By.xpath(".//*[@id='bodyArea']/div[10]/form[1]/table[1]/thead/tr/th[1]/h1")).getText();
		   		
		   		base.driver.navigate().back();
			    
		   		if(productCount.contains("2")){
		   			
		   			break;
		   		}
		   	
		   	 }
		  
   		 	} 
        	
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	
    }

}
