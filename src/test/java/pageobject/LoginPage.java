package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriverWait wait;

	@FindBy(how = How.ID, using="user")
	private WebElement inputUserName;

	@FindBy(how = How.ID, using="password")
	private WebElement inputPassword;

	@FindBy(how = How.ID, using="button")
	private WebElement buttonLogin;

	public LoginPage(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 5);
	}

	/**
	 * Méthode permettant de remplir les champs username et password
	 * 
	 * @param txtUsername
	 * @param txtPassword
	 */
	public void connection(String userName, String password) {
		wait.until(ExpectedConditions.and(
				ExpectedConditions.elementToBeClickable(By.id("button")),
				ExpectedConditions.visibilityOfElementLocated(By.id("button"))));
		if(this.inputUserName.isDisplayed() == false || this.inputPassword.isDisplayed() == false)
		{
			this.inputUserName.sendKeys(userName);
			this.inputPassword.sendKeys(password);
		} else {
			this.inputUserName.clear();
			this.inputPassword.clear();
			this.inputUserName.sendKeys(userName);
			this.inputPassword.sendKeys(password);
		}
		this.buttonLogin.click();
		//return  PageFactory.initElements(driver, HomePage.class);
	}
}
