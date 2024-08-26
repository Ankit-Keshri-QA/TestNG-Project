package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
import com.utilities.Hooks;

public class SubstractionTest extends Hooks {

	Calculator calC = BaseTest.getInstance();

	@Test(priority = 1)
	public void substraction() {
		double result = calC.sub(25, 13.0);
		System.out.println("Result : " + result);
		Assert.assertEquals(12.0, result);
	}

	@Test(priority = 2, groups = { "negativeTestCases" })
	public void negativeSubstractionTest() {
		long result = calC.sub(115L, 1398L);
		System.out.println("Result : " + result);
		Assert.assertEquals(8977L, result);
	}

	@Test(dataProvider = "dp", dependsOnMethods = { "substraction" })
	public void dataDrivenSubstraction(long num1, long num2, long res) {
		long result = calC.sub(num1, num2);
		System.out.println("Result : " + result);
		Assert.assertEquals(res, result);
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {
		Object[][] data = { { 45L, 14L, 31L }, { 87L, 32L, 55L }, { 13L, 36L, -23L } };

		return data;
	}

}
