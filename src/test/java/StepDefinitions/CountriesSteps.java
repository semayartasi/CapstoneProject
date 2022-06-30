package StepDefinitions;

import POM.DialogContentElements;
import POM.ToolbarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    ToolbarElements toolbarElements;
    DialogContentElements dialogContentElements;

    @And("User create Country")
    public void user_create_country() {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToCountriesPage();
        dialogContentElements.createCountry();
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements = new DialogContentElements();
        dialogContentElements.validateSuccessMessage();
    }

    @And("User edit Country")
    public void user_edit_country() throws InterruptedException {
       toolbarElements = new ToolbarElements();
       dialogContentElements = new DialogContentElements();
       toolbarElements.navigateToCountriesPage();
       dialogContentElements.editCountry();
    }

    @And("User delete Country")
    public void user_delete_country() throws InterruptedException {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToCountriesPage();
        dialogContentElements.deleteCountry();
    }

}
