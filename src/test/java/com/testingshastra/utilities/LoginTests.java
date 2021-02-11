package com.testingshastra.utilities;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("I am Login Test-01");
	}
	@Test(groups = "Regression")
	public void m2() {
		System.out.println("I am Login Test-02");
	}
	@Test(groups = "Smoke")
	public void m3() {
		System.out.println("I am Login Test-03");
	}
	@Test(groups = "Regression")
	public void m4() {
		System.out.println("I am Login Test-04");
	}
	@Test(groups = "Smoke")
	public void m5() {
		System.out.println("I am Login Test-05");
	}


}
