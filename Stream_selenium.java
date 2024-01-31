package com.auto;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Stream_selenium {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all webelements into list
		List<WebElement> originalelement = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into list
		// In lambda expression- Left side argument contain element present in the
		// stream or list while right side perform the actions on the element
		List<String> Originaltext = originalelement.stream().map(s -> s.getText()).collect(Collectors.toList());
		//Used map here since we need all the element
		System.out.println(Originaltext);
		// sort on the original list of step 3 -> sorted list
		List<String> sortedelement = Originaltext.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedelement);
		// compare original list vs sorted list
		Assert.assertEquals(Originaltext, sortedelement);
		Assert.assertTrue(Originaltext.equals(sortedelement));

		List<String> price;
// Build custom selenium methods using streams wrapper
		// scan the name column with getText ->Beans->print the price of the Rice
		//pagination
do {
	    List<WebElement> originalelement2 = driver.findElements(By.xpath("//tr/td"));
	    price= originalelement2.stream().filter(s -> s.getText().contains("Rice"))//used filter to get particular text
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		//System.out.println(price);
		price.forEach(s -> System.out.println(s));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
        
}	while(price.size()<1);
}
	

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
	

}
