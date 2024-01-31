package depth.com;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_Locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// Only with the help of tag name we can use the relative locator
		// we can use this instead of child parent traverse
		WebElement name = driver.findElement(By.name("name"));
		System.out.println(
				driver.findElement(with(By.tagName("label")).above(driver.findElement(By.name("name")))).getText());
		
		//relative locator doesn't consider flex element or property
		WebElement d0b = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(d0b)).click();
		WebElement left = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
		WebElement right = driver.findElement(By.name("inlineRadioOptions"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(right)).getText());
		

	}

}
