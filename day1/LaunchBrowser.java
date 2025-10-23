package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("nanthinipriyanka04");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
		
	}

}
