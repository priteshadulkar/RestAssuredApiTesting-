package COM.PAGES;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sselect {
	WebDriver driver ;
	@Test
	public void Select() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
	driver =  new ChromeDriver();
	driver.navigate().to("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("HOme page of goibebo site successfully launched");
	
	
	Select  sl = new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
	sl.selectByIndex(5);
	//sl.selectByVisibleText("Select");
	sl.selectByValue("ddqtp");
	
	WebElement option = sl.getFirstSelectedOption();

	String defaultItem = option.getText();

	System.out.println(defaultItem );
	
	List<WebElement> option1 = sl.getAllSelectedOptions();
    for(WebElement  rl : option1)
    {
 	   
 	  String text= rl.getText();
 	  System.out.println(text);
 	   
    }
    Select  sl1 = new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
    
	System.out.println(sl1.isMultiple());
	 sl1.selectByIndex(2);
	 sl1.selectByValue("msagile");
	 
	 System.out.println(sl1.getFirstSelectedOption().getText());
	 Thread.sleep(2000);	
	 
	 sl1.deselectByIndex(3);
	 sl1.deselectAll();
   }
	// select mnultiple elemnt on page 

	public void DESelect() {
		
			
			
			
			
			
			
			
			
	}
			
			
			
}