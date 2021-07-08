package vinaySelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAlerts {
	
	public static void main(String [] args)
	{
        ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_03.html");
			
			Alert simpleAlert = driver.switchTo().alert();
			
			System.out.println("Alert text : " + simpleAlert.getText());
			
			simpleAlert.accept();
			
			Alert confirmAlert = driver.switchTo().alert();
			System.out.println("Text : " + confirmAlert.getText());
			
			confirmAlert.accept();
			
			Alert promptAlert = driver.switchTo().alert();
			
			promptAlert.sendKeys("Elixir");
			promptAlert.accept();
			
			if(driver.getTitle().contains("Elixir")) {
				System.out.println("Alert worked");
			}
			
			
		}
		finally {
			driver.quit();
		}
	}

}
