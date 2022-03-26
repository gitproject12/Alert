package com.alert.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement b=driver.findElement(By.name("cusid"));
		b.sendKeys("2585265");
		WebElement c =driver.findElement(By.name("submit"));
		c.click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(2000);
		al.accept();
		
		Alert al2 = driver.switchTo().alert();
		String textq = al.getText();
		System.out.println(textq);
		Thread.sleep(2000);
		al2.accept();
		driver.quit();
		
		
		
		
	}

}
