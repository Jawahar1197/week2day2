package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.id("firstNameField")).sendKeys("jawahar");
    driver.findElement(By.id("lastNameField")).sendKeys("V");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("manoj");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Jawahar");
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("civil");
    driver.findElement(By.id("createContactForm_description")).sendKeys("HII");
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Manoj123456@gmail.com");
    WebElement drop = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    Select dropdown =new Select(drop);
    dropdown.selectByValue("NY");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("createContactForm_description")).clear();
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("hello");
    driver.findElement(By.name("submitButton")).click();
}
}
