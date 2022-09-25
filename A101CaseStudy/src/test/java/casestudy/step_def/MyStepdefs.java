package casestudy.step_def;

import casestudy.pages.BasketPage;
import casestudy.pages.CategoryPage;
import casestudy.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import casestudy.pages.HomePage;

public class MyStepdefs {
    HomePage homepage = new HomePage();
    CategoryPage categorypage = new CategoryPage();
    ProductDetailPage productdetailpage = new ProductDetailPage();
    BasketPage basketpage = new BasketPage();
    @Given("homepage is open")
    public void homepageIsOpen() {
    }

    @And("close pop-up")
    public void closePopUp() {
        homepage.closePopUp();
    }

    @Then("Go to Dizaltı Çorap category page")
    public void goToCategoryPage() {
        homepage.goToCategoryPage();
    }

    @And("Filter product color with Siyah")
    public void filterProductColorWith() {
        categorypage.filterCategory();
    }

    @And("Go to any product detail page")
    public void goToAnyProductDetailPage() {
        categorypage.goToProductDetailPage();

    }

    @And("Add product to basket")
    public void addProductToBasket() {
        productdetailpage.addToBasket();
    }

    @And("Go to basket page")
    public void goToBasketPage() {
        productdetailpage.goToBasket();
    }

    @When("Go to payment page")
    public void goToPaymentPage() {
        basketpage.goToPaymentPage();

    }

    @Then("Verfiy payment page")
    public void verfiyPaymentPage() {
    }


}
