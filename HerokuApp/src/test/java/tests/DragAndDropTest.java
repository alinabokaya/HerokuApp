package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.DragAndDropPage;

public class DragAndDropTest extends BaseTest{

    @Test
    public void checkDragAndDropTest() {

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.openDragAndDropPage();
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragAndDropPage.getDraggableElement(), dragAndDropPage.getTargetElement()).build().perform();

        //Add check
        Assert.assertEquals(dragAndDropPage.getResultMessage(), "Dropped!", "Message doesn't match!");


    }
}
