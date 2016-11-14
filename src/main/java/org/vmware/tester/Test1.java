package org.vmware.tester;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeMethod
	public void b1(){
		System.out.println("b1");
		
		  int i= 0;
		  int TRACE= i++;
		  int DEBUG= i++;
		  int INFO= i++;
		  int WARN= i++;
		  int ERROR= i++;
		  int FATAL= i++;
		  int LEVEL_COUNT= i;
		  System.out.println(i+":"+TRACE+":"+DEBUG+":"+INFO+":"+TRACE+":");
	}
	@Test
	public void myTest1(){
		System.out.println("Test");
	}
	@BeforeMethod
	public void b2(){
		System.out.println("B2");
	}
}
