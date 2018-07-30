package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccesLSUPage {
	private final String buttonAccesLSUXPath = "//span[contains(text(),'Accès au Livret Scolaire Unique')]";
	@FindBy(xpath = buttonAccesLSUXPath)
	private WebElement buttonAccesLSU;

	public String getButtonAccesLSUXPath() {
		return buttonAccesLSUXPath;
	}

	public WebElement getButtonAccesLSU() {
		return buttonAccesLSU;
	}

	public AccesLSUPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(By.xpath(buttonAccesLSUXPath)),
				ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonAccesLSUXPath))));
	}

}
