package com.euroTech.step_definitions;

import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.ConfigReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigReader.get("url"));
    }
    @When("The user enters valid credentials for Selim")
    public void the_user_enters_valid_credentials_for_selim() {
        loginPage.login();

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.krafttechexlab.com/index");
    }
    @When("The user enters valid credentials for Rosa")
    public void the_user_enters_valid_credentials_for_rosa() {
        System.out.println("Rosa bilgilerini girdi");
    }

    @When("The user enters valid credentials for Mike")
    public void theUserEntersValidCredentialsForMike() {
        System.out.println("Mike bilgilerini girdi");
    }


    @When("The user enters valid credentials email: {string} and password: {string}")
    public void the_user_enters_valid_credentials_email_and_password(String email,String password) {
      loginPage.login(email,password);
    }



}
