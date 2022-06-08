import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LogoutTest extends Common {

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }


    final String URL = "https://mcstaging-online.kitco.com/us_en/";
    final String USER = "autotest_kitco@mailinator.com";
    final String PASSWORD = "autotest2022";

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks successfully logged out from system")
    public void logOut() {
        openUrl(URL);
        new HeaderLogic()
                .enterMailAndPass(USER, PASSWORD)
                .clickLoginBtnRealUser()
                .moveMouseToName()
                .clickLogOut()
                .visibilityCreateAccountBtn();
    }
}
