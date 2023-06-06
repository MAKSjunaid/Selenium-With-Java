package AutomationWithJava;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lastttt 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] names= {"Cucumber","Beetroot","Tomato"};
		int j=0;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> AllProds= driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<AllProds.size();i++)
		{
			String Sorted = AllProds.get(i).getText().split("-")[0].trim();
			List namessorted = Arrays.asList(names);
			if(namessorted.contains(Sorted))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				{
					if(j==names.length)
					{
						break;
					}
				}
			}
		}
	}
}
