package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {
public static void main(String[] args) throws FindFailed {
	
	
	Pattern email=new Pattern("F:\\Selenium\\Sikuli tool\\Facebookimg\\email.PNG");
	Pattern password=new Pattern("F:\\Selenium\\Sikuli tool\\Facebookimg\\password.PNG");
	Pattern login=new Pattern("F:\\Selenium\\Sikuli tool\\Facebookimg\\login.PNG");
	Pattern forgotpass=new Pattern("F:\\Selenium\\Sikuli tool\\Facebookimg\\forgot.PNG");
	Pattern back=new Pattern("F:\\Selenium\\Sikuli tool\\Facebookimg\\back.PNG");
	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium and crome setup\\chromedriver74v.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
	
	Screen screen=new Screen();
	screen.click(forgotpass);
	screen.click(back);
	
	screen.type(email, "divyapunjabi123@gmail");
	screen.type(password, "fghfjh");
	screen.click(login);
	
	
}
}
