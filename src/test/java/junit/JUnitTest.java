package junit;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.AccesLSUPage;
import pageobject.EtablissementsPage;
import pageobject.LoginPage;

public class JUnitTest {
	private WebDriver driver;

	@Before
	public void beforeTest() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
		driver = new ChromeDriver();
		/*
		 * System.setProperty("webdriver.gecko.driver", "C:\\dev\\geckodriver.exe");
		 * driver = new FirefoxDriver();
		 */
		driver.get("https://portail.ac-amiens.fr/alogin/ct_logon_mixte.jsp");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.connection("", "");
	}

	@Test
	public void firstTest() {
		driver.get("https://portail.ac-amiens.fr");
		System.out.println("hahihi");
		AccesLSUPage access = PageFactory.initElements(driver, AccesLSUPage.class);
		access.getButtonAccesLSU().click();
		EtablissementsPage etab = PageFactory.initElements(driver, EtablissementsPage.class);
		//etab.getselectLesPlatanes().click();
		etab.getButtonValider().click();
	}

	@After
	public void afterTest() {
		// this.driver.quit();
	}
}
