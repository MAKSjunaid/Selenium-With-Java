package Spicejet_Complete_Project;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> ele= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement sorted : ele)
		{
			if(sorted.getText().equalsIgnoreCase("India"))
			{
				sorted.click();
				break;
			}
		}
				
				
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"HYD\"]")).click();
		
				
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Its enabled");
			Assert.assertTrue(false);
		}
		
				
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel=new Select(element);
		sel.selectByValue("USD");
		
		
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.quit();
		
	}
}
