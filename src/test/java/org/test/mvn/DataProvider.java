package org.test.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	WebDriver driver;
	@BeforeMethod
	private void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	@Parameters({"Username","Password","Location","Hotels","Room Type","Number of rooms","Check in date","Check out date","Adults per room","Children per room"})
	@Test()
	private void tc0(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) {
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys(s);
		WebElement Password = driver.findElement(By.id("//input[@name='password']"));
		Password.sendKeys(s1);
		WebElement Login = driver.findElement(By.id("//input[@name='login']"));
		Login.click();
		WebElement location = driver.findElement(By.id("//select[@name='location']"));
		location.sendKeys(s2);
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Hotels.sendKeys(s3);
		WebElement Roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Roomtype.sendKeys(s4);
		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		rooms.sendKeys(s5);
		WebElement Indate = driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
		Indate.sendKeys(s6);
		WebElement outdate = driver.findElement(By.xpath("//*[@id=\"datepick_out\"]"));
		outdate.sendKeys(s7);
		WebElement adults = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
		adults.sendKeys(s8);
		WebElement children = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
		children.sendKeys(s9);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		search.click();
//		WebElement findElement = driver.findElement(By.xpath(""));
//		WebElement findElement = driver.findElement(By.xpath(""));
//		WebElement findElement = driver.findElement(By.xpath(""));
//		WebElement findElement = driver.findElement(By.xpath(""));
//		
	}
	
	
	
	
	
	
}
