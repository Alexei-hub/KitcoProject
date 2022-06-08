import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UserCreatingTest extends Common {
    final String URL = "https://mcstaging-online.kitco.com/us_en/";

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks creating of new user")
    public void userCreating() {
        openUrl(URL);
        new HeaderLogic()
                .clickCreateAccountBtn()
                .clickPersonalAccount()
                .enterMailAndPassword(Common.mailGen())
                .confirmMail();
    }
}
