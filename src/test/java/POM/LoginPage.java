package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePOM {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button")
    private WebElement acceptCookies;

    private String expectedUrlOnLoginPage = "https://test.mersys.io/";
    private String usernameForAdmin = "i.muratov";
    private String passwordForAdmin = "QWEasd@1901";
    private String expectedUrlAfterLogin = "https://test.mersys.io/user-courses";

    public void validateUserOnLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrlOnLoginPage);
    }

    public void userEnterAdminCredentials() {
        acceptCookies.click();
        usernameInput.sendKeys(usernameForAdmin);
        passwordInput.sendKeys(passwordForAdmin);
        loginButton.click();
    }

    public void validateUserSuccessfullyLoggedIn() {
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        Assert.assertTrue(welcomeMessage.isDisplayed());
        Assert.assertTrue(welcomeMessage.getText().contains("Welcome"));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrlAfterLogin);
    }

}
