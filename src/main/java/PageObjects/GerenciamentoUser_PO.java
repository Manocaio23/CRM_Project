package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GerenciamentoUser_PO extends Base_PO {
	
	private @FindBy (id="txtUsername")
	WebElement nomeUsuario_TextField;
	
	private @FindBy (id="txtPassword")
	WebElement senhaUsuario_TextField;
	
	private @FindBy (id="btnLogin")
	WebElement BtnLogin;
	
	public GerenciamentoUser_PO() {
	super();	
	}

	public void acessarPagina() {
		NavegarUrl("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	public void setnomeUsuario_textField(String nomeUser) {
		sendKeys(nomeUsuario_TextField, nomeUser);
	}
	
	public void setsenhaUsuario_textField(String senhaUser) {
		sendKeys(senhaUsuario_TextField, senhaUser);
	}
	
	public void setBtnLogin() {
		EsperaOElementoCarregarClicar(BtnLogin);
	}
	
	
	
	
	
}
