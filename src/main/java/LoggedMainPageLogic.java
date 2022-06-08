import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class LoggedMainPageLogic extends LoggedMainPageElements {

    @Step("Checking redirection to home page and that logged customer name is {name}")
    public LoggedMainPageLogic checkCustomerName(String name) {
        customerName.shouldHave(Condition.text(name), Duration.ofSeconds(10));
        //TODO release checking redirect to home page
        return this;
    }

    @Step("Hovering mouse on user name in header")
    public LoggedMainPageLogic moveMouseToName() {
        customerName.hover();
        return this;
    }

    @Step("Clicking Logout button in profile popup")
    public HeaderLogic clickLogOut() {
        logoutBtn.click();
        return page(HeaderLogic.class);
    }


}
