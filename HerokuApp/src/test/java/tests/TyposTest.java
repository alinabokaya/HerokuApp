package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.TyposPage;

public class TyposTest extends BaseTest {

    @Test
    public void checkTyposTest() {

        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();

        //Add Check
        Assert.assertTrue(typosPage.isLastSentenceContainsCorrectWord(), "Sentence contains typo!");

    }
}
