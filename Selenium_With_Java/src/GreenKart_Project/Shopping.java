package GreenKart_Project;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Shopping 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] Items= {"Cucumber","Beetroot","Brocolli","Brinjal","Apple"};
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		getdata(driver,Items);   //ONE WAY TO CALL GETDATA(METHOD) BUT WE NEED TO CONVERT GETDATA TO STATIC BY WRITING STATIC
		
//		Shopping s=new Shopping();       //SECOND WAY TO CALL GETDATA BY CREATING OBJECT THEN WE CAN ACCESS TO METHOD
//		s.getdata(driver, Items);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
	}
	public static  void getdata(WebDriver driver, String[] Items)
	{
		int j=0;
		List<WebElement> AllItemsName = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<AllItemsName.size();i++)
		{
			String ProductName = AllItemsName.get(i).getText().split("-")[0].trim();
//			System.out.println(AllItemsName.get(i).getText().split("-")[0].trim());
//			String exactName=name[0].trim();
			List ItemsNeeded = Arrays.asList(Items);
			
			if(ItemsNeeded.contains(ProductName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==Items.length)
				{
					break;
				}
			}
		}
	}
}
