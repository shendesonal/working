package PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import TestBasePack.TestBase;

public class LoginPageCRM extends TestBase{
	
	@FindBy (xpath = "//input[@name='username']")
    public WebElement userName ;
    
    @FindBy (xpath = "//input[@type='password']")
    public WebElement password;
    
    @FindBy (xpath = "//input[@value='Login']")
    public WebElement loginButton ;
    
    @FindBy(xpath = "(//*[@class=\"img-responsive\"])[1]")
	 public WebElement crmlogo;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement homeLink;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	public WebElement signupLink;

	@FindBy(xpath = "//a[contains(text(),'Pricing')]")
	public WebElement pricinglink;

	@FindBy(xpath = "//a[contains(text(),'Features')]")
	public WebElement FeaturesLink;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	public WebElement contactLink;

	@FindBy(xpath = "//a[contains(text(),'Customers')]")
	public WebElement customerslink;
	
	public LoginPageCRM() throws IOException {
		
		PageFactory.initElements(driver, this );
	}

	//reusable method 
	public boolean isLinksDisplayed(WebElement element  ) {
	return 	element.isDisplayed();
		
	}

		
	 public HomePageCRM LoginApplication (String un,String pass) throws IOException {
		 userName.sendKeys(un);
		 password.sendKeys(pass);
		 loginButton.click();
		 return new HomePageCRM();
		 
	 }
		}
	
	
	
	
   
		
		
	 
	    	

	
	    
	       


