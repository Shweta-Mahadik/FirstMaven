package com.testingshastra.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void tc_01() {
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.manage().window().maximize();
	}

}
