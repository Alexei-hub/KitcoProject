import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BuyFunctionalityTest extends Common {

    final String URL = "https://mcstaging-online.kitco.com/us_en/";
    final String PRODUCT_URL = "https://mcstaging-online.kitco.com/us_en/1-kg-gold-royal-canadian-mint-bar-1";
    final String USER = "autotest_kitco@mailinator.com";
    final String PASSWORD = "autotest2022";

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks buy functionality")
    public void searchFunctionality() {
        openUrl(URL);
        new HeaderLogic()
                .enterMailAndPass(USER, PASSWORD)
                .clickLoginBtnRealUser();
        openUrl(PRODUCT_URL);
        new ProductPageLogic()
                .scrollToQtyBlock()
                .clickAddToCart()
                .clickOnCart();
    }
}
