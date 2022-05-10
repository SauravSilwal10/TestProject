package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup extends driver {
	 public void openBrowser() throws Exception {
		 String url ="http://localhost/form.php";
		 System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 driver.get(url);
		 WebElement pdf_field=driver.findElement(By.name("pdf"));
		 pdf_field.sendKeys("/home/ssilwal/Downloads/Complete IELTS Material List.pdf"); 
		 Thread.sleep(3000);
		  WebElement upload_field=driver.findElement(By.name("submit"));
		  upload_field.click();
		  System.out.println("File is Uploaded Successfully");
		  
		 
}
public static void main(String[] args) throws Throwable 
{
	Windowpopup w = new  Windowpopup();
	w.openBrowser();
	
}

}
