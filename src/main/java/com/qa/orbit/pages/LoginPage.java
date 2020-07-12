package com.qa.orbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	private By username = By.id("usrname");
	
	private By password = By.id("pwd");

	private By loginbtn = By.id("token-login");

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return getElement(username);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return getElement(loginbtn);
	}

	
	public HomePage doLogin(String uid, String pwdd)
	{
		getUsername().sendKeys(uid);
		getPassword().sendKeys(pwdd);
		getLoginbtn().click();
		
		return new HomePage(driver, wait);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
