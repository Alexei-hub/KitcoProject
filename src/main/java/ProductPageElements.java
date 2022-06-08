import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPageElements {

    SelenideElement qtyBlock = $(By.xpath("//*[@id='product_addtocart_form']//*[@class='product-price-table']"));
    SelenideElement addToCartBtn = $(By.xpath("//*[@id='product_addtocart_form']//*[contains(text(), 'Add to cart')]"));
}
