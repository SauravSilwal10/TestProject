package First;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	ChromeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		
	}
	 public void Login() {
		 driver.findElement(By.name("uid")).sendKeys("gdchdcbj");
		 driver.findElement(By.name("password")).sendKeys("12345568");
		driver.findElement(By.name("btnLogin")).click();
		 
	}
	public static void main(String[] args) {
		Day1 d = new Day1();
		 d.callBrowser();
		 d.Login();
	}
	 
}

