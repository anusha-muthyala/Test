package com.google.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver obj = null;

	@Test
	@Parameters({ "browser", "username", "password" })

	public void cbr(String browser, String username, String password) throws InterruptedException {
		if (browser.equalsIgnoreCase("ChromeDriver")) 
			System.setProperty("webdriver.chrome.driver",
					"H:\\Anusha\\selenium-jars\\chromedriver_win32_new\\chromedriver.exe");
			obj = new ChromeDriver();
			System.out.println("running with googlechrome");
		Thread.sleep(4000);
		obj.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("username");
		obj.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("password");
		obj.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(obj.getTitle(), "OrangeHRM - New Level of HR Management");

		System.out.println("Running TC_1");
	}
}
