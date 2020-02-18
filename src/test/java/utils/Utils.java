package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bruno.alexandre\\eclipse-workspace\\base2\\src\\test\\resources\\chomedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mantis-prova.base2.com.br/login_page.php");
		driver.manage().window().maximize();
	}

	public static void espera() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	public static void fecharNavegador() {
		driver.quit();
	}

	protected static WebDriver getDriver() {
		return driver;
	}

}