import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	
	public static WebDriver driver;
	@BeforeMethod
	public void CICDTests() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	

@Test(priority=1)
	public void test1() {
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
		
	}

@Test(priority=2)
public void test2() {
	driver.get("http://www.hotmail.com");
	System.out.println(driver.getTitle());	
	}

@Test(priority=3)
public void test3() {
	driver.get("http://www.gmail.com");
	System.out.println(driver.getTitle());
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}
