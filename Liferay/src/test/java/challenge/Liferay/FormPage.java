package challenge.Liferay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
	// Using Page Object Model this class contains the elements of the page
	public WebDriver driver;
	//field name
	By userName = By.xpath("//input[contains(@name,'WhatIsYourName')]");
	//calendar icon
	By calendar = By.cssSelector(".lexicon-icon-calendar");
	By date = By.cssSelector(".date-picker-date-row:nth-child(2) > .date-picker-date:nth-child(3)");
	//select a date from calendar
	By submit = By.id("ddm-form-submit");
	//Why did you join the test area field
	By whyField = By.xpath("//textarea[contains(@name,'WhyDidYouJoinTheTestingArea')]");
	
	
	public FormPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void setName(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	
	public void setWhy(String reason) {
		driver.findElement(whyField).sendKeys("reason");
	}
	
	public void chooseDate() {
		driver.findElement(calendar).click();
		driver.findElement(date).click();
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}
	
	public String  getSucessText() {
		By success = By.cssSelector(".ddm-form-description");
		String text = driver.findElement(success).getText();
		return text;
	}
	
	public String  getNotification() {
		By notification = By.cssSelector(".form-feedback-item");
		String text = driver.findElement(notification).getText();
		return text;
	}
	
}
