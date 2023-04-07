package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners2 extends TestListenerAdapter {

	public void onTestStart(ITestResult tr) {
		System.out.println("Test started");

	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Success");

	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Fails");

	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");

	}

}

