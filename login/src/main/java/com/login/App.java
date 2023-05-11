package com.login;

/**
 * Hello world!
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","../chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("yourUsername");
		  driver.findElement(By.id("pass")).sendKeys("yourPassword");
		  driver.findElement(By.name("login")).click();
}
}
