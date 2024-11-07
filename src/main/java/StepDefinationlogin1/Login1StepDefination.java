package StepDefinationlogin1;

import java.io.IOException;


import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPages.LoginPage;
import BaseP.BaseC;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Genericmethod.*;

public class Login1StepDefination 
{

@Given("User should be on  login page")
public void user_should_be_on_login_page() throws IOException 
{
	BaseC.Browser_launch();
	ExtentCucumberAdapter.addTestStepLog("Browserlaunched successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.Takescreenshot());
}
@When("user enters Valid email ID {string}")
public void user_enters_valid_email_id(String username) throws IOException
{
	LoginPage lp=new LoginPage();	
	lp.EnterEmailid(username);
	ExtentCucumberAdapter.addTestStepLog("user entered username"+username);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.Takescreenshot());
}
@When("user enters Valid password {string}")
public void user_enters_valid_password(String password) throws IOException {
	LoginPage lp=new LoginPage();
	lp.EnterPasswordID(password);
	ExtentCucumberAdapter.addTestStepLog("user entered password"+password);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.Takescreenshot());
}

@When("clicks submit")
public void clicks_submit() throws IOException 
{
	LoginPage lp=new LoginPage();
	lp.Submit_login();	
	ExtentCucumberAdapter.addTestStepLog("submit is done successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.Takescreenshot());
	
}
	
}
