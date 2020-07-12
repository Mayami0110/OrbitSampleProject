package com.qa.orbit.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orbit.pages.HomePage;
import com.qa.orbit.pages.LoginPage;
import com.qa.orbit.util.ReadDataFile;

public class LoginPageTest extends BaseTest{

	LoginPage loginPage;
	HomePage homePage;
	ReadDataFile readData = new ReadDataFile();
	@Test
	public void doLoginTest()
	{
		
		loginPage = new LoginPage(driver, wait);
		
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String homePageTitle = homePage.getHomePageTitle();
		
		Assert.assertEquals(homePageTitle, prop.getProperty("homepagetitle"));
	
	}
	
	
	
}
