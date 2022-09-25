package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
    Helper helper = new Helper();
    public CategoryPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#attributes_integration_colourSİYAH")
    public WebElement blackColor;

    @FindBy(css="ul.product-list-general li.set-product-item:nth-child(1)")
    public WebElement productCard;

    public void filterCategory(){
        helper.waitFor(3);
        blackColor.click();
    }


    public void goToProductDetailPage() {
        helper.waitFor(3);
        productCard.click();

    }
}