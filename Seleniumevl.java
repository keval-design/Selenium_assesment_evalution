package Seleniumev;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Seleniumevl {

	
	
	WebDriver driver;
	
	
	
	
	// first task : Launch the Website and verify the title 
	
	@Test(priority=1)
	void LaunchBrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		   driver.manage().window().maximize();
		
		   
	
		 System.out.println(driver.getTitle().equals("QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
		 	   	   
		
	}
	// Task 2: select the radio button and verify it 
	
	
	@Test(priority=2)
	void radio() {
		
		
		WebElement round = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		
		round.click();
		
		System.out.println("Round trip is selected" + round.isSelected());
	}
	
	
	// Task 3 : in from select the delhi 
	@Test(priority=3)
	void from() {
		
	
 WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
 
 
 Select drp = new Select(from);
 
 
 drp.selectByVisibleText("Delhi (DEL)");
	
		
		
	}
	//Task 3 : Select Bengluru from the dropdown
	
	@Test(priority=4)
	void to() {
		
		WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		
		
		Select drps = new Select(to);
		
		drps.selectByVisibleText("Bengaluru (BLR)");
			
	}
	
	// Task 4 : Select departure date 
	
	@Test(priority=5)
	void departuredate() {
		
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		
		driver.findElement(By.linkText("14")).click();
		
	
	
	}
	
	// Task 5 : select return date 
	
	@Test(priority=6)
	void returndate() {
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		
		
		driver.findElement(By.linkText("16")).click();

	}
	
	// Task 6 : check senior citizen checkbox and verify it 
	
	
	@Test(priority=7)
	void checkbox() {
		
		
WebElement seniorcitizen = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));


seniorcitizen.click();


System.out.println("Checkbox is selected" + seniorcitizen.isSelected());
		
	}
	
	@Test(priority=8)
	void passangerdrp() {
		
		
		WebElement passanger = driver.findElement(By.id("divpaxinfo"));
		
		
		passanger.click();
		
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		

	}
	
	@Test(priority=9)
	void search() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10));
	
	WebElement search = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
	
	((javaScriptExecutor)driver).executorscript("argument[0].scrolltoVlew(true)",search);
	
	Thread.sleep(1000);
	
	search.click();
		
		
		
		
	}
	@Test(priority=10)
	void screenshot() {
		
	 TakesScreeshot ts = (TakesScreeshot)driver;
	 File sourcefile = ts.getscreenshot(Outouttype.File);
	 File targetfile = new File("C:\\Users\\keval\\OneDrive\\Pictures/filght_search.png");
	 
	 FilesUtils.OutputtypeFile(sourcefile,targetfile);
		
		
	}
	
	
	
}