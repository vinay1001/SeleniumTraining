package vinaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements3 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");
			
			Select singleChoiceList = new Select(driver.findElement(By.id("monthOfBirth")));
		    
			//single selections
			if(!singleChoiceList.isMultiple() && singleChoiceList.getOptions().size()==13) {
				
				singleChoiceList.selectByVisibleText("February");
				System.out.println("Text selected - " + singleChoiceList.getFirstSelectedOption().getText());
			}else {
				System.out.println("Something went wrong");
			}
			
			//multiple selections
			Select multipleChoiceList = new Select(driver.findElement(By.id("hobbies")));
		
		    if(multipleChoiceList.isMultiple() && multipleChoiceList.getOptions().size() == 4) {
		    	
		    	multipleChoiceList.selectByVisibleText("Reading");
		    	multipleChoiceList.selectByVisibleText("Sports");
		    	multipleChoiceList.selectByVisibleText("Traveling");
		    	
		    	multipleChoiceList.deselectByVisibleText("Reading");
		    	
		    	if(multipleChoiceList.getAllSelectedOptions().size() == 2) {
		    		
		    		for(WebElement s : multipleChoiceList.getAllSelectedOptions() ) {
		    			
		    			System.out.println("option - " + s.getText());
		    		}
		    	}
		    }
		}
		finally {
			
			driver.quit();
			
		}

	}

}
