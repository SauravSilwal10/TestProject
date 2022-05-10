package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action2 extends driver {

	 public void openBrowser() {
		 String url ="https://opensource-demo.orangehrmlive.com/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	 public void Login() {
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 	 
		 driver.findElement(By.id("btnLogin")).click();
		 Actions ac = new Actions(driver);
		WebElement admin =  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement usermgmt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement user = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		 ac.moveToElement(admin).build().perform();
		 ac.moveToElement(usermgmt).build().perform();
		 ac.moveToElement(user).click().build().perform();
	} 
	 public void rightclick() {
		 Actions ac = new Actions(driver);
		 WebElement mouse =  driver.findElement(By.xpath("//td[contains(text(),'Right Click')]']"));
		 ac.contextClick(mouse).build().perform();
		 
	 }
	 
	 public static void main(String[] args) {
		action2 a = new action2();
		a.openBrowser();
		a.Login();
	}
	 
	 
}