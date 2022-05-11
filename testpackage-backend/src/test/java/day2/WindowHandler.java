package day2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler  extends driver{

	 public void openBrowser() {
		 String url ="https://www.hyrtutorials.com/p/window-handles-practice.html";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		String window = driver.getWindowHandle();
		System.out.println("Parent window "+window);
		
}
	public void handler() {
		driver.findElementById("newWindowBtn").click();
		Set<String> handles =driver.getWindowHandles();
		for( String handle :handles) {
			System.out.println(handle);
		}
}
	public static void main(String[] args) {
		WindowHandler wi =  new WindowHandler();
		wi.openBrowser();
		wi.handler();
	}
}
