package com.euroTech.step_definitions;

import com.euroTech.pages.BasePage;
import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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

    @Then("The user verifies success login with {string} using excel:{string}, {string},{int}")
    public void the_user_verifies_success_login_with_using_excel(String username, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        String actual = dashboardPage.userName.getText();
        String expected =excelData.get(row).get(username);
        Assert.assertEquals(expected,actual);
    }
}
