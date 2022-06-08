import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginElements {

    SelenideElement ivanov = $(By.xpath("//*[contains(text(), 'Paul Test Ivanov')]"));
    SelenideElement noMoreSuits  = $(By.xpath("//*[contains(text(), 'No More Suits LLC')]"));

}
