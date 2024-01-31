package com.auto;

import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class Webtable_udemy {



public static void main(String[] args) {


WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");

//limiting webdriver scope

WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());

//locator chaining 

System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}


