package day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler  extends driver{

	 public void openBrowser() throws Exception {
		 String url ="https://www.hyrtutorials.com/p/window-handles-practice.html";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println("Parent window "+parent);
		driver.findElementById("newWindowBtn").click();
		Set<String> handles =driver.getWindowHandles();
		for( String handle :handles) {
			System.out.println(handle);
		if(!handle.equals(parent)) {
			driver.switchTo().window(handle);
			driver.findElementById("firstName").sendKeys("Ram");
			Thread.sleep(2000);
			driver.close();
		}
		
		
		
}
		driver.switchTo().window(parent);
		driver.findElementByXPath(" //input[@id='name']").sendKeys("Shyam");
		Thread.sleep(5000);
		driver.quit();
		
			
}
	public static void main(String[] args) throws Throwable {
		WindowHandler wi =  new WindowHandler();
		wi.openBrowser();
	}
}
