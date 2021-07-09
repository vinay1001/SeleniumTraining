package vinaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;


public class AgeCalculatorPage {
	
	private WebElement dayOfBirth = null;
	private WebElement monthOfBirth = null;
	private WebElement yearOfBirth = null;
	private WebElement age = null;
	private WebElement zodiacSign = null;
	private WebElement calculate = null;
	
	private WebDriver driver;
	private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html";

	//class constructor
	public AgeCalculatorPage(WebDriver webDriver) {
		driver = webDriver;
	}
	
	//methods to open and close the webdriver
	public void open()
	{
		this.driver.get(url);
	}
	
	public void close() {
		this.driver.quit();
	}
	
	public void  calculate(String day,String month,String year)
	{
		getDayOfBirth().sendKeys(day);
		getMonthOfBirth().sendKeys(month);
		getYearOfBirth().sendKeys(year);
		getCalculate().click();
	}
	
	public String getAge()
	{
	   age = driver.findElement(By.id("age"));
	   return age.getText();
	}
	
	public String getZodiacSign()
	{
	   zodiacSign = driver.findElement(By.id("zodiacSign"));
	   return zodiacSign.getText();
	}
	
	public WebElement getDayOfBirth() {
		dayOfBirth = driver.findElement(By.id("dayOfBirth"));
		return dayOfBirth;
	}
	
	public WebElement getMonthOfBirth() {
		monthOfBirth = driver.findElement(By.id("monthOfBirth"));
		return monthOfBirth;
	}
	
	public WebElement getYearOfBirth() {
		yearOfBirth = driver.findElement(By.id("yearOfBirth"));
		return yearOfBirth;
	}
	
	public WebElement getCalculate() {
		calculate = driver.findElement(By.id("calculate"));
		return calculate;
	}
	

}
