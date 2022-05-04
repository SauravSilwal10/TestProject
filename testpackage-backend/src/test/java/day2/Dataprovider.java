package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider  extends driver{
	@Test
	public void open() {
		 String url ="https://opensource-demo.orangehrmlive.com/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 }
	@Test(dataProvider= "testdata")
	public void login(String userName , String password) {
		 driver.findElement(By.id("txtUsername")).sendKeys("userName");
		 driver.findElement(By.id("txtPassword")).sendKeys("password");	 
		 driver.findElement(By.id("btnLogin")).click();
		 driver.quit();
	}
	
	@DataProvider(name= "testdata")
	public Object [][] logindata() {
		Object[][] data  = new Object[2][2];
		data [0][0] = "Admin";
		data [0][1] ="admin123";
		
		data [1][0] = "Admin";
		data [1][1] ="Test123";
		return data;
		
	}
}
