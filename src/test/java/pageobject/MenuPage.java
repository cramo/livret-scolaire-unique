package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;

	/**************************************
	 ******** Bouton déconnexion***********
	 *************************************/
	private final String buttonDeconnectionXPath = "//button[@title='Se déconnecter']";
	@FindBy(xpath = buttonDeconnectionXPath)
	protected WebElement buttonDeconnection;
	
	/**************************************
	 **** Bouton changer établissement*****
	 *************************************/

	private final String buttonChangeEtablissementXPath = "//button[@id='lien-changer-etablissement']";
	@FindBy(xpath = buttonChangeEtablissementXPath)
	private WebElement buttonChangeEtablissement;
	
	/**************************************
	 * ******* Menu principal *************
	 *************************************/
	////////////////////////////////////////
	//////////// Menu BILANS /////////////
	////////////////////////////////////////
	private final String menuBilanXPath = "//span[@class='hidden-xs ng-binding'][contains(text(),'Bilans')]";
	@FindBy(xpath = menuBilanXPath)
	private WebElement menuBilan;	
	/**
	 * sousmenu de CALENDRIER
	 */
	//----- Vue de la compagnie -----
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[1]/descendant::div[@class='submenu z-menu-popup']/ul/li[1]/descendant::a")
	private WebElement sousmenuVueDeLaCompagnie;
	//----- Projets -----
	//body//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[1]/descendant::div[@class='submenu z-menu-popup']/ul/li[2]/descendant::a
	@FindBy(xpath="//a[@href='/libreplan/planner/index.zul;orders_list']")
	private WebElement sousmenuProjets;
	
	////////////////////////////////////////
	//////// Menu ATTESTATIONS /////////////
	////////////////////////////////////////
	private final String menuAttestationsXPath = "//span[@class='hidden-xs ng-binding'][contains(text(),'Attestations')]";
	@FindBy(xpath= menuAttestationsXPath)
	private WebElement menuAttestations;	
	/**
	 * sousmenu de RESSOURCES
	 */
	//-----Participants-----
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[2]/descendant::div[@class='submenu z-menu-popup']/ul/li[1]/descendant::a")
	private WebElement sousmenuParticipants;
	//-----Calendriers------
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[2]/descendant::div[@class='submenu z-menu-popup']/ul/li[4]/descendant::a")
	private WebElement sousmenuCalendriers;
	//-----Critères-----
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[2]/descendant::div[@class='submenu z-menu-popup']/ul/li[6]/descendant::a")
	private WebElement sousmenuCriteres;
	//-----Types d'avancement-----
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[2]/descendant::div[@class='submenu z-menu-popup']/ul/li[7]/descendant::a")
	private WebElement sousmenuTypesDAvancement;
	
	
	////////////////////////////////////////
	////////////// Menu OUILS /////////////
	////////////////////////////////////////
	private final String menuOutilsXPath = "//span[@class='hidden-xs ng-binding'][contains(text(),'Outils')]";
	@FindBy(xpath = menuOutilsXPath)
	private WebElement menuOutils;	

	
	////////////////////////////////////////
	//////// Menu PARAMETRAGE ///////////
	////////////////////////////////////////
	private final String menuParametrageXPath = "//span[@class='hidden-xs ng-binding'][contains(text(),'Paramétrage')]";
	@FindBy(xpath = menuParametrageXPath)
	private WebElement menuParametrage;
	
	/**
	 * sousmenu de CONFIGURATION
	 */
	//-----Profils-----
	@FindBy(xpath="//div[@class='mainmenu z-menubar-hor']/table/tbody/tr/td[4]/descendant::div[@class='submenu z-menu-popup']/ul/li[3]/descendant::a")
	private WebElement sousmenuProfils;
	
	// Constructeur
	public MenuPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.actions = new Actions(driver);		
		this.wait = new WebDriverWait(driver, 10);
	}

	/**
	 * Méthode permettant d'attendre 10s que le WebElement s'affiche
	 * @param webElement
	 */
	public void waitAction(WebElement webElement) {
		this.wait.until(ExpectedConditions.visibilityOf(webElement)); 
	}
	
	/**
	 * Redirections Pages
	 */ 	
	/*public ParticipantsPage goToParticipantsPage() {
		Actions actions = new Actions(driver);
		actions.moveToElement(ongletRessources)
				.moveToElement(sousmenuParticipants)
				.click()
				.build()
				.perform();
		return PageFactory.initElements(driver, ParticipantsPage.class);
	}*/
	
}
