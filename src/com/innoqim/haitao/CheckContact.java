package com.innoqim.haitao;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckContact {
	
	//Declare a Webdriver variable
    public WebDriver driver;
	
	@Test
	public void testContactByChrome() {   
		System.setProperty("webdriver.chrome.driver","/Users/haitao/util/chromedriver");   

		driver = new ChromeDriver();    
		
		driver.get("http://www.innoqim.com/contact.html");
		
		//fill 
		driver.findElement(By.name("name")).sendKeys("username");
		driver.findElement(By.name("email")).sendKeys("address@email.com");
		driver.findElement(By.name("tel")).sendKeys("5191111111");
		driver.findElement(By.name("message")).sendKeys("hello,inno");
		
		//submit
		driver.findElement(By.xpath("//*[contains(text(),'SEND FORM')]")).click();
 
		String returnString = driver.findElement(By.xpath("//html/body/section[3]/div/div[1]")).getText();
		 
		assertTrue(Objects.equals(returnString, "Thanks for filling out the form!"));

		}

}
