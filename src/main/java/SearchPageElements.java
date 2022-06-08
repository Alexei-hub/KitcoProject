import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageElements {

    SelenideElement firstElement = $(By.xpath("//a[contains(@class, 'md:leading-snug')]"));
}
