package StepDefinitions;

import POM.DialogContentElements;
import POM.ToolbarElements;
import io.cucumber.java.en.And;

public class CitizenshipsSteps {

    ToolbarElements toolbarElements;
    DialogContentElements dialogContentElements;

    @And("User create citizenship with {string} name and {string} shortname")
    public void user_create_citizenship_with_name_and_shortname(String name, String shortName) {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToCitizenshipsPage();
        dialogContentElements.addCitizenship(name, shortName);
    }


    @And("User edit the {string} citizenship to {string}")
    public void user_edit_the_citizenship_to(String oldCitizenshipName, String newCitizenshipName) throws InterruptedException {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToCitizenshipsPage();
        dialogContentElements.editCitizenship(oldCitizenshipName, newCitizenshipName);
    }


    @And("User delete {string} citizenship")
    public void user_delete_citizenship(String citizenshipNameToDelete) throws InterruptedException {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToCitizenshipsPage();
        dialogContentElements.deleteCitizenship(citizenshipNameToDelete);
    }


}
