import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountElements {

    SelenideElement personalAccount = $(By.xpath("//div[@class='item']/a[1]"));

    SelenideElement mailInput = $(By.id("ue"));
    SelenideElement passwordInput = $(By.xpath("//input[@id='up']/following::input[1]"));
    SelenideElement continueBtn = $(By.xpath("//button[contains(text(), 'Continue')]"));

    SelenideElement acceptBtn = $(By.xpath("//button[contains(text(),'Accept')]"));

}
