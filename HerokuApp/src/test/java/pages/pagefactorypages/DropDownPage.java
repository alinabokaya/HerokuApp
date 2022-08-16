package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropDown;

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropDownPage() {
        driver.get(Urls.DROPDOWN_PAGE);
    }

    public String getOptionsAmount() {
        return dropDown.getAttribute("length");
    }

    public WebElement returnDropDown() {
        return dropDown;
    }

}
