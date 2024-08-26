package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
import com.utilities.Hooks;

public class DivisionTest extends Hooks {

	Calculator calC = BaseTest.getInstance();

	@Test
	public void division() {
		double result = calC.div(99, 11.0);
		System.out.println("Result : " + result);
		Assert.assertEquals(9.0, result);
	}

	@Test(groups = { "negativeTestCases" })
	public void negativedivisionTest() {
		long result = calC.div(115L, 1398L);
		System.out.println("Result : " + result);
		Assert.assertEquals(8977L, result);
	}

	

}
