package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageobjects.PageObjectLogin;
import pageobjects.PageObjectReport;
import utils.Utils;

public class ReportIssueSteps extends Utils {

	@And("^inicio o fluxo de registro de uma nova issue\\.$")
	public void inicio_o_fluxo_de_registro_de_uma_nova_issue() throws Throwable {
		// Selecionando o Menu para criação de uma nova Issue
		PageFactory.initElements(driver, PageObjectReport.class);
		PageObjectReport.REPORTISSUE.click();

	}

	@And("^seleciono o projeto desejado\\.$")
	public void seleciono_o_projeto_desejado() throws Throwable {
		PageFactory.initElements(driver, PageObjectReport.class);
		// Selecionando Projeto
		WebElement comboboxElement = PageObjectReport.PROJETO;
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("Desafio jMeter Project 2");
		// Confirmando a seleção clicando no botão selecionar
		PageObjectReport.BOTAOSELECIONAR.click();

	}

	@Then("^informo os campo desejados e envio o relatorio\\.$")
	public void informo_os_campo_desejados_e_envio_o_relat_rio() throws Throwable {
		// Selecionando a Categoria.
		Utils.espera();
		PageFactory.initElements(driver, PageObjectReport.class);
		WebElement comboboxElement1 = PageObjectReport.CATEGORIA;
		Select combobox1 = new Select(comboboxElement1);
		combobox1.selectByValue("71");

		// Selecionando a Reprodutibilidade
		Utils.espera();
		PageFactory.initElements(driver, PageObjectReport.class);
		WebElement comboboxElement2 = PageObjectReport.REPRODUTIBILIDADE;
		Select combobox2 = new Select(comboboxElement2);
		combobox2.selectByValue("30");

		// Selecionando a Gravidade
		Utils.espera();
		PageFactory.initElements(driver, PageObjectReport.class);
		WebElement comboboxElement3 = PageObjectReport.GRAVIDADE;
		Select combobox3 = new Select(comboboxElement3);
		combobox3.selectByValue("10");

		// Selecionando a Gravidade
		Utils.espera();
		PageFactory.initElements(driver, PageObjectReport.class);
		WebElement comboboxElement4 = PageObjectReport.PRIORIDADE;
		Select combobox4 = new Select(comboboxElement4);
		combobox4.selectByValue("20");

		// Informando o SUMMARY
		Utils.espera();
		PageObjectReport.SUMMARY.sendKeys("TESTE ATIVIDADE AVALIATIVA");

		// Informando a Descrição
		Utils.espera();
		PageObjectReport.DESCRICAO.sendKeys("TESTES ATIVIDADE AVALIATIVA TAREFA");

		// Selecionando Botão
		Utils.espera();
		PageObjectReport.ENVIARRELATORIO.click();

		// Validando criação da ISSUE.

		String textoElement = PageObjectLogin.MENSAGEM.getText();
		assertEquals("Advanced Filters", textoElement);
		Utils.espera();
		Utils.fecharNavegador();

	}

}
