package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.PageObjectLogin;
import utils.Utils;

public class LoginSteps extends Utils {

	@Given("^que ao logar no sistema com os dados \"([^\"]*)\" e \"([^\"]*)\"$")
	public void eu_logo_no_sistema_com_os_dados_e(String arg1, String arg2) throws Throwable {
		// Abrindo Navegador
		Utils.abrirNavegador();
		Utils.espera();
		// Informando Usuário e Senha
		PageFactory.initElements(driver, PageObjectLogin.class);
		Utils.espera();
		switch (arg1) {
		case "bruno.alexandre":
			PageObjectLogin.USUARIO.sendKeys("bruno.alexandre");
			break;
		}

		switch (arg2) {
		case "bruno@alexandre":
			PageObjectLogin.SENHA.sendKeys("bruno@lexandre");
			break;
		}

		PageObjectLogin.LOGIN.click();
		Utils.espera();

		return;

	}

	@Then("^o login e efetuado\\.$")
	public void o_login_e_efetuado() throws Throwable {
		// Efetuando login selecionando o botão logar
		PageFactory.initElements(driver, PageObjectLogin.class);
		String textoElement = PageObjectLogin.MENSAGEM.getText();
		assertEquals("bruno.alexandre", textoElement);
		Utils.espera();
		Utils.fecharNavegador();
	}

}
