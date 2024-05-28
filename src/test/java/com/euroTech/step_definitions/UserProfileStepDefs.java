package com.euroTech.step_definitions;

import com.euroTech.pages.ProfilPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfileStepDefs {

    ProfilPage profilPage = new ProfilPage();

    @Then("The user verifies that the page title {string}")
    public void the_user_verifies_that_the_page_title(String expected) {
        Assert.assertEquals(expected,profilPage.userProfilePageName.getText());

    }

    @When("The user navigates user profiles tabs {string}")
    public void the_user_navigates_user_profiles_tabs(String tab) {
        profilPage.navigateUserProfileTabs(tab);

    }
}
