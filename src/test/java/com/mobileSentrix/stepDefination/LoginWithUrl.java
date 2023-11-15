package com.mobileSentrix.stepDefination;

import com.mobileSentrix.baseStep.BaseStep;
import com.mobileSentrix.login.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrl extends BaseStep{
	LoginPage lp;
	@Given("user open {string} and {string}")
	public void userOpenAnd(String browser, String url) {
		openApp(browser,url);
	}
	@When("user enter username {string}")
	public void userEnterUsername(String username) {
		lp=new LoginPage(driver);
		lp.userNameMethod(username);
	   }
	@When("user enter password {string}")
	public void userEnterPassword(String password) {
		lp.passwordMethod(password);
	  }
	@Then("logged into MS app")
	public void loggedIntoMSApp() {
		lp.loginButton();
	   }



}
