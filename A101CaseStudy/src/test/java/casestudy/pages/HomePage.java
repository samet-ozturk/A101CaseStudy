package casestudy.pages;

import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;

public class HomePage {
    Helper helper = new Helper();
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css=".desktop-menu .js-navigation-item:nth-child(4)")
    public WebElement categoryButton;

    @FindBy(css="button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement closePopupButton;
    public void goToCategoryPage() {
        categoryButton.click();
        helper.clickWithLinkText("Kadın İç Giyim");
        helper.clickWithLinkText("Dizaltı Çorap");

    }

    public void closePopUp() {
        closePopupButton.click();
    }
}