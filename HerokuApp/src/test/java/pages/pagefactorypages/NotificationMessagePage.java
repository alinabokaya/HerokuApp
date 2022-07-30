package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagePage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'Click here')]")
    private WebElement clickHereLink;

    @FindBy(xpath = "//div[@class='flash notice']")
    private WebElement notificationMessage;

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_MESSAGE_PAGE);
    }

    public void clickClickHereLink() {
        clickHereLink.click();
    }

    public boolean isNotificationMessageSuccessful() {
        return notificationMessage.getText().contains("Action successful");
    }
}
