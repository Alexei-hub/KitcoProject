import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class ProductPageLogic extends ProductPageElements {


    @Step("Scrolling to Qty Block on product page")
    public ProductPageLogic scrollToQtyBlock() {
        qtyBlock.scrollTo();
        return this;
    }

    @Step("Clicking Add to cart in Qty block")
    public ProductPageLogic clickAddToCart() {
        addToCartBtn.click();
        return this;
    }

    @Step("Clicking on cart popup")
    public ProductPageLogic clickOnCart() {
        elementForFail.shouldBe(Condition.visible);
        return this;
    }
}
