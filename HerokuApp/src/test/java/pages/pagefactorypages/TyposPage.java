package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TyposPage extends BasePage {

    @FindBy(xpath = "//div[@class='example']//p[2]")
    private WebElement lastSentence;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Urls.TYPOS_PAGE);
    }

    public boolean isLastSentenceContainsCorrectWord() {
        return lastSentence.getText().contains("won't");
    }


}
