
package Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		SignIn(driver, wait);
		AddAllProductsToCart(driver, wait);	
	}
	public static void SignIn(WebDriver driver,WebDriverWait wait) 
	{
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement element = driver.findElement(By.cssSelector("select.form-control"));
		Select sel = new Select(element);
		sel.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}
	public static void AddAllProductsToCart(WebDriver driver,WebDriverWait wait)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-footer']/button")));
		List<WebElement> AddButtons= driver.findElements(By.xpath("//div[@class='card-footer']/button"));
		for(int i=0;i<AddButtons.size();i++)
		{
			AddButtons.get(i).click();
		}
		driver.findElement(By.cssSelector("a[class*='btn-primary']")).click();
	}
}
