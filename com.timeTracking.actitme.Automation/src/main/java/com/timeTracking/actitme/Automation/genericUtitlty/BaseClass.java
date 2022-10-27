package com.timeTracking.actitme.Automation.genericUtitlty;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database Connection has been established");
	}
	
	@BeforeClass
	public void bcConfig() {
		System.out.println("The Browser has been Launched");
		System.out.println("Navighated to the ulr");

	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("Logged in to the application");

	}
	
	@AfterMethod
	public void amConfig() {
		
		System.out.println("Logged out from the application");
		
	}
	
	@AfterClass
	public void acConfig() {
		
		System.out.println("Browser has been closed");
		
	}
	
	@AfterSuite
	public void asConfig() {
		
		System.out.println("Database connection has been closed  ");
		
	}
	
	

	
}
