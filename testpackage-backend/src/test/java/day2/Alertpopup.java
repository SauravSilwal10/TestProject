package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup  extends driver{
	 public void openBrowser() {
		 String url ="https://mail.rediff.com/cgi-bin/login.cgi";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.findElementByName("proceed").click();
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
}
public static void main(String[] args) {
	Alertpopup a = new  Alertpopup();
	a.openBrowser();
	}
}
	

	 