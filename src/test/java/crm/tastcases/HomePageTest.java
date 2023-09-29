package crm.tastcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPackage.CalendarPage;
import PomPackage.CampaignsPage;
import PomPackage.CasesPage;
import PomPackage.ContactPage;
import PomPackage.DocsPage;
import PomPackage.EmailPage;
import PomPackage.HomePageCRM;
import PomPackage.LoginPageCRM;
import TestBasePack.TestBase;
import UtilityPackage.UtilityClass;

public class HomePageTest extends TestBase {
	UtilityClass utilityClass;
	LoginPageCRM loginPageCRM;
	HomePageCRM homePageCRM;
	CalendarPage calendarPage;
	 CompaniesPage companiesPage;
	 ContactPage contactPage;
	 DealsPage  dealsPage;
	 TasksPage tasksPage;
	 CasesPage casesPage;
	 CallPage CallPage;
	 EmailPage  emailPage ;
	 TextSMSPage textSMSPage;
	 PrintPage PrintPage;
	 CampaignsPage campaignsPage;
	 DocsPage docsPage;
	 FormsPage  formsPage;
	 ReportsPage reportsPage;
	
	
	public HomePageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		utilityClass=new UtilityClass();
		loginPageCRM=new LoginPageCRM();
        homePageCRM  =loginPageCRM.LoginApplication(prop.getProperty("username"),prop.getProperty("password"));
        }
	
 @Test
 public void clickoncalender() throws IOException {
	 utilityClass.frame("mainpanel");
	 calendarPage =homePageCRM.clickonclander();
	 
 }
 @Test
 public void clickonContactPage() throws IOException {
 utilityClass.frame("mainpanel");
 contactPage = homePageCRM.clickonContactPage();
 }
 
	}
