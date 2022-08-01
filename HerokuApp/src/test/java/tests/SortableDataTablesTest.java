package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.SortableDataPage;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void sortableDataTable1Test() {

        SortableDataPage sortableDataPage = new SortableDataPage(driver);
        sortableDataPage.openDataTablesPage();

        //Add check for email
        Assert.assertTrue(sortableDataPage.isEmailFBachMatched(), "Email doesn't match!");

        //Add check for last name
        Assert.assertTrue(sortableDataPage.isLastNameFBachMatched(), "Last name Bach doesn't match!");

        //Add check for first name
        Assert.assertTrue(sortableDataPage.isFirstNameFBachMatched(), "First name Bach doesn't match!");

    }

    @Test
    public void sortableDataTable2Test() {

        SortableDataPage sortableDataPage = new SortableDataPage(driver);
        sortableDataPage.openDataTablesPage();

        //Add check for due
        Assert.assertTrue(sortableDataPage.isDueMatched(), "Due doesn't match!");

        //Add check for website
        Assert.assertTrue(sortableDataPage.isWebsiteMatched(), "Website doesn't match!");

    }

}
