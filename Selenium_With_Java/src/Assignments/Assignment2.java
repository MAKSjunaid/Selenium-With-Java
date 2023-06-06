package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> Windows= driver.getWindowHandles();
		Iterator<String> it= Windows.iterator();
		String MainWindow = it.next();
		String ChildWindow = it.next();
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(MainWindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}
}
