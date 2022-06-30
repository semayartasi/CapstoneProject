package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM{

    public DialogContentElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement nameSearchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitDeleteButton;

    @FindBy(xpath = "//td[text()='2']")
    private WebElement secondDataInList;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;

    public void createCountry() {
        addButton.click();
        nameInput.sendKeys("SemaCountry123");
        codeInput.sendKeys("456789");
        saveButton.click();
    }

    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editCountry() throws InterruptedException {
        nameSearchInput.sendKeys("SemaCountry123");
        waitUntilElementVisibleAndClickableThenClick(searchButton);
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys("UpdatedSemaCountry123");
        saveButton.click();
    }

    public void deleteCountry() throws InterruptedException {
        nameSearchInput.sendKeys("UpdatedSemaCountry123");
        waitUntilElementVisibleAndClickableThenClick(searchButton);
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(deleteButton);
        waitUntilElementVisibleAndClickableThenClick(submitDeleteButton);
    }

    public void addCitizenship(String name, String shortname) {
        addButton.click();
        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortname);
        saveButton.click();
    }

    public void editCitizenship(String oldCitizenshipName, String newCitizenshipName) throws InterruptedException {
        nameSearchInput.sendKeys(oldCitizenshipName);
        searchButton.click();
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys(newCitizenshipName);
        saveButton.click();
    }

    public void deleteCitizenship(String citizenshipToDelete) throws InterruptedException {
        nameSearchInput.sendKeys(citizenshipToDelete);
        searchButton.click();
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(deleteButton);
        waitUntilElementVisibleAndClickableThenClick(submitDeleteButton);
    }

    public void createFee(String name, String code, String intCode, String priority) {
        addButton.click();
        nameInput.sendKeys(name);
        codeInput.sendKeys(code);
        integrationCodeInput.sendKeys(intCode);
        priorityInput.sendKeys(priority);
        saveButton.click();
    }

    public void editFee(String existingFeeName, String newFeeName) throws InterruptedException {
        nameSearchInput.sendKeys(existingFeeName);
        searchButton.click();
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys(newFeeName);
        saveButton.click();
    }

    public void deleteFee(String feeToDelete) throws InterruptedException {
        nameSearchInput.sendKeys(feeToDelete);
        searchButton.click();
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(deleteButton);
        waitUntilElementVisibleAndClickableThenClick(submitDeleteButton);
    }

}
