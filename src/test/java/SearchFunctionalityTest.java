import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SearchFunctionalityTest extends Common {

    @BeforeTest
    public void setUp() {
        setUpBrowser();
    }


    final String URL = "https://mcstaging-online.kitco.com/us_en/";
    final String PRODUCT = "Q3000";

    @Test
    @Owner(value = "Daniel")
    @Description(value = "Test checks searching functionality")
    public void searchFunctionality() {
        openUrl(URL);
        new HeaderLogic()
                .inputInSearchField(PRODUCT)
                .checkProductFounded(PRODUCT);
    }
}
