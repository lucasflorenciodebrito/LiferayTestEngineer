package challenge.Liferay;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

//Run the two Test Cases
	
	public static void main(String[] args) {
		
		 Result result = JUnitCore.runClasses(TC1FillForm.class, TC2FillFormWithoutDate.class);
		 //Here it is getting the run count from the result object
		 System.out.println("Total number of tests " + result.getRunCount());
		 //This is to get the failure count from the result object
		 System.out.println("Total number of tests failed " + result.getFailureCount());
		 
		 System.out.println("Total number of tests passed " + (result.getRunCount() - result.getFailureCount()));
		 
		 for(Failure failure : result.getFailures())
		 { 
		 //This will print message only in case of failure
		 System.out.println(failure.getMessage());
		 }
		 
		
		

	}

}
