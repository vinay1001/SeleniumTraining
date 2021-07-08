package vinaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindows {

	public static void main(String [] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_03.html");
	    	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	    	
	    	System.out.println("window title contains : " + driver.getTitle());
	    	String parentWindowHandle = driver.getWindowHandle();
	    	
	    	driver.switchTo().window("TwitterWindow");
	    	
	    	System.out.println("window title contains : " + driver.getTitle());
	    	
	        //switching back to parent window
	    	driver.switchTo().window(parentWindowHandle);
	    	
		}
		finally
		{
			driver.quit();
		}
	}

}
