package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class MainPage extends BasePage {

    @FindBy(linkText = "Sukurti naują paskyrą")
    private WebElement linkCreateAnAccount;

    @FindBy(name = "username")
    private WebElement fieldUsername;

    @FindBy(name = "password")
    private WebElement fieldPassword;

    @FindBy(css = "button[type='Submit']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//span[contains(text(),'Įvestas prisijungimo')]")
    public WebElement errorMessage;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkCreateAnAccount() {
        linkCreateAnAccount.click();
    }
    public void enterUserName(String username) {
        fieldUsername.sendKeys(username);
    }
    public void enterPassword(String password) {
        fieldPassword.sendKeys(password);
    }
    public void pressLoginButton() {
        buttonLogin.click();
    }



}