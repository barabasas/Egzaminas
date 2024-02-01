import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountPage;
import pages.CreateNewAccPage;
import pages.MainPage;
import utils.Utils;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserLoginNegativeTest extends BaseTest {
    MainPage mainPage;
    CreateNewAccPage CreateNewAccPage;
    AccountPage accountPage;

    @Test
    void userLogin() {
        mainPage = new MainPage(driver);
        accountPage = new AccountPage(driver);

        mainPage.enterUserName(Utils.generateRandomName());
        mainPage.enterPassword("unbreakablePassword3000");
        mainPage.pressLoginButton();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(d -> mainPage.errorMessage.isDisplayed());


        assertTrue(mainPage.errorMessage.isDisplayed(), "Registration unsuccessful");

    }
}