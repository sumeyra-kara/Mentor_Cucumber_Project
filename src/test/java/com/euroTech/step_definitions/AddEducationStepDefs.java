package com.euroTech.step_definitions;

import com.euroTech.pages.AddEducationPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AddEducationStepDefs {
    AddEducationPage addEducationPage = new AddEducationPage();
    @Then("The user verifies that the tab is displayed")
    public void the_user_verifies_that_the_tab_is_displayed() {
        BrowserUtils.waitForVisibility(addEducationPage.schollBootcamp,10);
        Assert.assertTrue(addEducationPage.schollBootcamp.isDisplayed());
    }

    @Then("The user should be able to see form labels as follows")
    public void the_user_should_be_able_to_see_form_labels_as_follows(List<String> expectedLabels) {
        List<String> actualLabels = BrowserUtils.getElementsText(addEducationPage.formLabels);
        Assert.assertEquals(expectedLabels,actualLabels);
    }
}
