package com.qa.orbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.orbit.util.TestUtil;



public class HomePage extends BasePage{
	
	TestUtil util = new TestUtil();

	private By Rsymbol = By.id("ext-element-43");
	
	private By reportbtn = By.xpath("//*[@id='loadmask-1098']");
	
	private By dataReport = By.xpath("//div[@class='x-grid-cell-inner ']//i[@class='ORBIT-Icons orb-icon-grid oper-icon-style ']");
	
	private By editOpt = By.xpath("//div[@class='x-menu-item x-menu-item-default x-box-item']/a/span[contains(text(),'Edit')]");
	
	private By Optionsopt = By.xpath("//*[@class='x-btn report-btn-act-cls x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small' ][@data-qtip='Options']");
	
	//private By GenerateLink = By.xpath("//*[@data-ref='textEl'][contains(text(),'Generate Link')]");

	private By GenerateLink = By.xpath("//span[@id='menuitem-1409-textEl']");
	
	private By discriptions = By.xpath("//*[@name='description']");
	
	private By publicRadiobtn = By.xpath("//*[contains(text(),'Public')]");
	
	private By GenerateBtn = By.xpath("//*[(@class='x-btn-inner x-btn-inner-default-small')][contains(text(),'Generate')]");
	
	private By linktextBox = By.xpath("//*[(@class='x-form-field x-form-text x-form-text-default x-form-textarea ')][contains(@name,'link')]");
	
	
			
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
		
	public String getHomePageTitle()
	{
		return getPageTitle();
	}


	/**
	 * @return the rsymbol
	 */
	public WebElement getRsymbol() {
		return getElement(Rsymbol);
	}


	/**
	 * @return the reportbtn
	 */
	public WebElement getReportbtn() {
		return getElement(reportbtn); 
	}


	/**
	 * @return the dataReport
	 */
	public WebElement getDataReport() {
		return getElement(dataReport); 
		
	}


	/**
	 * @return the editOpt
	 */
	public WebElement getEditOpt() {
		return getElement(editOpt);
	}

	/**
	 * @return the optionsopt
	 */
	public WebElement getOptionsopt() {
		return getElement(Optionsopt); 
	}
	
	
	/**
	 * @return the gEnerateLink
	 */
	public WebElement getGenerateLink() {
		return getElement(GenerateLink); 
	}

	/**
	 * @return the discriptions
	 */
	public WebElement getDiscriptions() {
		return getElement(discriptions);  
	}

	/**
	 * @return the publicRadiobtn
	 */
	public WebElement getPublicRadiobtn() {
		return getElement(publicRadiobtn);   
	}
	
	
		/**
	 * @return the generateBtn
	 */
	public WebElement getGenerateBtn() {
		return getElement(GenerateBtn);  
	}

	/**
	 * @return the linktextBox
	 */
	public WebElement getLinktextBox() {
		return getElement(linktextBox);   
	}
	
	
	public String getOptionAttribute() {
		
		return getElementAttribute(null);
		
		
	}

	public void navigateToDataReport() {
		
		util.mouseoverElement(driver, getRsymbol());
		
		//getReportbtn().click();
		
		util.JSClick(driver, getRsymbol());
		
		util.rightClick(driver, getDataReport());
		
		util.JSClick(driver, getEditOpt());
		
		util.JSClick(driver, getOptionsopt());
		
		//util.mouseoverElement(driver, getGenerateLink());
		
		util.JSClick(driver, getGenerateLink());
		
		//getGenerateLink().click();
		
		getDiscriptions().sendKeys("Description");
		
		getPublicRadiobtn().click();
		
		getGenerateBtn().click();
		
	}
	
	
	
	

}
