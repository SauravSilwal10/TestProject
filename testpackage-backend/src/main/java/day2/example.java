package day2;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
public class example {
	ChromeDriver driver;
	String url ="http://demo.guru99.com/test/newtours/";
	
	@Test
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
	 }
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
