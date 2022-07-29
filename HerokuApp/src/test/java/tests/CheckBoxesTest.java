package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void firstCheckboxIsUncheckedTest() {

        driver.get(Urls.CHECKBOXES_PAGE);
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));

        //Add check
        boolean isFirstCheckboxChecked = firstCheckbox.isSelected();
        Assert.assertFalse(isFirstCheckboxChecked, "First checkbox is checked!");
    }

    @Test
    public void checkFirstCheckboxTest() {

        driver.get(Urls.CHECKBOXES_PAGE);
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));
        firstCheckbox.click();

        //Add check
        boolean isFirstCheckboxChecked = firstCheckbox.isSelected();
        Assert.assertTrue(isFirstCheckboxChecked, "First checkbox is not checked!");
    }

    @Test
    public void secondCheckboxIsCheckedTest() {

        driver.get(Urls.CHECKBOXES_PAGE);
        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));

        //Add check
        boolean isSecondCheckboxChecked = secondCheckbox.isSelected();
        Assert.assertTrue(isSecondCheckboxChecked, "Second checkbox is not checked!");
    }

    @Test
    public void uncheckSecondCheckboxTest() {

        driver.get(Urls.CHECKBOXES_PAGE);
        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));
        secondCheckbox.click();

        //Add check
        boolean isSecondCheckboxChecked = secondCheckbox.isSelected();
        Assert.assertFalse(isSecondCheckboxChecked, "Second checkbox is checked!");
    }

}
