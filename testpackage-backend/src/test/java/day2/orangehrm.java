package day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm extends driver{
	@Parameters("url")
	@Test
	 public void callBrowser(String url) {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	@Parameters({"userName", "password"})
	@Test
	public void login( String userName ,String password ) {
		 driver.findElement(By.id("txtUsername")).sendKeys(userName);
		 driver.findElement(By.id("txtPassword")).sendKeys(password); 	 
		 driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	 public void info() {
		 driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	 public void test() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		}
	@Test
	public void verify() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
	
}