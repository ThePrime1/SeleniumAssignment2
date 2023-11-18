package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		

		
		//First name and Last name
		driver.findElement(By.id("fname")).sendKeys("Mehedi");
		driver.findElement(By.id("lname")).sendKeys("Hasan");
		
		//Gender
		WebElement testRadioButton = driver.findElement(By.id("male"));
		testRadioButton.click();
		
		//Drop down test
		WebElement testDropDown =  driver.findElement(By.id("option"));
		Select dropDown = new Select(testDropDown);
		dropDown.selectByValue("option 3");
		
		//Check list test
		WebElement testCheckList = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > form:nth-child(3) > fieldset:nth-child(1) > input:nth-child(40)"));
		testCheckList.click();
		
		//Button click
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		

	}

}
