package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.DropDownPage;

public class DropDownTest extends BaseTest {

    @Test
    public void checkOptionsAmount() {

        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();

        //Add check
        Assert.assertTrue(dropDownPage.getOptionsAmount().equals("3"), "Options amount doesn't equals 3!");
    }

    @Test
    public void checkFirstOptionIsSelected() {

        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();

        Select selectOption = new Select(dropDownPage.returnDropDown());
        selectOption.selectByValue("1");

        //Add check
        Assert.assertTrue(selectOption.getFirstSelectedOption().getAttribute("value").equals("1"), "1st option is not selected!");
    }

    @Test
    public void checkSecondOptionIsSelected() {

        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();

        Select selectOption = new Select(dropDownPage.returnDropDown());
        selectOption.selectByValue("2");

        //Add check
        Assert.assertTrue(selectOption.getFirstSelectedOption().getAttribute("value").equals("2"), "2nd option is not selected!");
    }
}
