package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest{

    @Test
    public void initialValueTest() {

        driver.get(Urls.INPUTS_PAGE);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.click();

        //Add check
        String initialValue = inputField.getAttribute("value");
        Assert.assertEquals(initialValue, "", "Initial value is not empty !");
    }

    @Test
    public void inputValueViaArrowUpTest() {

        driver.get(Urls.INPUTS_PAGE);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.click();
        inputField.sendKeys(Keys.ARROW_UP);

        //Add check
        String positiveValue = inputField.getAttribute("value");
        Assert.assertEquals(positiveValue, "1", "Entered value is not 1!");
    }

    @Test
    public void inputValueViaArrowUpAndDownTest() {

        driver.get(Urls.INPUTS_PAGE);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.click();
        inputField.sendKeys(Keys.ARROW_UP);
        inputField.sendKeys(Keys.ARROW_DOWN);

        //Add check
        String nullValue = inputField.getAttribute("value");
        Assert.assertEquals(nullValue, "0", "Entered value is not 0!");
    }

    @Test
    public void inputValueViaArrowDownTest() {

        driver.get(Urls.INPUTS_PAGE);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.click();
        inputField.sendKeys(Keys.ARROW_DOWN);

        //Add check
        String negative = inputField.getAttribute("value");
        Assert.assertEquals(negative, "-1", "Entered value is not -1!");
    }

}
