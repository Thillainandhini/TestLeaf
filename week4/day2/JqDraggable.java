package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JqDraggable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 200, 100 ).perform();
		
		Actions builder1 = new Actions(driver);
		builder1.dragAndDropBy(drag, 150, 50).perform();
		
		Actions builder2 = new Actions(driver);
		builder2.dragAndDropBy(drag, 50, 100).perform();
		
		
		

	}


}
