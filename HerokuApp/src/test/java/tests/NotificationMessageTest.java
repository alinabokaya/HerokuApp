package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.NotificationMessagePage;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void checkNotificationMessageTest() {

        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickClickHereLink();

        //Add check
        Assert.assertTrue(notificationMessagePage.isNotificationMessageSuccessful(), "Message doesn't match!");

    }
}
