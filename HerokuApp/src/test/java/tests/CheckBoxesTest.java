package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.CheckboxesPage;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void firstCheckboxIsUncheckedTest() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();

        //Add check
        Assert.assertFalse(checkboxesPage.isFirstCheckboxChecked(), "First checkbox is checked!");
    }

    @Test
    public void checkFirstCheckboxTest() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickFirstCheckbox();

        //Add check
        Assert.assertTrue(checkboxesPage.isFirstCheckboxChecked(), "First checkbox is not checked!");
    }

    @Test
    public void secondCheckboxIsCheckedTest() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();

        //Add check
        Assert.assertTrue(checkboxesPage.isSecondCheckboxChecked(), "Second checkbox is not checked!");
    }

    @Test
    public void uncheckSecondCheckboxTest() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondCheckbox();

        //Add check
        Assert.assertFalse(checkboxesPage.isSecondCheckboxChecked(), "Second checkbox is checked!");
    }

}
