package org.Reports.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int count=0;
	int retrylimit=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		while(count<retrylimit) {
			count++;
			return true;
		}
		return false;
	}

}
