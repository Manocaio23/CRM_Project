package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Driver.DriverFactory.pegaDriver;

import java.time.Duration;

public class Base_PO {
	
	public Base_PO() {
		
	}
	
	public WebDriver pegaDriver(){
		return Driver.DriverFactory.pegaDriver();
	}
	
	public void NavegarUrl(String url) {
		pegaDriver().get(url);
	}
	
	public void sendKeys(By by, String textoTipo) {
//		WebDriverWait wait = new WebDriverWait(pegaDriver(),Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(pegaDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textoTipo);
		
	}
	
	public void sendKeys(WebElement element, String textoTipo) {

		WebDriverWait wait = new WebDriverWait(pegaDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textoTipo);
		
	}
	
	//pro botao
	public void EsperaOElementoCarregarClicar(WebElement element) {
		WebDriverWait wait = new WebDriverWait(pegaDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void EsperaOElementoCarregarClicar(By by) {
		WebDriverWait wait = new WebDriverWait(pegaDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
}
