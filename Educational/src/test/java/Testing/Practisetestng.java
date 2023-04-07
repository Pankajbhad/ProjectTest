package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practisetestng {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass is running");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Beforemethod is running");
	}

	@Test(priority = 2)
	public void TestA() {
		System.out.println("TestA running");
	}

	@Test(priority = 0)
	public void TestB() {
		System.out.println("TestB running");
	}

	@Test(priority = 1)
	public void TestC() {
		System.out.println("TestC running");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod is running");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass is running");
	}

}
