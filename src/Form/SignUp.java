package Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUp {
	
	WebDriver driver;
	public static String URL= "http://dc.designcollection.in/codecanyon/gsrf-google-sheet-registration-form/registration-from-5.html?ref=designcollection";
	
@Test

public void Browser(){
	driver = new ChromeDriver();
	//sdfdsf
	//sfddsfdsf
	driver.manage().window().maximize();
	driver.get(URL);
	System.out.println("Page Title =" + "  " + driver.getTitle());
	}

@Test
public void locator(){
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("ABC");
	driver .findElement(By.xpath("//input[@name='lname']")).sendKeys("QA");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("VCS");
	driver.findElement(By.xpath("//input[@name='suggestion']")).sendKeys("This is my note");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Punjab");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Lahore");
	Select country = new Select(driver.findElement(By.name("country")));
	country.selectByValue("Japan");
	Select occupation = new Select(driver.findElement(By.name("occupation")));
	occupation.selectByValue("Business Men");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("0324456159");
	driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("03/03/2019");
	driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("54000");
	driver.findElement(By.xpath("//input[@name='gender']")).click();
	driver.findElement(By.xpath("//input[@name='excustomer']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
	
@Test
public void TearDown(){
	driver.manage().deleteAllCookies();
	//driver.quit();
}
}
