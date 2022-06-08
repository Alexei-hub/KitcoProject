import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoggedMainPageElements {

    SelenideElement customerName = $(By.xpath("//span[@x-text='customerName']"));
    SelenideElement logoutBtn = $(By.xpath("//*[contains(text(), 'Logout')]"));
}
