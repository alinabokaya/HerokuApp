package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{

    @FindBy(xpath = "//input[@type='number']")
    private WebElement inputField;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS_PAGE);
    }

    public void clickInputField() {
        inputField.click();
    }

    public void clickArrowUp() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void clickArrowDown() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String checkInitialValue() {
        return String.valueOf(inputField.getAttribute("value"));

    }

    public String checkPositiveValue() {
        return String.valueOf(inputField.getAttribute("value"));

    }

    public String checkNullValue() {
        return String.valueOf(inputField.getAttribute("value"));

    }

    public String checkNegativeValue() {
        return String.valueOf(inputField.getAttribute("value"));

    }

}
