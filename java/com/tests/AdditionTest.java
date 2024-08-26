package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
import com.utilities.Hooks;

public class AdditionTest extends Hooks {

	Calculator calC = BaseTest.getInstance();

	@Test
	public void addition() {
		double result = calC.sum(56.345, 11.181);
		System.out.println("Result : " + result);
		Assert.assertEquals(67.526, result);
	}

	@Test(groups = { "negativeTestCases" })
	public void negativeAddtionTest() {
		long result = calC.sum(115L, 1398L);
		System.out.println("Result : " + result);
		Assert.assertEquals(811L, result);
	}

	@Test(dataProvider = "dp")
	public void dataDrivenAddition(long num1, long num2, long res) {
		long result = calC.sum(num1, num2);
		System.out.println("Result : " + result);
		Assert.assertEquals(res, result);
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {
		Object[][] data = { { 45L, 14L, 59L }, { 87L, 32L, 119L }, { 13L, 36L, 49L } };

		return data;
	}

}
