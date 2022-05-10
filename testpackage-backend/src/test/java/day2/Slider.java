package day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider  extends driver {
	 
	public void openBrowser() {
		 String url ="https://jqueryui.com/slider/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.switchTo().frame(0);
		WebElement slider  =  driver.findElementByXPath("//body/div[@id='slider']/span[1]");
		Actions act = new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider,300,0).build().perform();
}
	
	public static void main(String[] args) {
		Slider s = new Slider();
		s.openBrowser();
	}
}
