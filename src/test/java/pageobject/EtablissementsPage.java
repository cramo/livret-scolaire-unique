package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtablissementsPage {

	private WebDriver driver;

	private final String selectLesPlatanesXPath = "// *[@id=\"selecteur-etablissement\"]/div/ul/li[1]/a/span";
	@FindBy(xpath = selectLesPlatanesXPath)
	private WebElement selectLesPlatanes;

	private final String buttonValidateXPath = "//button[@id='btn-valider-etablissement']";
	@FindBy(xpath = buttonValidateXPath)
	private WebElement buttonValidate;

	public String getSelectLesPlatanesXPath() {
		return selectLesPlatanesXPath;
	}

	public WebElement getSelectLesPlatanes() {
		return selectLesPlatanes;
	}

	public String getButtonValiderXPath() {
		return buttonValidateXPath;
	}

	public WebElement getButtonValider() {
		return buttonValidate;
	}

	public String getselectLesPlatanesXPath() {
		return selectLesPlatanesXPath;
	}

	public WebElement getselectLesPlatanes() {
		return selectLesPlatanes;
	}

	public EtablissementsPage(WebDriver driver) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(By.xpath(buttonValidateXPath)),
				ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonValidateXPath))));
	}

}
