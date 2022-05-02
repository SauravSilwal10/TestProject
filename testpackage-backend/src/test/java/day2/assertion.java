package day2;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertion extends driver {
	 @Test 
	 public void callBrowser() {
		 String url ="https://www.google.com/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	 @Test 
	public void gettitle() {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Young Innovation");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
		String expectedTitle = "Young Innovation - Google खोजी";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle,expectedTitle);
        driver.quit();
	}	 
}
