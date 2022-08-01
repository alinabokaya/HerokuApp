package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortableDataPage extends BasePage {

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']")
    private WebElement emailFBach;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")
    private WebElement lastNameFBach;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")
    private WebElement firstNameFBach;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'$')]")
    private WebElement due;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'www')]")
    private WebElement website;

    public SortableDataPage(WebDriver driver) {
        super(driver);
    }

    public void openDataTablesPage() {
        driver.get(Urls.DATA_TABLES_PAGE);
    }

    public boolean isEmailFBachMatched() {
        return emailFBach.isDisplayed();
    }

    public boolean isLastNameFBachMatched() {
        return lastNameFBach.isDisplayed();
    }

    public boolean isFirstNameFBachMatched() {
        return firstNameFBach.isDisplayed();
    }

    public boolean isDueMatched() {
        return due.getText().contains("$51.00");
    }

    public boolean isWebsiteMatched() {
        return website.getText().contains("http://www.frank.com");
    }


}
