package AutomationWithJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String password= GetPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Kalam");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		
	}
	public static String GetPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] FstLst= passwordText.split("'");
		String ExtractedPassword =  FstLst[1].split("'")[0];
		return ExtractedPassword;
	}
	
}
