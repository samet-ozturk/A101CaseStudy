package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    Helper helper = new Helper();
    public BasketPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="a.checkout-button")
    public WebElement checkoutButton;
    @FindBy(css=".js-proceed-to-checkout-btn")
    public WebElement withoutRegisterButton;
    @FindBy(css="input[name=\"user_email\"]")
    public WebElement emailInput;
    @FindBy(css=".js-proceed-to-checkout-form button")
    public WebElement continueButton;
    @FindBy(css="div.addresses > div.list > ul:nth-child(3) > li > a")
    public WebElement newAdressButton;
    @FindBy(css="input[name=\"title\"]")
    public WebElement adressTitle;
    @FindBy(css="input[name=\"first_name\"]")
    public WebElement adressFirstName;
    @FindBy(css="input[name=\"last_name\"]")
    public WebElement adressLastName;
    @FindBy(css="input[name=\"phone_number\"]")
    public WebElement adressPhoneNumber;
    @FindBy(css="select[name=\"city\"]")
    public WebElement adressCitySelectBox;
    @FindBy(css="select[name=\"city\"] option:nth-child(2)")
    public WebElement adressCity;
    @FindBy(css="select[name=\"township\"")
    public WebElement adressTownshipSelectBox;
    @FindBy(css="select[name=\"township\"] option:nth-child(2)")
    public WebElement adressTownship;
    @FindBy(css=".js-district")
    public WebElement adressDistrictSelectBox;
    @FindBy(css=".js-district option:nth-child(3)")
    public WebElement adressDistrict;
    @FindBy(css=".js-address-textarea")
    public WebElement adressText;

    @FindBy(css=".js-address-form .js-set-country")
    public WebElement adressSubmitButton;

    @FindBy(css=".continue button[type=\"submit\"]")
    public WebElement continueSubmitButton;


    public void goToPaymentPage() {
        checkoutButton.click();
        withoutRegisterButton.click();
        emailInput.click();
        emailInput.sendKeys("test@test.com");
        continueButton.click();


        newAdressButton.click();

        adressTitle.click();
        adressTitle.sendKeys("Adresim");

        adressFirstName.click();
        adressFirstName.sendKeys("Ali Veli");

        adressLastName.click();
        adressLastName.sendKeys("Kırkdokuz Elli");

        adressPhoneNumber.click();
        adressPhoneNumber.sendKeys("5534231245");

        adressCitySelectBox.click();
        adressCity.click();

        adressTownshipSelectBox.click();
        adressTownship.click();

        adressDistrictSelectBox.click();
        adressDistrict.click();

        helper.waitFor(2);

        adressText.click();
        adressText.sendKeys("Benim adresim cad. No:5");

        adressSubmitButton.click();

        continueButton.click();

        helper.waitFor(4);





    }
}