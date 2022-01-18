package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;



public class GerenciamentoUserSteps {
	private WebDriver driver;
	//private String fake;
	private String nome;
	Faker fake= new Faker();
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		ChromeOptions chormeoptions = new ChromeOptions();
		chormeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver= new ChromeDriver(chormeoptions);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

	@Dado("que esteja no Orage")
	public void que_esteja_no_orage() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@Quando("escrevo o Login {string}")
	public void escrevo_o_login(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}

	@Quando("a {string}")
	public void a(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		
		
	}

	@E("clico no botao login")
	public void clico_no_botao_login() {
		driver.findElement(By.id("btnLogin")).click();
   
	}

	@E("visualizo {string}")
	public void visualizo(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		//WebElement element =
		//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	}

	@Quando("passo o mouse em cima de Administrador")
	public void passo_o_mouse_em_cima_de_administrador() {
		
	}

	@E("visualizo Gerenciamento de usuario")
	public void visualizo_gerenciamento_de_usuario() {
		
	}

	@E("em seguida clico em comercial")
	public void em_seguida_clico_em_comercial() {
		
	}

	@Quando("clico no botao adicionar")
	public void clico_no_botao_adicionar() throws InterruptedException {
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(1500);
	}

	@E("seleciono a funcao {string}")
	public void seleciono_a_funcao(String string) {
		WebElement element= driver.findElement(By.id("systemUser_userType"));
		Select select= new Select(element);
		select.selectByVisibleText(string);
	}

	@E("seleciono o funcionario {string}")
	public void seleciono_o_funcionario(String funcionario) {
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(funcionario);
	}

	@E("nome de usuario")
	public void nome_de_usuario() {
		
		driver.findElement(By.id("systemUser_userName")).sendKeys("Thommas Shelby");
	}

	@E("situacao {string}")
	public void situacao(String string) {

	}

	@E("senha {string}")
	public void senha(String string) {

	}

	@E("repetir a senha {string}")
	public void repetir_a_senha(String string) {

	}

	@E("clico no botao save")
	public void clico_no_botao_save() {

	}

	@Entao("devo ver a mensagem que sucesso")
	public void devo_ver_a_mensagem_que_sucesso() {

	}
}