package com.qa.orbit.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.orbit.pages.BasePage;
import com.qa.orbit.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	public String strAbsolutepath = new File("").getAbsolutePath();
	Properties prop;

	WebDriver driver;
	
	Page page; 
	
	WebDriverWait wait;

	public BaseTest() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(strAbsolutepath + "\\src\\main\\java\\com\\qa\\orbit\\config\\config.properties");

			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void setupTest() {

		if (prop.getProperty("browsername").equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().version("2.40").setup();
			driver = new ChromeDriver();
		} else if (prop.getProperty("browsername").equalsIgnoreCase("ff")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Invalid Browser !! Kindly provid browser name in Congif");
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		page = new BasePage(driver, wait);
	
	}

	
	
	//@AfterMethod
	public void teardownTest()
	{
		driver.quit();
	}
	
	
	
}
