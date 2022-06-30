package StepDefinitions;

import POM.DialogContentElements;
import POM.ToolbarElements;
import io.cucumber.java.en.Then;

public class FeesSteps {

    ToolbarElements toolbarElements;
    DialogContentElements dialogContentElements;

    @Then("User create Fee {string} and {string} and {string} and {string}")
    public void user_create_fee_and_and_and(String name, String code, String intCode, String priority) {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToFeesPage();
        dialogContentElements.createFee(name, code, intCode, priority);
    }


    @Then("User edit Fee {string} and change it to {string}")
    public void user_edit_fee_and_change_it_to(String existingFeeName, String newFeeName) throws InterruptedException {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToFeesPage();
        dialogContentElements.editFee(existingFeeName, newFeeName);
    }


    @Then("User delete Fee {string}")
    public void user_delete_fee(String feeNameToDelete) throws InterruptedException {
       toolbarElements = new ToolbarElements();
       dialogContentElements = new DialogContentElements();
       toolbarElements.navigateToFeesPage();
       dialogContentElements.deleteFee(feeNameToDelete);
    }


}
