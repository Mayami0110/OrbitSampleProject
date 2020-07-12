package com.qa.orbit.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orbit.pages.HomePage;
import com.qa.orbit.pages.LoginPage;
import com.qa.orbit.util.ReadDataFile;

public class HomePageTest extends BaseTest{

	
	LoginPage loginPage;
	HomePage homePage;
	
	ReadDataFile readData = new ReadDataFile();
	
	@Test
	public void donavigateToDataReport()
	{
		loginPage = new LoginPage(driver, wait);
		
		String username = readData.readDataFile("LoginPage", 1, "username", "LoginPage");
		String password = readData.readDataFile("LoginPage", 1, "password", "LoginPage");
		
		homePage = loginPage.doLogin(username, password);
		
		String homePageTitle = homePage.getHomePageTitle();
		
		Assert.assertEquals(homePageTitle, prop.getProperty("homepagetitle"));
		
		homePage.navigateToDataReport();
		
		
		
	
	}
	
	
	
}
