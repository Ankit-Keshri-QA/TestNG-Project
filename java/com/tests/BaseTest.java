package com.tests;

import com.epam.tat.module4.Calculator;

public class BaseTest {
	private static Calculator instance;

	public static Calculator getInstance() {
		if (instance == null) {
			instance = new Calculator();
//                }
//            }
		}
		return instance;
	}
}
