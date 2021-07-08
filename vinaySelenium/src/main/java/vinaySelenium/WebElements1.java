package vinaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class WebElements1{
	
	public static void main(String [] args)
	{
        System.out.println("Configuring selenium");
        
       
        ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_B-1.html");
			
			
			WebElement spanish = driver.findElement(By.id("spanish"));
			spanish.click();
			WebElement email = driver.findElement(By.id("inputEmail"));
			
			email.sendKeys("email@gmail.com");
			
			//we use attribute to check whether it is typed or not
			if(email.getAttribute("value").equalsIgnoreCase("email@gmail.com")) {
				System.out.println("Email typed into input");
			}
			else {
				System.out.println("Email not typed into input");
			}
			
			
	    }
		finally {
			
			driver.quit();
			
		}
	}
	
}