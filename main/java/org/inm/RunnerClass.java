package org.inm;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void tc() {
		Result RC = JUnitCore.runClasses(B.class,WebLink.class, A.class);
		System.out.println("Total Test case:" + RC.getRunCount());
		System.out.println("Total test case run time" + RC.getRunTime());
		System.out.println("Total test case fail count" + RC.getIgnoreCount());
		System.out.println("Total test case Ignored" + RC.getIgnoreCount());
		
		
		List<Failure> f = RC.getFailures();
		for (Failure fails : f) {
		System.out.println(fails);
			
		}
	

	}
	

}
