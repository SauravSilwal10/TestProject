package day2;

import org.testng.annotations.Test;

public class Dependency {
 static String CategoryId= "null";
 @Test(priority = 1)
 public void createorder() {
	 System.out.println("Order is sucessfully created");
	 CategoryId = "A123";
 }
 @Test(priority = 2)
 public void trackorder() {
	 if (CategoryId != null ) {
	 System.out.println("Order has been tracked");
	 }
	 else {
		 System.out.println("Invalid CategoryId"); 
	 }
 }
 @Test(priority = 3)
 public void delteorder() {
	  if (CategoryId != null) {
	 System.out.println("Order is succesfully deleted");
	 }
	  else {
		  System.out.println("Invalid CategoryId"); 
	  }
 }
 
}
