package vinaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;


public class NavigateWindows {
	
	public static void main(String [] args)
	{
        System.out.println("Configuring selenium");
        
        //checking();
        //resize();
        //manageAlerts();
        //manageFrames();
        //manageWindows();
        
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\BhargaviVinayPerala\\Documents\\Browser driver\\chromedriver.exe");
		
        webdriver.chrome.driver 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		*/
	}
	
	public static void checking()
	{
		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("http://www.google.com");
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			
			if(driver.getTitle().equalsIgnoreCase("Google"))
			{
				System.out.println("Script Worked, the title contains Google");
			}
			else
			{
				System.out.println("Something went wrong with the script, Google was not found");
			}
			
			driver.navigate().to("https://www.yahoo.com");
			if(driver.getTitle().equalsIgnoreCase("Yahoo")) {
				System.out.println("Script Worked, the title contains Yahoo");
			}
			else {
				System.out.println("Something went wrong with the script, Yahoo was not found");
			}
			
			driver.navigate().back();
		}
		finally {
			
			System.out.println("quitted");
			driver.quit();
		}
		
	}
	
	//resize the window
	public static void resize()
	{
		
		ChromeDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.com");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			
			driver.manage().window().setSize(new Dimension(600,800));
			
			if((driver.manage().window().getSize().getHeight() <= 800) && 
					(driver.manage().window().getSize().getWidth() <= 600) )
			{
				System.out.println("correct");
			}
			else
			{
				System.out.println("wrong");
			}
			
			System.out.println(String.format("Current window size is %s height * %s width", driver.manage().window().getSize().getHeight(),driver.manage().window().getSize().getWidth()));
			driver.manage().window().maximize();
			System.out.println(String.format("Current window size is %s height * %s width", driver.manage().window().getSize().getHeight(),driver.manage().window().getSize().getWidth()));
		}
		finally {
			
			driver.quit();
		}
	}

}
