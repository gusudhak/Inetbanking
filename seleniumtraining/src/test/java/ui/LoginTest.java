package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input")).sendKeys("sudhakar");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		driver.close();
	}

}
