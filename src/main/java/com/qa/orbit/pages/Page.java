package com.qa.orbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	

	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 30);
	}
	
	public abstract WebElement getElement(By locator);
	
	public abstract String getPageTitle();

	
	public abstract void waitForElement(By locator);
	public abstract void waitForTitle(String title);

	public abstract String getElementAttribute(By locator);
}
