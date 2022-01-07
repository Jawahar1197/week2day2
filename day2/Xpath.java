package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
    driver.findElement(By.xpath("//a[contains(@id,'ext-gen']")).click();
    driver.findElement(By.xpath("//a[text()='createlead']")).click();
    WebElement drop = driver.findElement(By.xpath("//select[@id=createLeadForm_dataSourceId"));
    Select dropdown = new Select(drop);
    
}}
