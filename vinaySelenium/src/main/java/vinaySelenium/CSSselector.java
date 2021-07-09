package vinaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSselector {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");
			
		    WebElement firstName = driver.findElement(By.cssSelector("input#firstName")); //element#id
		    
		    if(firstName.isDisplayed() && firstName.isEnabled())
		    {
		    	firstName.sendKeys("Perala Bhargavi Vinay");
		    	System.out.println(firstName.getAttribute("value"));
		    }
		    
		    
		}
		finally {
			//driver.quit();
		}

	}

}
