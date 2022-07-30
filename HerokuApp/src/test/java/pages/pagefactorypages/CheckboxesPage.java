package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{

    @FindBy(xpath = "//input[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//input[2]")
    private WebElement secondCheckbox;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(Urls.CHECKBOXES_PAGE);
    }

    public void clickFirstCheckbox(){
        firstCheckbox.click();
    }

    public void clickSecondCheckbox(){
        secondCheckbox.click();
    }

    public boolean isFirstCheckboxChecked() {
        return firstCheckbox.isSelected();
    }

    public boolean isSecondCheckboxChecked() {
        return secondCheckbox.isSelected();
    }

}
