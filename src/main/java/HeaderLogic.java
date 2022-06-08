import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class HeaderLogic extends HeaderElements {

    @Step("Checking of visibility of Create Account button in header")
    public HeaderLogic visibilityCreateAccountBtn() {
        createAccountBtn.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    @Step("Clicking Create Account button in header")
    public CreateAccountLogic clickCreateAccountBtn() {
        createAccountBtn.click();
        return page(CreateAccountLogic.class);
    }

    @Step("Entering Email Address {mail} and password {pass} in header")
    public HeaderLogic enterMailAndPass(String mail, String pass) {
        emailInput.sendKeys(mail);
        passwordInput.sendKeys(pass);
        return this;
    }

    @Step("Clicking Login button in header")
    public LoginLogic clickLoginBtnTestUser() {
        loginBtn.click();
        return page(LoginLogic.class);
    }

    @Step("Clicking Login button in header")
    public LoggedMainPageLogic clickLoginBtnRealUser() {
        loginBtn.click();
        return page(LoggedMainPageLogic.class);
    }

    @Step("Inputting Value {searchValue} in search field in header")
    public SearchPageLogic inputInSearchField(String searchValue) {
        inputSearch.val(searchValue).pressEnter();
        return page(SearchPageLogic.class);
    }


}
