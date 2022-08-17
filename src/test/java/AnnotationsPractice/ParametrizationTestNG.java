package AnnotationsPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametrizationTestNG {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This runs before each Test Case");
	}
	
	@Test
	public void test() {
		System.out.println("This is just for the test"); 
	}
	@Test
	public void testTwo() {
		System.out.println("This is test 2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This block of code runs after each Test Case");
	}
	

}
