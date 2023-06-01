package AutomationWithJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Kalam");
		driver.findElement(By.name("inputPassword")).sendKeys("123456789");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("M A Kalam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Junaid");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("junaid@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9052864329");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[1]")).getText());

	}

}
