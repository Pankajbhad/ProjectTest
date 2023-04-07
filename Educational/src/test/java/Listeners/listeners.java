package Listeners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class listeners implements ITestListener {

	@Test
	void loginbyEmail() {
		System.out.println("Login by Email");
		Assert.assertEquals("Pankaj", "Pankaj");// True
	}

	@Test
	void loginbyFB() {
		System.out.println("Login by FB");
		Assert.assertEquals("Pankaj", "rahul");// false
	}
}
