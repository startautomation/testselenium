package utils;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements IInvokedMethodListener, ITestListener, ISuiteListener {

	@Override
	public void onFinish(ISuite suite) {
	}

	@Override
	public void onStart(ISuite suite) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	}

}
