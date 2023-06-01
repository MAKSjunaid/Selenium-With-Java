package AutomationWithJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dynamic_Inside_Dropdowns {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
						
		WebElement element= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency=new Select(element);
		currency.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println(currency.getFirstSelectedOption().getText());
		currency.selectByValue("USD");
		Thread.sleep(2000);
		System.out.println(currency.getFirstSelectedOption().getText());
		currency.selectByVisibleText("INR");
		Thread.sleep(2000);
		System.out.println(currency.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<6;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
