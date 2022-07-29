package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	
	
		 public static void main(String[]args)
		 {

			 WebDriverManager.chromedriver().setup();//setup the browser
				ChromeDriver fb = new ChromeDriver();// launch the browser
				fb.get("https://en-gb.facebook.com/");
				
				fb.manage().window().maximize();
				fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				fb.findElement(By.linkText("Create New Account")).click();
				fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thillai");
				fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nandhini");
				fb.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("letsmail@gmail.com");
				fb.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("letsmail@gmail.com");
				fb.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123@sat");
				
				WebElement dateele =fb.findElement(By.xpath("//select[@id='day']"));
				Select selectdate = new Select(dateele);
				selectdate.selectByValue("28");
				
				WebElement monthele =fb.findElement(By.xpath("//select[@id='month']"));
				Select selectmonth = new Select(monthele);
				selectmonth.selectByValue("10");
				
				WebElement yearele = fb.findElement(By.xpath("//select[@id='year']"));
				Select selectyear = new Select(yearele);
				selectyear.selectByValue("1992");
				
				WebElement radiogender = fb.findElement(By.xpath("//label[text()='Female']"));  
				radiogender.click();
				
				fb.findElement(By.xpath("//button[contains (text(),'Sign')]")).click();
				
		}
}
