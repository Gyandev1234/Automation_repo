package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dev01@mailinator.com");
		driver.findElement(By.id("pass")).sendKeys("Pass@1234");
		String str=driver.getTitle();
		System.out.println(str);		
		String str1=driver.getCurrentUrl();
		System.out.println(str1);
	}

}
