package com.expedia.BDDCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {

	@Test
	public  void login() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://github.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user[login]")).sendKeys("sarah-geo");
		driver.findElement(By.id("user[email]")).sendKeys("xxxx.com");
		driver.findElement(By.id("user[password]")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//button[text()='Sign up for GitHub']")).click();;
		
	}

}
