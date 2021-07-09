package vinaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import vinaySelenium.AgeCalculatorPage;

public class AgeCalculatorScript {

	public static void main(String[] args) {
		
		checkAgeCalculator();
		
		}
	
	public static void checkAgeCalculator()
	{
		WebDriver driver = new ChromeDriver();
		
		AgeCalculatorPage pageObject = new AgeCalculatorPage(driver); 
		
		pageObject.open();
		pageObject.calculate("6", "October", "2001");
		System.out.println("Age - " + pageObject.getAge());
		System.out.println("ZodiacSign - " + pageObject.getZodiacSign());
		
		if(pageObject.getAge().equals("19"))
		{
			System.out.println("Age calculated correctly !");
		}
		else
		{
			System.out.println("There was a error in the calculation of age");
		}
		
		if(pageObject.getZodiacSign().equals("Libra"))
		{
			System.out.println("Zodaic Sign calculated correctly !");
		}
		else
		{
			System.out.println("There was a error in the calculation of zodiac sign");
		}
		
		pageObject.close();
		
		
	}

}
