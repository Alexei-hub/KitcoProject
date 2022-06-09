import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class LoginAsCompanyAccountTest extends Common {

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }


    final String URL = "https://mcstaging-online.kitco.com/us_en/";
    final String USER = "2testqakitco@kitco.dev";
    final String PASSWORD = "100100";
    final String CUSTOMER_NAME = "Tim Quinn";

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks login of company user and redirection to home page")
    public void loginAsCompany() {
        openUrl(URL);
        new HeaderLogic()
                .enterMailAndPass(USER, PASSWORD)
                .clickLoginBtnTestUser()
                .clickOnNoMoreSuits()
                .checkCustomerName(CUSTOMER_NAME);
    }

    @AfterTest
    public void after(){
        closeWebDriver();
    }
}
