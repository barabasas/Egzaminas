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

public class CreateUserForLoginTest extends BaseTest {
    MainPage mainPage;
    CreateNewAccPage CreateNewAccPage;
    AccountPage accountPage;

    @Test
    void createAnAccount() {
        mainPage = new MainPage(driver);
        CreateNewAccPage = new CreateNewAccPage(driver);
        accountPage = new AccountPage(driver);

        mainPage.clickLinkCreateAnAccount();
        CreateNewAccPage.enterFirstName("TestLoginUser");
        CreateNewAccPage.enterPassword("unbreakablePassword3000");
        CreateNewAccPage.enterPasswordConfirmation("unbreakablePassword3000");
        CreateNewAccPage.pressCreateAnAccountButton();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(d -> accountPage.logoutFormVisible.isDisplayed());


        assertTrue(accountPage.logoutFormVisible.isDisplayed(), "Registration unsuccessful");

    }
}
