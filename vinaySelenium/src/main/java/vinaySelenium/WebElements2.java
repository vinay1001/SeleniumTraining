package vinaySelenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class WebElements2 {

	public static void main(String[] args) {
		
		textboxes();

	}
	
	public static void textboxes()
	{
	   ChromeDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");
			
			WebElement textArea= driver.findElement(By.id("aboutYourself"));
			
			if(textArea.isEnabled() && textArea.isDisplayed()) {
				System.out.println("The text area is visible and displayed");
			}else {
				System.out.println("Something went wrong");
			}
			
			if(textArea.getAttribute("value").equals("")) {
				System.out.println("The text area is empty");
				textArea.sendKeys("This is a sample text");
				System.out.println(textArea.getAttribute("value"));
			}else {
				System.out.println("Textbox is not empty");
			}
			
			
		}
		finally {
			driver.quit();
		}
	}

}
