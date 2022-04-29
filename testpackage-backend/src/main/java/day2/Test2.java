package day2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test2 {
	ChromeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	@Test
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
	 }
	 @AfterTest
	 public void Login() {
		 driver.findElement(By.name("uid")).sendKeys("mngr398426");
		 driver.findElement(By.name("password")).sendKeys("tymyqUs");
		driver.findElement(By.name("btnLogin")).click();
	 }
	@AfterTest
	 public void test() {
			driver. close();
			System.out.println("Test completed Succesfully");
			
			

}
}