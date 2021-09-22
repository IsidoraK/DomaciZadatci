package SeleniumOsnove;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci20sepHAPPYpath {
	public static void main(String[] args) throws InterruptedException {	
	//https://the-internet.herokuapp.com/forgot_password uneti pasvord preko skenera
			// Napredna Verzija dve klase za uspeh i neuspeh , glavna klasa u kojoj se bira koju opciju zeli oreji switch-a
			
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://the-internet.herokuapp.com/login");
			Thread.sleep(2000);
			System.out.println("Unesite username");
			WebElement username = driver.findElement(By.id("username"));
			username.clear();
			Thread.sleep(2000);
			Scanner nameuser = new Scanner(System.in);
			username.sendKeys(nameuser.next());
			
			Thread.sleep(2000);
			WebElement password  = driver.findElement(By.id("password"));
			password.clear();
			System.out.println("Unesite password");
			Scanner wordpass = new Scanner(System.in);
			
			password.sendKeys(wordpass.next());
			Thread.sleep(2000);
			WebElement login = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
			login.click();
			
			WebElement message = driver.findElement(By.cssSelector(".flash.success"));
			String m = message.getText();
			
			if (m.contains("You logged into a secure area!")) {
				System.out.println("You are loged in");}
			
			
			
			
			
	
	
	
	
	}	
}
