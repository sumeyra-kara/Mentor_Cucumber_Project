package com.euroTech.step_definitions;

import com.euroTech.pages.BasePage;
import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepdefs {
    BasePage basePage =new DashboardPage();

    DashboardPage dashboardPage = new DashboardPage();
    @And("The user should be able to see {string} on the dashboard")
    public void theUserShouldBeAbleToSeeOnTheDashboard(String name) {
       String actualUsername=dashboardPage.userName.getText();
        Assert.assertEquals("Bth username should be same",name,actualUsername);

    }


    @Then("The username should have {int} characters")
    public void the_username_should_have_characters(int numberOfChar) {
       String actualUsername  =dashboardPage.userName.getText();
       int actual = actualUsername.length();
       Assert.assertEquals(numberOfChar,actual);
    }


    @When("The user navigates to tab {string} and module {string}")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
        basePage.menu(tab,module);
    }
}
