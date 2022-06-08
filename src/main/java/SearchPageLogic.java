import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class SearchPageLogic extends SearchPageElements {

    @Step("Checks displaying of searching product {searchValue} on serach page")
    public SearchPageLogic checkProductFounded(String searchValue) {
        firstElement.shouldHave(Condition.text(searchValue));
        return this;
    }
}
