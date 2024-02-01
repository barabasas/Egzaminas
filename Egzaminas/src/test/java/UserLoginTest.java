import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountPage;
import pages.MainPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserLoginTest extends BaseTest {
    MainPage mainPage;
    AccountPage accountPage;

    @Test
    void userLogin() {
        mainPage = new MainPage(driver);
        accountPage = new AccountPage(driver);

        mainPage.enterUserName("TestLoginUser");
        mainPage.enterPassword("unbreakablePassword3000");
        // negaliu paspausti login mygtuko...
        mainPage.pressLoginButton();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(d -> accountPage.logoutFormVisible.isDisplayed());


        assertTrue(accountPage.logoutFormVisible.isDisplayed(), "Registration unsuccessful");

    }
}