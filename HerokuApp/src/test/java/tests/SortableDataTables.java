package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables extends BaseTest {

    @Test
    public void sortableDataTable1Test() {

        driver.get(Urls.DATA_TABLES_PAGE);

        WebElement emailFBach = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']"));
        WebElement lastNameFBach = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]"));
        WebElement firstNameFBach = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]"));


        //Add check for email
        boolean isEmailFBachMatched = emailFBach.isDisplayed();
        Assert.assertTrue(isEmailFBachMatched, "Email doesn't match!");

        //Add check for last name
        boolean isLastNameFBachMatched = lastNameFBach.isDisplayed();
        Assert.assertTrue(isLastNameFBachMatched, "Last name Bach doesn't match!");

        //Add check for first name
        boolean isFirstNameFBachMatched = firstNameFBach.isDisplayed();
        Assert.assertTrue(isFirstNameFBachMatched, "First name Bach doesn't match!");

    }

    @Test
    public void sortableDataTable2Test() {

        driver.get(Urls.DATA_TABLES_PAGE);

        String due = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'$')]")).getText();
        String website = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'www')]")).getText();


        //Add check for due
        boolean isDueMatched = due.contains("$51.00");
        Assert.assertTrue(isDueMatched, "Due doesn't match!");

        //Add check for website
        boolean isWebsiteMatched = website.contains("http://www.frank.com");
        Assert.assertTrue(isWebsiteMatched, "Website doesn't match!");

    }

}
