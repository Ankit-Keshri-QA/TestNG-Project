package com.utilities;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Hooks {

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Class --> " + this.getClass().getSimpleName());
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Finishing Class: " + this.getClass().getSimpleName());
	}

	@BeforeMethod
	public void beforeTest(Method method) {
		System.out.println("Method --> " + method.getName());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println();
	}

	

}
