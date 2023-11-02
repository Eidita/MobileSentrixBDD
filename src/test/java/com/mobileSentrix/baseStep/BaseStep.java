package com.mobileSentrix.baseStep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {
	//create base step for checking cross browser
	
	public WebDriver driver;//WebDriver driver==interface,i make public as i can use from anywhere
	
public WebDriver openApp(String browser,String url) {//local variable //
	if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();//bonegercia
		driver= new ChromeDriver();//invoking chrome driver//driver==instance variable
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();	
	}
	else {//default
		System.out.println("Chrome is default");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	return driver;
	
}//if else a condintion

public void closeApp() {
	if (driver !=null) {
		driver.quit();
	}
}

}
