package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		WebElement Move=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions hover=new Actions(driver);
		hover.moveToElement(Move).build().perform();
//		                   OR__________________________________________________________
//		hover.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		hover.moveToElement(Move).contextClick().build().perform();
		
		hover.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}
}
