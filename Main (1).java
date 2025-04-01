
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class testautomationpractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Http://testautomationpractice.blogspot.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Piyushkumarsingh");
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("singhpiyush@7642");
		//Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("700046572");
		//Thread.sleep(2000);
		driver.findElement(By.id("textarea")).sendKeys("qwertyuiopsdfghjklxcvbnm,dfghjklrtyuicvbnmtyu");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("hindu");
		Thread.sleep(2000);
		driver.findElement(By.name("start")).click();
		//Thread.sleep(2000);
		
		
		driver.findElement(By.id("male")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("tuesday")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("country")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='india']")).click();
		//Thread.sleep(2000);
		
//Scroll Down First Step
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400);");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//option[@value='blue']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='cheetah']")).click();
		//Thread.sleep(2000);
				
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		//Thread.sleep(2000);
		
		
		driver.findElement(By.id("PopUp")).click();
		//Thread.sleep(2000);
				
		//driver.quit();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
