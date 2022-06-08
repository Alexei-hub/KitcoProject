import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElements {

    SelenideElement createAccountBtn = $(By.xpath("//div[contains(@class, 'layout-header__actions')]//button[contains(text(), 'Log in')]/following-sibling::a"));
    SelenideElement emailInput = $(By.id("uname"));
    SelenideElement passwordInput = $(By.id("pword"));
    SelenideElement loginBtn = $(By.xpath("//div[contains(@class, 'layout-header__action')]//button[contains(text(), 'Log in')]"));
    SelenideElement inputSearch = $(By.name("q"));

}
