package depth.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Real_Exercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Total size present in the page:" + size);
		// Limiting and optimizing the webdriver scope to a particular session. Use only
		// findelement while limiting the scope of webdriver
		WebElement optimize = driver.findElement(By.id("gf-BIG"));
		int size2 = optimize.findElements(By.tagName("a")).size(); // getting into mini session
		System.out.println("Total size present in the footer:" + size2);
		WebElement optimize2 = optimize.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
		int size3 = optimize2.findElements(By.tagName("a")).size();
		System.out.println("Total size present in first session:" + size3);
		for (int i = 1; i < optimize2.findElements(By.tagName("a")).size(); i++) {
			// keyboard event pass it using send keys
			String chord = Keys.chord(Keys.CONTROL, Keys.ENTER);
			optimize2.findElements(By.tagName("a")).get(i).sendKeys(chord);
			Thread.sleep(5000L);
		}
		Set<String> it = driver.getWindowHandles();
		Iterator<String> it1 = it.iterator();
		

		while (it1.hasNext())// Returns true if the iteration has more elements
		{
			driver.switchTo().window(it1.next());
			System.out.println(driver.getTitle());
		}
	}

}
