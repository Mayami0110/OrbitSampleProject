package com.qa.orbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	@Override
	public WebElement getElement(By locator) {
		
		WebElement element = null;
		try {
			waitForElement(locator);
		element = driver.findElement(locator);
		}
		catch(Exception ex)
		{
			System.out.println("Exception occours at Finding Element" + ex.toString()) ;
		}
		
		return element;
	}

	@Override
	public void waitForElement(By locator) {
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public String getElementAttribute(By locator) {
		
		return driver.findElement(locator).getAttribute("data-componentid");
		
	}

	@Override
	public String getPageTitle() {

		waitForTitle(driver.getTitle());
		
		return driver.getTitle();
		
	}

	@Override
	public void waitForTitle(String title) {
		
		wait.until(ExpectedConditions.titleContains(title));
		
	}

}
