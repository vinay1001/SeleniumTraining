package vinaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDriverSetup {
	
	public static void main(String [] args)
	{
        System.out.println("Configuring selenium");
        
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\BhargaviVinayPerala\\Documents\\Browser driver\\chromedriver.exe");
		
        //webdriver.chrome.driver 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
