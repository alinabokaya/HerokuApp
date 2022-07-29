package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void checkNotificationMessageTest() {

        driver.get(Urls.NOTIFICATION_MESSAGE_PAGE);
        driver.findElement(By.xpath("//a[contains(text(), 'Click here')]")).click();

        //Add check
        String notificationMessage = driver.findElement(By.xpath("//div[@class='flash notice']")).getText();
        boolean isNotificationMessageSuccessful = notificationMessage.contains("Action successful");
        Assert.assertTrue(isNotificationMessageSuccessful, "Message doesn't match!");

    }
}
