package day2;

import org.testng.annotations.Test;

public class DependencyGroup {
	@Test(groups ="Smoke")
	public void test1() {
		System.out.println("Test1 is runnning successfully ");
	}
	@Test(groups ="Smoke")
	public void test2() {
		System.out.println("Test2 is runnning successfully ");
	
	}
	@Test(groups ="Smoke")
	public void test3() {
		System.out.println("Test2 is runnning successfully ");
		
}
	@Test(groups ="Sanity")
	public void test4() {
		System.out.println("Test2 is runnning successfully ");
		
}
	@Test(groups ="Regression")
	public void test5() {
		System.out.println("Test2 is runnning successfully ");
		
}
	@Test( dependsOnGroups ={"Smoke", "Sanity","Regression"})
	public void test0() {
		System.out.println("Main test Case ");
		
	}



}
