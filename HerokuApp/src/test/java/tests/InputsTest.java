package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.InputsPage;

public class InputsTest extends BaseTest {

    @Test
    public void initialValueTest() {

        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickInputField();

        //Add check
        Assert.assertEquals(inputsPage.checkInitialValue(), "", "Initial value is not empty !");
    }

    @Test
    public void inputValueViaArrowUpTest() {

        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickInputField();
        inputsPage.clickArrowUp();

        //Add check
        Assert.assertEquals(inputsPage.checkPositiveValue(), "1", "Entered value is not 1!");
    }

    @Test
    public void inputValueViaArrowUpAndDownTest() {

        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickInputField();
        inputsPage.clickArrowUp();
        inputsPage.clickArrowDown();

        //Add check
        Assert.assertEquals(inputsPage.checkNullValue(), "0", "Entered value is not 0!");
    }

    @Test
    public void inputValueViaArrowDownTest() {

        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickInputField();
        inputsPage.clickArrowDown();

        //Add check
        Assert.assertEquals(inputsPage.checkNegativeValue(), "-1", "Entered value is not -1!");
    }

}
