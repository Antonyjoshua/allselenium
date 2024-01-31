package depth.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_4 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Antony");
		//partial webelement screenshot
		File source = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ACW USER\\eclipse-workspace\\depth.com\\target.png"));
		
		//Get height and weight of an element
		int height = name.getRect().getDimension().getHeight();
		System.out.println(height);
		int height2 = name.getRect().getDimension().height;
		System.out.println(height2);
		int width = name.getRect().getWidth();
		System.out.println(width);
		int width1 = name.getRect().getDimension().getWidth();
		System.out.println(width1);
		
	}

}
