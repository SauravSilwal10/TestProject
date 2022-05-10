package day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass extends driver {
	public void openBrowser() throws InterruptedException, AWTException {
		 String url ="https://www.edureka.co/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.findElement(By.linkText("Courses")).click();
		 Robot robot = new Robot();
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 System.out.println("a");
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 System.out.println("b");
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 System.out.println("c");
		 robot.mouseMove(30,100);
		 Thread.sleep(4000);																																																																																																																																																							
		 System.out.println("d");
		 driver.quit();																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
		 
}
	public static void main(String[] args) throws InterruptedException, AWTException {
		Robotclass  r = new Robotclass();
		r.openBrowser();
	}

	}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				