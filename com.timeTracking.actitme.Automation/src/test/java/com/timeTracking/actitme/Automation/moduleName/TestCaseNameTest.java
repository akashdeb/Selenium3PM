package com.timeTracking.actitme.Automation.moduleName;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseNameTest {
	
	@Test
	public void testCaseName() {
		
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
	}

}
