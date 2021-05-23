import java.awt.AWTException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Robcls {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\klaivan\\eclipse-workspace\\Baseclass\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3500);
	WebElement mon =driver.findElement(By.id("month"));
	Select s = new Select(mon);
	boolean b = s.isMultiple();
	System.out.println(b);
	s.selectByIndex(9);
	s.selectByValue("3");
	s.selectByVisibleText("Aug");
	
	
	
	
	
	
	
	
	
	
	
}
}
