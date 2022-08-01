package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.AddRemovePage;

public class AddRemoveElementsTest extends BaseTest {


    @Test
    public void addingRemovingElementsTest() {

        AddRemovePage addRemovePage = new AddRemovePage(driver);
        addRemovePage.openAddRemovePage();
        addRemovePage.clickAddElementButton();
        addRemovePage.clickAddElementButton();
        addRemovePage.clickRemoveElementButton();

        //Add check
        Assert.assertEquals(addRemovePage.checkElementsAmount(), "1", "Actual amount is not 1!");


    }


}
