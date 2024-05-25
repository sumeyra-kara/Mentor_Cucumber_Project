package com.euroTech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login sayfasi acildi");
    }
    @When("The user enters valid credentials for Selim")
    public void the_user_enters_valid_credentials_for_selim() {
        System.out.println("Selim bilgilerini girdi");
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Basarili sekilde siteye giris yapildi");
    }
    @When("The user enters valid credentials for Rosa")
    public void the_user_enters_valid_credentials_for_rosa() {
        System.out.println("Rosa bilgilerini girdi");
    }

    @When("The user enters valid credentials for Mike")
    public void theUserEntersValidCredentialsForMike() {
        System.out.println("Mike bilgilerini girdi");
    }
}
