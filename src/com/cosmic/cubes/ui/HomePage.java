package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForHomePage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
	public WebElement getProjectAndTaskTab()
	{
		return driver.findElement(By.xpath("//span[text()='Projects & Tasks']"));
	}
	public WebElement getLogoutButton()
	{
		return driver.findElement(By.cssSelector(".logoutImg"));
	}
	
}
