package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemovePage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[contains(text(), 'Delete')][1]")
    private WebElement removeElementButton;

    @FindBy(id = "elements")
    private WebElement elementsAmount;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
        driver.get(Urls.ADD_REMOVE_PAGE);
    }

    public void clickAddElementButton() {
        addElementButton.click();
    }

    public void clickRemoveElementButton() {
        removeElementButton.click();
    }

    public String checkElementsAmount() {
        return String.valueOf(elementsAmount.getAttribute("childElementCount"));

    }

}
