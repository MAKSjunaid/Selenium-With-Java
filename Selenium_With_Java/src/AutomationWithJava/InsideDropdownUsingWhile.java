package AutomationWithJava;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class InsideDropdownUsingWhile {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Before selecting passengers "+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		
//		----------------INSTEAD OF WRITING 4 TIMES TO CLICK SAME ELEMENT-------------------------
//		*EXAMPLE
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
		
//		-------------------USING WHILE------------------------------------------------------------
//		int i=1;
//		while (i<5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		
//	-----------------------USINF FOR---------------------------------------------------------------	
		for(int i=1;i<5;i++)             //HERE i=1 BECAUSE IN UI DEFAULT ELECTED VALUE IS 1
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");                             TO VALIDATE WITHOUT COLSOLE/PRINTING/WATCHING IN IT.
		
		System.out.println("After selecting passengers "+driver.findElement(By.id("divpaxinfo")).getText());
	}
}
