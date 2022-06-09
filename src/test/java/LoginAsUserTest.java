import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class LoginAsUserTest extends Common {
    final String URL = "https://mcstaging-online.kitco.com/us_en/";
    final String USER = "2testqakitco@kitco.dev";
    final String PASSWORD = "100100";
    final String CUSTOMER_NAME = "Tim Quinn";

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks login of user and redirection to home page")
    public void loginAsUser() {
        openUrl(URL);
        new HeaderLogic()
                .enterMailAndPass(USER, PASSWORD)
                .clickLoginBtnTestUser()
                .clickOnIvanov()
                .checkCustomerName(CUSTOMER_NAME);
    }

    @AfterTest
    public void after(){
        closeWebDriver();
    }
}
