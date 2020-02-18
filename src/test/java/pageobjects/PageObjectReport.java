package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectReport {

	public PageObjectReport(WebDriver driver) {
		super();
	}

	private WebDriver driver;

	public void LoginPagina(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/a[3]")
	public static WebElement REPORTISSUE;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select")
	public static WebElement PROJETO;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[4]/td/input")
	public static WebElement BOTAOSELECIONAR;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select")
	public static WebElement CATEGORIA;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[3]/td[2]/select")
	public static WebElement REPRODUTIBILIDADE;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[4]/td[2]/select")
	public static WebElement GRAVIDADE;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[5]/td[2]/select")
	public static WebElement PRIORIDADE;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[8]/td[2]/input")
	public static WebElement SUMMARY;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[9]/td[2]/textarea")
	public static WebElement DESCRICAO;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[15]/td[2]/input")
	public static WebElement ENVIARRELATORIO;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"filters_form_open\"]/table/tbody/tr[11]/td[2]/span/a")
	public static WebElement MENSAGEM;
	
}
