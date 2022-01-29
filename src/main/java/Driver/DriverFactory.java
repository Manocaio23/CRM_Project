package Driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	public static WebDriver pegaDriver() {
		if (webDriver.get()==null) {
			webDriver.set(criarDriver());
		}
		return webDriver.get();
	}
	private static WebDriver criarDriver() {
		WebDriver driver = null;

		String tipoNavegador = "chrome";
		switch (tipoNavegador) {

		case "chrome": {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			ChromeOptions chormeoptions = new ChromeOptions();
			chormeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(chormeoptions);
			break;
		}
		case "firefox": {
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(firefoxoptions);
			break;
		}

		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void limpaDriver() {
		webDriver.get().quit();
		webDriver.remove();
	} 

}
