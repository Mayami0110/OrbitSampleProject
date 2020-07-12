package com.qa.orbit.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestUtil {

	public void mouseoverElement(WebDriver driver, WebElement element) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions act = new Actions(driver);
		act.moveToElement(element).doubleClick(element).build().perform();

	}

	public void rightClick(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();

	}
	
	public void JSClick(WebDriver driver, WebElement element) {

		
		try {
			Thread.sleep(3000);
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	public void Click(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();

	}
	
	public void switchToFrame(WebDriver driver, String frame) {
		
		driver.switchTo().frame(frame);
		
	}
	
		

}
