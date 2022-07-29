package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {

    @Test
    public void checkTyposTest() {

        driver.get(Urls.TYPOS_PAGE);

        //Add Check
        String lastSentence = driver.findElement(By.xpath("//div[@class='example']//p[2]")).getText();
        boolean isLastSentenceContainsCorrectWord = lastSentence.contains("won't");
        Assert.assertTrue(isLastSentenceContainsCorrectWord, "Sentence contains typo!");

    }
}
