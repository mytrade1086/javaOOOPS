package com.testcases.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementVisibleDisplayedEnabled {
	public static WebDriver driver;
	@BeforeMethod
	public void before_Method() {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@AfterMethod
	public void after_Method() {
	driver.quit();
	}

	// #####################################Practice
	// Work#################################################################################
	@Test(enabled = false)
	public void elementDisplay() {
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgot Password?']")).isDisplayed()); // true
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgot Password?']")).isEnabled()); // true
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgot Password?']")).getText()); // Forgot
	}

	@Test(enabled = false)
	public void getAlllinks() {
		driver.navigate().to("http://newtours.demoaut.com/index.php");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}

	@Test(priority = 0)
	public void bootstrapDropdown() {
		driver.navigate().to("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[text()='Another action']")).click();
	}
	
	
	
	
	
}
