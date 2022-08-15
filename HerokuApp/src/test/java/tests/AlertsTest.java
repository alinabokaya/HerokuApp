package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void checkAlertTest() {

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickAlertButton();
        String alertText = alertsPage.getAlertText();
        alertsPage.acceptAlert();

        //Add check
        Assert.assertEquals(alertText, "I am a JS Alert", "Text doesn't match!");

    }

    @Test
    public void checkConfirmTest() {

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickConfirmButton();
        String confirmText = alertsPage.getAlertText();
        alertsPage.dismissAlert();

        //Add check
        Assert.assertEquals(confirmText, "I am a JS Confirm", "Text doesn't match!");

    }

    @Test
    public void checkPromptTest() {

        String testText = "Test message";

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickPromptButton();
        alertsPage.sendTextToAlert(testText);
        alertsPage.acceptAlert();

        //Add check
        Assert.assertTrue(alertsPage.getResultMessage().contains(testText), "Test message is not displayed!");

    }

}
