package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price = driver.findElement(By.xpath("(//a[@class='a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]/span[1]")).getText();
		String newprice = price.replaceAll("\\D", "");
		System.out.println("The price of the first product: " +newprice);
		
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Customer ratings: " +rating);
		
		WebElement stars = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(stars).click().perform();
		String percentage = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]")).getText();
		System.out.println("Percentage of 5 star ratings: " +percentage);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> firstwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(firstwindow.get(1));
		//driver.findElement(By.xpath("//div[@id='imgTagWrapperId']")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/phone.png");
		FileUtils.copyFile(source, destination);
		
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		String cart = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']//span[contains(text(),'49,999')]")).getText();
		String newcart = cart.replaceAll("\\D", "");
		String subtotal = newcart.replaceAll("0", "");
		System.out.println("Cart Subtotal: " +subtotal);
		
	
		if(newprice.equals(subtotal)) {
			
			System.out.println("The prices are equal");
			
		} else {
			
			System.out.println("The prices are different");
		}
		
		
		
	}}
