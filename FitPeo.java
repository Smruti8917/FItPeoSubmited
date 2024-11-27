package TestCases;


	
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;


	import io.github.bonigarcia.wdm.WebDriverManager;

 class FitPeo {

		public static void main(String[] args)  {
			
					WebDriverManager.chromedriver().setup();
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.fitpeo.com/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					driver.findElement(By.xpath("//div[@class='MuiBox-root css-3f59le']/header/div/div[3]/div[6]/a/div")).click();
					
					WebElement element=driver.findElement(By.xpath("//input[@id=':r0:']"));//
				    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					
				    WebElement element1=driver.findElement(By.xpath("//div[@class='MuiBox-root css-79elbk']/div/span/span[2]"));
				    Actions action=new Actions(driver);
				    action.dragAndDropBy(element1, 108, 0).perform();
				    
					 driver.findElement(By.xpath("//label/span[1]/input")).click();
					 driver.findElement(By.xpath("//div[2]/div[2]/label/span[1]/input")).click();
					 driver.findElement(By.xpath("//div[3]/label/span[1]/input")).click();
					 driver.findElement(By.xpath("//div[8]/label/span[1]/input")).click();
				   
				}
		}





