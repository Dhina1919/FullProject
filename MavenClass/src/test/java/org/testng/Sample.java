package org.testng;


import org.junit.BeforeClass;
import org.mavenclasses.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample  {

	@BeforeSuite
	
	private void test1() {
		System.out.println("sample test1 @BeforeSuite");

	}
	
@AfterSuite
	
	private void test2() {
		System.out.println("sample test1 @BeforeSuite");

	}
	
@AfterMethod
private void test3() {
	System.out.println("sample test1 @BeforeSuite");

}
	
@BeforeMethod

private void test4() {
	System.out.println("sample test1 @BeforeSuite");

}	
@BeforeTest

private void test5() {
	System.out.println("sample test1 @BeforeSuite");

}	
@AfterTest
private void test6() {
	System.out.println("sample test1 @BeforeSuite");

}	
	
@BeforeClass
private void test7() {
System.out.println("sample test test7");
}

   @AfterClass
   
   private void test8() {
    System.out.println("sample test @afterclass");
}
    @Test
    
    private void test9() {
  System.out.println("sample test test9");
	}

















	
}
