package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement alertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement confirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement promptButton;

    @FindBy(xpath = "//p[@id='result']")
    private WebElement resultMessage;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(Urls.ALERTS_PAGE);
    }

    public void clickAlertButton() {
        alertButton.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public void clickPromptButton() {
        promptButton.click();
    }

    public String getResultMessage() {
        return resultMessage.getText();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }


}
