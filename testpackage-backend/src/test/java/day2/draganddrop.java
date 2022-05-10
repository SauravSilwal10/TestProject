package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop extends driver {
	 public void openBrowser() {
		 String url ="https://logicbomb.github.io/ng-directives/drag-drop.html";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
}
	 public void drag()	 {
		Actions ac = new Actions(driver);
		WebElement source =  driver.findElement(By.xpath("//div[@id='2dfd45d0-f84b-108f-ec07-7e73baeff95d']"));
		WebElement target =  driver.findElement(By.xpath("//span[@id='58ab14d7-31da-a2ed-a546-db985da34592']"));
		ac.clickAndHold(source).moveToElement(target).release().build().perform();
		
	 }
	 public static void main(String[] args) {
		 draganddrop d = new draganddrop();
		 d.openBrowser();
		 d.drag();
	}
	
}
