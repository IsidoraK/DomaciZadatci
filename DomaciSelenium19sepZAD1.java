package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciSelenium19sepZAD1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Domaci zadatak:
		// Napisati program koji ucitava https://practicetestautomation.com/ stranicu,
		// klikne na "Practice" i klikne na "Test login page", popunjava username i
		// password (student/Password123), loguje se na stranicu klikom na dugme Submit
		// i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.

System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-20\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector
				(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"))
				.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
