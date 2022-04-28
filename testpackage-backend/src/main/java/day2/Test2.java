package day2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
@Test
public class Test2 {
	ChromeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
	 }
	 @Test
	 public void Login() {
		 driver.findElement(By.name("uid")).sendKeys("mngr398426");
		 driver.findElement(By.name("password")).sendKeys("tymyqUs");
		driver.findElement(By.name("btnLogin")).click();
	 }
	 @Test
	 public void addCustomer() {
		 driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		 driver.findElement(By.name("name")).sendKeys("Ram");
		 driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		 driver.findElement(By.name("dob")).sendKeys("03/24/2000");
		 driver.findElement(By.name("addr")).sendKeys("Kathmandu");
		 driver.findElement(By.name("city")).sendKeys("Samakhushi");
		 driver.findElement(By.name("state")).sendKeys("Bagamti");
		 driver.findElement(By.name("pinno")).sendKeys("1234678");
		 driver.findElement(By.name("telephoneno")).sendKeys("9841383990");
		 driver.findElement(By.name("emailid")).sendKeys("hari123@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("123jgdckjdsxj4");
		 driver.findElement(By.name("submit")).click();		
	}
	@AfterTest
	 public void test() {
			driver. close();
			System.out.println("Test completed Succesfully");
			
			
		}
		public static void main(String[] args) {
			Test2 d = new Test2();
			 d.callBrowser();
			 d.Login();
			 d.addCustomer();
			 d.test();
			 
		}
		 
}
