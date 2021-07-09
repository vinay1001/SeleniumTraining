package vinaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements4 {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");
			
		    WebElement radioSelect = driver.findElement(By.cssSelector("input[value='masters']"));
		    
		    if(radioSelect.isEnabled() && radioSelect.isDisplayed()) {
		    	
		    	System.out.println("The radio button is enabled and displayed");
		    	if(!radioSelect.isSelected())
		    		radioSelect.click();
		        
		    	if(radioSelect.isSelected())
		    		System.out.println("The option is selected");
		    }
		    
		    WebElement email = driver.findElement(By.id("emailUpdates"));
		    
		    if(email.isEnabled() && email.isDisplayed()) {
		    	
		    	if(!email.isSelected())
		    		email.click();
		    	if(email.isSelected())
		    		System.out.println("Email updates selected");
		    	
		    	
		    }
		}
		finally {
			
			driver.quit();
			
		}

	}

}
