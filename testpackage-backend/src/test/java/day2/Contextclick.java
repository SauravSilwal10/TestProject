package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick extends driver{

	 public void openBrowser() {
		 String url ="https://demo.guru99.com/test/simple_context_menu.html";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	 public void context() throws Exception {
		 Actions action = new Actions(driver);
		 WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 action.doubleClick(link).perform();
		 Alert alert = driver.switchTo().alert();
		 System.out.println("Alert Text\n" +alert.getText());
		 alert.accept();
		 Thread.sleep(1000);
	 }
	 
	public static void main(String[] args) throws Exception {
		Contextclick c = new Contextclick();
		c.openBrowser();
		c.context();
	}
}
