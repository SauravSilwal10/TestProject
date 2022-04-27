package First;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	ChromeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	 public void callBrowser() {
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		
	}
	 public void Login() {
		 driver.findElement(By.name("uid")).sendKeys("mngr398426");
		 driver.findElement(By.name("password")).sendKeys("tymyqUs");
		driver.findElement(By.name("btnLogin")).click();
		 
	}
	 public void addCustomer() {
		 driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		 driver.findElement(By.name("name")).sendKeys("Ram");
		 driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		 driver.findElement(By.name("dob")).sendKeys("03/24/2000");
		 driver.findElement(By.name("addr")).sendKeys("Kathmandu");
		 driver.findElement(By.name("city")).sendKeys("");
		 driver.findElement(By.name("state")).sendKeys("Bagamti");
		 driver.findElement(By.name("pinno")).sendKeys("1234");
		 driver.findElement(By.name("telephoneno")).sendKeys("9841383990");
		 driver.findElement(By.name("emailid")).sendKeys("hari123@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("123jgdckjdsxj4");
		 driver.findElement(By.name("submit")).click();		
	}
	public static void main(String[] args) {
		Day1 d = new Day1();
		 d.callBrowser();
		 d.Login();
		 d.addCustomer();
	}
	 
}

