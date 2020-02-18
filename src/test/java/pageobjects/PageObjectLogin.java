package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectLogin {
	public PageObjectLogin(WebDriver driver) {
		super();
	}
		
		private WebDriver driver;
		
		public void LoginPagina(WebDriver driver) {
			this.driver = driver;
			}
		
		@FindBy (how = How.XPATH, using = "/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")
		public static WebElement USUARIO;
		
		@FindBy (how = How.XPATH, using = "/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")
		public static WebElement SENHA;
		
		@FindBy (how = How.XPATH, using = "/html/body/div[3]/form/table/tbody/tr[6]/td/input")
		public static WebElement LOGIN;
		
		@FindBy (how = How.XPATH, using = "/html/body/table[1]/tbody/tr/td[1]/span[1]")
		public static WebElement MENSAGEM;
		
}
