package com.innoqim.haitao;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogin {

	//Declare a Webdriver variable
    public WebDriver driver;
	
	@Test
	public void testLoginByChrome() {   
		System.setProperty("webdriver.chrome.driver","/Users/haitao/util/chromedriver");   

		driver = new ChromeDriver();    
		
		driver.get("http://www.innoqim.com/login.html");
 
		//click login
		driver.findElement(By.xpath("//html/body/section[3]/div/div[1]/div[1]/a")).click(); 

		}
}
