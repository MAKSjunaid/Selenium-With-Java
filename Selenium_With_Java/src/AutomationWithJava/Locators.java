package AutomationWithJava;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(4000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("kalam");
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("MA");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Junaid@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Junaid112233@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder*='Phone Num']")).sendKeys("9052864329");   //half text for dynamic text changes scenario.
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[1]")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("kalam");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
				
		Thread.sleep(10000);
		driver.quit();
	}
}
