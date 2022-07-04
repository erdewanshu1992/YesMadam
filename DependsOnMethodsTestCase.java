package softwareTestingMaterial;

import org.testng.annotations.Test;

public class DependsOnMethodsTestCase {
	/*
	@Test
	public void testCase1(){
	System.out.println("Test Case 1");
	}
	@Test
	public void testCase2(){
	System.out.println("Test Case 2");
	}
	*/
	//Now we add the dependsOnMethods attribute to the @Test Annotations and execute the same program.
	/*@Test(dependsOnMethods = {"testCase2"})
	public void testCase1(){
	System.out.println("Test Case 1");
	}
	@Test
	public void testCase2(){
	System.out.println("Test Case 2");
	}*/
	@Test(groups = {"FirstGroup"})
	public void testCase1(){
		System.out.println("Test Case 1");
	}
	@Test(groups = {"SecondGroup"})
	public void testCase2(){
		System.out.println("Test Case 2");
	}


}
