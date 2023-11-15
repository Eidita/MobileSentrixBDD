package com.mobileSentrix.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep{
	WebDriver driver;
	@Given("I want to open MS app")
	public void iWantToOpenMSApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.mobilesentrix.com/customer/account/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	@When("enter valid user name")
	public void enterValidUserName() {
		driver.findElement(By.xpath("//input[@name='useremail']")).sendKeys("hghv");
	   }
	@When("enter valid password")
	public void enterValidPassword() {
		driver.findElement(By.xpath("//input[@name='userpassword']")).sendKeys("vvfxv");
	   }
	@Then("click login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//*[@id='send2']/span/span")).click();
	  }




}
