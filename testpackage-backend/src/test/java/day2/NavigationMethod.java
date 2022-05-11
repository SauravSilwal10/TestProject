package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod  extends driver{
	 public void openBrowser() throws InterruptedException {
		 String url ="https://www.google.com/";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.findElementByXPath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]").sendKeys("cricbuzz");
		 driver.findElementByName("btnK").submit();
		 driver.navigate().to("https://www.facebook.com/");
		 
}		public static void main(String[] args) throws InterruptedException {
	 NavigationMethod nm = new NavigationMethod();
	 nm.openBrowser();
}
}
