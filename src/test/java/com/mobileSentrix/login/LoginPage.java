package com.mobileSentrix.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;//instance variable
	
	public LoginPage(WebDriver driver) {//default constructor
		super();//parent class
		this.driver = driver;//Instantiate value
		PageFactory.initElements(driver, this);//this handle all locator
	}
	@FindBy(how=How.XPATH,using="//input[@name='useremail']") WebElement userNameId;
	/*
	 * FindBy(how=How.XPATH,using="//input[@name=\"useremail\"]") WebElement userNameId;===formula
	 * Find by===annotation
	 * XPATH===attributes/locator
	 * using===value
	 * WebElement==data Type
	 * userNameId=variable name
	 */
public WebElement userNameMethod(String enterUserName) {//WebElement meant always it has return value
	userNameId.sendKeys(enterUserName);
	return userNameId;
	
}
@FindBy(how=How.XPATH,using="//input[@name='userpassword']") WebElement passwordId;
public WebElement passwordMethod(String enterPass) {
	passwordId.sendKeys(enterPass);
	return passwordId;
	
}
@FindBy(how=How.XPATH,using="//*[@id='send2']/span/span") WebElement loginButtonLocator;
	public void loginButton() {//void means no return type
		loginButtonLocator.click();
	}
}
