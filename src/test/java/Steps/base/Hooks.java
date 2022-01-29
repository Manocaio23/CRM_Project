package Steps.base;

import static Driver.DriverFactory.pegaDriver;
import static Driver.DriverFactory.limpaDriver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public WebDriver driver;
		
		@BeforeClass
		public void setup() {
			pegaDriver();
		}
		
		@After
		public void tearDown() {

			limpaDriver();
		}
}
