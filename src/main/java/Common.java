import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;


public class Common {

    @Step("Open url {url}")
    public void openUrl(String url) {
        open(url);
    }

    public static void setUpBrowser() {
        Configuration.browserSize = "1680x1050";
        Configuration.browserPosition = "0x0";

    }

    public static String mailGen() {
        int random = (int) (Math.random() * (200 + 1)) - 100;
        return "kitko_Test_" + random + "@test.com";
    }
}
