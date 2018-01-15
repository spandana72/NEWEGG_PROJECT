package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.BaseUtil;

/**
 * Created by Spandana on 01/14/2018.
 */

public class AddToCart extends BaseUtil{

    public BaseUtil base;
    
       public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='haQuickSearchBox']")
    public WebElement searchTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='haFormQuickSearch']/div/div[3]/button")
    public WebElement searchButton;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='SrchInDesc_top']")
    public WebElement searchWith;
  
    @FindBy(how = How.XPATH, using = ".//*[@id='btn_InnerSearch']")
    public WebElement goButton;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyArea']/div[10]/form[1]/table[2]/tbody/tr/td[1]/div/div/a")
    public WebElement validateProdcuct;
     
    
    
    public WebElement searchTextField() {
		return searchTextField;
	}

    public WebElement searchButton() {
		return searchButton;
	}
    
    public WebElement searchWith() {
		return searchWith;
	}
    
    public WebElement goButton() {
		return goButton;
	}
    
    public WebElement validateProdcuct() {
		return validateProdcuct;
	}
   
}