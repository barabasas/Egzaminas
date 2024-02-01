package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccPage extends BasePage {
    @FindBy(css = "#username")
    private WebElement fieldFirstName;
    @FindBy(css = "#password")
    private WebElement fieldPassword;
    @FindBy(css = "#passwordConfirm")
    private WebElement fieldPasswordConfirmation;
    @FindBy(css = "button[type='Submit']")
    private WebElement buttonCreateAnAccount;

    public CreateNewAccPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        fieldFirstName.sendKeys(firstName);
    }


    public void enterPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void enterPasswordConfirmation(String passwordConfirmation) {
        fieldPasswordConfirmation.sendKeys(passwordConfirmation);
    }

    public void pressCreateAnAccountButton() {
        buttonCreateAnAccount.click();
    }

}
