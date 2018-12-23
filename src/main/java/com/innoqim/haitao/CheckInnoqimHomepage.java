/**
 *  test chrome & gecko driver
 */
package com.innoqim.haitao;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

/**
 * @author haitao
 *
 */
public class CheckInnoqimHomepage {
	
	//Declare a Webdriver variable
    public WebDriver driver;
	
	@Test
	public void testHomepageByChrome() {   

		//specify chromedriver location.   
		System.setProperty("webdriver.chrome.driver","/Users/peter/util/chromedriver");

		driver = new ChromeDriver();    
		
		driver.get("http://www.innoqim.com");   

		//check title
		String title = driver.getTitle();
		
		assertTrue(Objects.equals(title, "InnoQIM Home"));
		
		//check id = top-1  existing
		WebElement section = driver.findElement(By.id("top-1")); 
		
		assertFalse((section == null));   

		}
	
	@Test
	public void testHomepageByFirefox() {   

		//specify geckodriver location.   
		System.setProperty("webdriver.gecko.driver","/Users/peter/util/geckodriver");

		driver = new FirefoxDriver();    
		
		driver.get("http://www.innoqim.com");   

		//check title
		String title = driver.getTitle();
		
		assertTrue(Objects.equals(title, "InnoQIM Home"));
		
		//check id = top-1  existing
		WebElement section = driver.findElement(By.id("top-1")); 
		
		assertFalse((section == null));    

		}
	
	@AfterMethod
	public void teardownTest (){
        //Close driver and end the session
        driver.close();
    }
	
	
}
