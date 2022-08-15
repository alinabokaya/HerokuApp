package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggableElement;

    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement targetElement;

    @FindBy(css = "div[class*=droppable]>p")
    private WebElement resultMessage;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Urls.DRAG_AND_DROP_PAGE);
    }

    public WebElement getDraggableElement() {
        driver.switchTo().frame(0).switchTo();
        return draggableElement;
    }

    public WebElement getTargetElement() {
        return targetElement;
    }

    public String getResultMessage() {
        return resultMessage.getText();
    }




}
