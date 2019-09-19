package org.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Sanatorium\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\mahesh\\SnapDeal\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	search.sendKeys("iphone 6");
	Thread.sleep(2000);
	WebElement btn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	btn.click();
	WebElement cli = driver.findElement(By.xpath("//p[@title='Apple iPhone 6s ( 32GB , 2 GB ) Space Grey']"));
	cli.click();
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows);
	List<String> li=new ArrayList<>();
	li.addAll(allwindows);
	driver.switchTo().window(li.get(1));
	WebElement cli1 = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
	cli1.click();
	Thread.sleep(2000);
	WebElement cli2 = driver.findElement(By.xpath("//div[@class='cartInner']"));
	cli2.click();
	Thread.sleep(2000);
	WebElement cli3 = driver.findElement(By.xpath("//div[@id='CS1']"));
	cli3.click();
	WebElement cli4 = driver.findElement(By.xpath("(//li[@class='undefined'])[1]"));
	cli4.click();
	
	
}

}
