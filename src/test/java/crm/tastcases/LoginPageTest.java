package crm.tastcases;



import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPackage.HomePageCRM;
import PomPackage.LoginPageCRM;
import TestBasePack.TestBase;
import UtilityPackage.UtilityClass;

public class LoginPageTest extends TestBase{
	UtilityClass utilityClass;
	LoginPageCRM loginPageCRM;
	HomePageCRM homePageCRM;
	public LoginPageTest() throws IOException {
		super();
		}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		
		loginPageCRM=new LoginPageCRM ();
		homePageCRM=loginPageCRM.LoginApplication(prop.getProperty("username"), prop.getProperty("password") );	 	
}
	
	
		
	
	@Test(priority=1)
	public void isCrmLogoDisplay() {
    boolean logo=loginPageCRM.isLinksDisplayed(loginPageCRM.crmlogo);
		Assert.assertTrue(logo);
		
	}
	@Test(priority=2)
	public void isSignUpLinkLinkDisplay() {
		
		loginPageCRM.isLinksDisplayed(loginPageCRM.signupLink);
	}
	@Test(priority=3)
	
	public void isPricingLinkDisplay() {
		loginPageCRM.isLinksDisplayed(loginPageCRM.pricinglink);
	}
	@Test(priority=4)
	public void isFeaturesLinkDisplay() {
		loginPageCRM.isLinksDisplayed(loginPageCRM.FeaturesLink);
	}
	@Test(priority=5)
	public void isCustomersLinkDisplay() {
		loginPageCRM.isLinksDisplayed(loginPageCRM.customerslink);
	}
	@Test(priority=6)
	public void isContactLinkDisplay() {
		loginPageCRM.isLinksDisplayed(loginPageCRM.contactLink);
	}
	@Test(priority=7)
	public void ishomeLinkDisplay() {
		loginPageCRM.isLinksDisplayed(loginPageCRM.homeLink);
		
	}
	
	
		

		
		}
		
		

	

