package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    @FindBy(css = "#logoutForm")
    public WebElement logoutFormVisible;

    @FindBy(id = "username.errors")
    public WebElement shortUserName;

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
