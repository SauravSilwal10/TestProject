package day2;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertion extends driver {
	 @Test 
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
}
	 @Test 
	public void gettitle() {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Young Innovation");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
		String expectedTitle = "Young Innovation - Google खोजी";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle,expectedTitle,"Title is matched");
        driver.quit();
	}
	 @Test
	 public void facebook() {
		 String url ="https://www.facebook.com/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	
	 @Test
	 public void title() {
		 	String expectedTitle = "Facebook - log in or sign up";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle,expectedTitle,"Title is matched");
	 }
	 @Test
	 public void url() {
		 	
		 	String expectedUrl= "https://www.facebook.com/";
	        String originalUrl = driver.getCurrentUrl();
	        Assert.assertEquals(originalUrl,expectedUrl,"Url  is matched");
	 }
	 @Test
	 public void text() {
		 	String expectedText= "";
	        String originalText = driver.findElement(By.id("email")).getAttribute("value");
	        Assert.assertEquals(originalText,expectedText,"Text is matched");
//	        driver.quit();
	 }
}
