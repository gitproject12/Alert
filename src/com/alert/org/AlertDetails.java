package com.alert.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDetails {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement b=driver.findElement(By.id("promtButton"));
		b.click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("john");
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(5000);
		al.accept();
		WebElement c= driver.findElement(By.id("promptResult"));
		 String t=c.getText();
		 System.out.println(t);
				
		
		
		
	
		
		
	
		
	}

}
