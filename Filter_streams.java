package depth.com;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Filter_streams {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//list of element [1]
        driver.findElement(By.cssSelector("input#search-field")).sendKeys("tomato");
        List<WebElement> allveggie = driver.findElements(By.xpath("//tr/td[1]"));
        //list of element [1]
       List<WebElement> allveggie1 = allveggie.stream().filter(veggie->veggie.getText().contains("Tomato")).collect(Collectors.toList());
       System.out.println(allveggie.get(0).getText());
       System.out.println(allveggie1.get(0).getText());
       Assert.assertEquals(allveggie.get(0).getText(), allveggie.get(0).getText());
        System.out.println(allveggie.size());
        System.out.println(allveggie1.size());
	}
}
