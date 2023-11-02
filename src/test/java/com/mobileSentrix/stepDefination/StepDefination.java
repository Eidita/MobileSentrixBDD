package com.mobileSentrix.stepDefination;

import com.mobileSentrix.baseStep.BaseStep;
import com.mobileSentrix.login.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseStep {//BaseStep is a relationship
	LoginPage lp;//LoginPage lp has a relationship
	@Given("user enter valid {string} and {string} to enter login page")
	public void userEnterValidAndToEnterLoginPage(String browser, String url) {
		openApp(browser,url);
	   }
	
	@When("enter {string} and {string} in step")
	public void enterAndInStep(String userName, String password) {
		lp=new LoginPage(driver);
		lp.userNameMethod(userName);
		lp.passwordMethod(password);
		
	  }
	
	@When("click <login> button")
	public void clickLoginButton() {
		lp.loginButton();
	   }
	
	@Then("close in step")
	public void closeInStep() {
		closeApp();
	 }
}







