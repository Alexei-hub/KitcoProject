import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class LoginLogic extends LoginElements {

    @Step("Clicking on Ivanov in Login popup")
    public LoggedMainPageLogic clickOnIvanov() {
        ivanov.click();
        return page(LoggedMainPageLogic.class);
    }

    @Step("Clicking on No More Suits in Login popup")
    public LoggedMainPageLogic clickOnNoMoreSuits() {
        noMoreSuits.click();
        return page(LoggedMainPageLogic.class);
    }

}
