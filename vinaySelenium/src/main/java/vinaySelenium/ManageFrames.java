package vinaySelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageFrames{
		public static void main(String [] args)
		{
		    ChromeDriver driver = new ChromeDriver();
		    
		    try {
		    	
		    	driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_03.html");
		    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		    	
		    	driver.switchTo().frame("info");
		    	if(driver.getPageSource().contains("Frame Info")) {
		    		System.out.println("Script worked, the focus was changed to Frame Info");
		    	}
		    	else
		    	{
		    		System.out.println("Not found frame info");
		    	}
		    }
		    finally {
		    	driver.quit();
		    }
		}
}