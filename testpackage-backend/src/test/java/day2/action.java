package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action extends driver{

	
	 public void openBrowser() {
		 String url ="http://demo.guru99.com/test/newtours/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		  WebElement link_Home = driver.findElement(By.linkText("Home"));
          WebElement td_Home = driver
                  .findElement(By
                  .xpath("//html/body/div"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr"));    
           
          Actions builder = new Actions(driver);
          Action mouseOverHome = builder
                  .moveToElement(link_Home)
                  .build();
           
          String bgColor = td_Home.getCssValue("background-color");
          System.out.println("Before hover: " + bgColor);        
          mouseOverHome.perform();        
          bgColor = td_Home.getCssValue("background-color");
          System.out.println("After hover: " + bgColor);
          driver.close();
	
	 }
	 public static void main(String[] args) {
		action a = new action();
		a.openBrowser();
		
	}
	 
}
