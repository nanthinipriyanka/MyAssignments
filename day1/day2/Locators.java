package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VSM Software");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nanthini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priyanka");
		WebElement sourceDD =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		WebElement industryDD =driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_DISTRIBUTION");
		WebElement ownweshipFF =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel12=new Select(ownweshipFF);
		sel12.selectByValue("OWN_CCORP");
		WebElement marketcom =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel13=new Select(marketcom);
		sel13.selectByVisibleText("Automobile");
		//Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    System.out.println("Page Title:"+driver.getTitle());
	    driver.close();
	}

}
