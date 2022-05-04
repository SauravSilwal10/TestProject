package day2;

import org.testng.annotations.Test;

public class Dependency {
 static String CategoryId= "null";
 @Test
 public void createorder() {
	 System.out.println(5/0);
	 System.out.println("Order is sucessfully created");
	 CategoryId = "A123";
 }
 @Test(dependsOnMethods = {"createorder"})
 public void trackorder() {
	 if (CategoryId != null ) {
	 System.out.println("Order has been tracked");
	 }
	 else {
		 System.out.println("Invalid CategoryId"); 
	 }
 }
 @Test(dependsOnMethods = {"createorder", "trackorder"} ,alwaysRun = true)
 public void delteorder() {
	  if (CategoryId != null) {
	 System.out.println("Order is succesfully deleted");
	 }
	  else {
		  System.out.println("Invalid CategoryId"); 
	  }
 }
 
}
