package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {


    @Test
    public void addingRemovingElementsTest() {

        driver.get(Urls.ADD_REMOVE_PAGE);
        WebElement addElement = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addElement.click();
        addElement.click();
        WebElement removeElement = driver.findElement(By.xpath("//button[contains(text(), 'Delete')][1]"));
        removeElement.click();

        //Add check
        String actualElementsAmount = String.valueOf(driver.findElements(By.xpath("//button[@class='added-manually']")).size());
        Assert.assertEquals(actualElementsAmount, "1", "Actual amount is not 1!");


    }


}
