package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
import com.utilities.Hooks;

public class MultiplicationTest extends Hooks {

	Calculator calC = BaseTest.getInstance();

	@Test(priority = 1)
	public void multiplication() {
		double result = calC.mult(13, 11);
		System.out.println("Result : " + result);
		Assert.assertEquals(143.0, result);
	}

	@Test( groups = { "negativeTestCases" })
	public void negativeMultiplicationTest() {
		long result = calC.mult(17, 5);
		System.out.println("Result : " + result);
		Assert.assertEquals(105, result);
	}

	@Test(dataProvider = "dp", priority = 2)
	public void dataDrivenMultiplication(long num1, long num2, long res) {
		long result = calC.mult(num1, num2);
		System.out.println("Result : " + result);
		Assert.assertEquals(res, result);
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {
		Object[][] data = { { 15L, 4L, 60L }, { 7L, 3L, 21L } };

		return data;
	}

}
