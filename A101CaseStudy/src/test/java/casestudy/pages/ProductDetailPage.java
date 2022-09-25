package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    Helper helper = new Helper();
    public ProductDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "button.add-to-basket")
    public WebElement addBasketButton;


    public void addToBasket(){
        addBasketButton.click();
    }

    public void goToBasket() {
        helper.clickWithLinkText("Sepeti Görüntüle");
    }
}