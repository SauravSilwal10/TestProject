package day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable extends driver {
	public void openBrowser() throws InterruptedException {
		 String url ="https://jqueryui.com/resizable/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.switchTo().frame(0);
		WebElement resize  =  driver.findElementByXPath(" //div[@id='resizable']");
		Actions act = new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize,179,319).build().perform();
		Thread.sleep(3000);
}
	public static void main(String[] args) throws InterruptedException {
		Resizeable r   = new Resizeable();
		r.openBrowser();
	}
}
