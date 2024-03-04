package almosaferAr;

import static org.testng.Assert.assertThrows;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestArbi {
	WebDriver driver = new ChromeDriver();
//	https://www.almosafer.com/ar/
//		1- go to chaltes or شاليهات section 
//		2-search about chaltes in المدينة المنورة 
//		3- select the second result 
//		4- select any random check in and check out date 
//		5- and click on book now 
	@BeforeTest
	public void sutup() {
		driver.get("https://www.almosafer.com/ar/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@Test(priority = 1)
	public void gotochaltes() throws InterruptedException {
		 WebElement welo = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/button[1]"));
	 		welo.click();
	 	 WebElement hotel=driver.findElement(By.cssSelector("#uncontrolled-tab-example-tab-hotels"));
	 	 hotel.click();
	 WebElement shali=driver.findElement(By.cssSelector("#uncontrolled-tab-example-tab-chalets"));
	 shali.click();
		WebElement ontr=driver.findElement(By.cssSelector("input[placeholder='اختر مدينة']"));
		ontr.click();
		WebElement aldenha=driver.findElement(By.cssSelector("button:nth-child(7)"));
		aldenha.click();
		WebElement searh=driver.findElement(By.cssSelector(".Button__Btn-sc-xr32du-0.bwtwxz.sc-imAxmJ.gVJtmY"));
		searh.click();	
		Thread.sleep(3000); 
		WebElement seoundreuselt=driver.findElement(By.cssSelector(".Button__Btn-sc-xr32du-0.XUqfN[data-testid='searchResults_PropertyCard_1_checkAvailabilityButton']"));
		seoundreuselt.click();
		
		
		
		

		
		
}
	@Test(priority = 2)
	public void randomcheckinandcheckout() throws InterruptedException
	
	{Thread.sleep(9000);
	
		WebElement checkin=driver.findElement(By.id("js-C2CGuestSearchBoxDatePickerCheckInDate"));
	checkin.click();
	Random rand = new Random();
	List<WebElement> date = driver.findElements(By.className("DayPicker-Body"));
	for (int i = 0; i < date.size(); i++) {
		
		 int randomdate1 = rand.nextInt(date.size());
		    date.get(randomdate1).click();
	 	
	}
		
	WebElement checkout =driver.findElement(By.cssSelector(".DesktopDatePickerstyles__DateBox-sc-de798v-4.DesktopDatePickerstyles__CheckOutDate-sc-de798v-6.cjxOPk.iZNqXq.C2CGuestSearchBox__CheckOutDate"));
checkout.click();	
List<WebElement> date2 = driver.findElements(By.className("DayPicker-Body"));
for (int i = 0; i < date2.size(); i++) {
	
	 int randomdate2 = rand.nextInt(date2.size());
	    date.get(randomdate2).click();
 	
}
Thread.sleep(9000);
WebElement bak=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]"));
bak.click();
WebElement eite=driver.findElement(By.cssSelector(".MuiIconButton-label"));
eite.click();
 WebElement book=driver.findElement(By.cssSelector(".sc-jONnzC.fqmXJD.BookNowButton__StyledButton-sc-1hapap0-0.foEuOy.btn.btn-primary.btn-block.btn-large"));
 book.click();
	
	
	}
	@AfterTest
	public void enftest() {
	}
}
