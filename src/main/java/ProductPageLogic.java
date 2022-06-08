import io.qameta.allure.Step;

public class ProductPageLogic extends ProductPageElements {


    @Step("Scrolling to Qty Block on product page")
    public ProductPageLogic scrollToQtyBlock(){
        qtyBlock.scrollTo();
        return this;
    }

    @Step("Clicking Add to cart in Qty block")
    public ProductPageLogic clickAddToCart(){
        addToCartBtn.click();
        return this;
    }

}