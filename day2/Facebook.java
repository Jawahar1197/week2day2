package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("9843754229");
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		WebElement drop = driver.findElement(By.id("day"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText("1");
		WebElement drop1 = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(0);
		WebElement drop2 = driver.findElement(By.id("year"));
		Select dropdown2 =new Select(drop2);
		dropdown2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.close();

	}

}
