package glue.orders.steps;


import java.util.ArrayList;

import glue.orders.pages.SalesforceGlueContactsPage;
import net.thucydides.core.steps.ScenarioSteps;
import glue.orders.pages.LoginPage;
import glue.orders.pages.SalesforceGlueAccountPage;
import glue.orders.pages.SalesforceGlueHomePage;

/**
 * @author Srinivasa.Kuncha
 *
 */
public class EndUserSteps extends ScenarioSteps {

    LoginPage loginPage;
    SalesforceGlueHomePage homePage;
    ArrayList<String> arraylist = new ArrayList<String>(); 
    
    public void is_this_home_page()  {
    	loginPage.open();
		getDriver().manage().window().maximize();
	}
    
    public void supplyLoginCredientials(String username, String password){
    	loginPage.supplyLogin_Credientials(username, password);
    }

    public void loginSuccessful() {
    	
    	loginPage.clickOnLogin();
    	waitABit(3000);
    }	
    
    public void accessNewAccountPage() {
    	
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		homePage.AccountsTab();
		waitABit(4000);
		accountPage.newAccount();
    }
    
    public void searchForAnAccountUsingAccountName(String keyword) {
    	waitABit(1000);
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
    	accountPage.newAccountChild(keyword);
    }
    	
    public void accessNewAccountsPageviaSearchResults() {
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.newAccountButtonFromSearchResultsSection();
    }
    
/**************************************************CSVFile**********************************************/
    public void read_csv_input(String file) {

    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
    	accountPage.read_input(file);
	}
 
}