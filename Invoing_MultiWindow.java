//First navigate to first url and open the second url in new tab. Now get the name of the first course, come back to the first url and type that name in the name field

package depth.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoing_MultiWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// Invoke a new window, only available in selenium 4
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> it = driver.getWindowHandles();
		Iterator<String> window = it.iterator();
		String parent = window.next();
		String child = window.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");
		WebElement name = driver.findElement(
				By.xpath("(//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')])[2]"));
		String finalname = name.getText();
		System.out.println(finalname);
//		String finalname = driver.findElement(with(By.tagName("img")).below(name)).getText();
//		System.out.println(finalname);
//		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
//
//				.get(1).getText();
//
		driver.switchTo().window(parent);

		WebElement name1 = driver.findElement(By.cssSelector("[name='name']"));

		name1.sendKeys(finalname);
	}

}
