package stepDefinitions;

import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactor.LoginPage;
import pageFactor.LoginPage2;
import utility.BaseClass;
import utility.Constrants;

public class Login2 extends BaseClass{

	LoginPage2 loginPage2 ;
	
	
	@Given("tekExperience app to login1")
	public void tek_experience_app_to_login() throws Exception 
	{
		JSONObject jsonEntireObject =(JSONObject) readJsonData(Constrants.urlsPath);
		
		String browser = (String) jsonEntireObject.get("Browser");
	    System.out.println("Application opening on the drowser : "+browser);
	    
        String url = ((JSONObject) jsonEntireObject.get("URLS")).get("QA").toString();
	    System.out.println("Application URL : "+url);	
		
		driver = launchBrowser(browser,url);
		
        loginPage2 = PageFactory.initElements(driver, LoginPage2.class);

	}

	@Then("enter username1")
	public void enter_username() throws Exception
	{
		JSONObject jsonEntireObject =(JSONObject) readJsonData(Constrants.userCredentialsPath);

        String userName = ((JSONObject) jsonEntireObject.get("user1")).get("userId").toString();
		Thread.sleep(2000);

        loginPage2.enterUserName(userName);

	}

	@And("click on login button1")
	public void click_on_login_button() throws Exception {

		loginPage2.clickLoginBtn();
		Thread.sleep(2000);
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}

	
}
