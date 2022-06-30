package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolbarElements extends BasePOM{

    public ToolbarElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='ng-star-inserted']//button")
    private WebElement moreOptionsButton;

    @FindBy(xpath = "//span[text()='Setup']/..")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']/..")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Countries']/..")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']/..")
    private WebElement citizenshipButton;

    @FindBy(xpath = "//span[text()='Fees']/..")
    private WebElement feesButton;

    public void navigateToCountriesPage() {
        moreOptionsButton.click();
        setupButton.click();
        parametersButton.click();
        countriesButton.click();
    }

    public void navigateToCitizenshipsPage() {
        moreOptionsButton.click();
        setupButton.click();
        parametersButton.click();
        citizenshipButton.click();
    }

    public void navigateToFeesPage() {
        moreOptionsButton.click();
        setupButton.click();
        parametersButton.click();
        waitUntilElementVisibleAndClickableThenClick(feesButton);
    }

}
