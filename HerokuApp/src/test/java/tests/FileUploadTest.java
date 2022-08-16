package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactorypages.FileUploadPage;

import java.io.File;

public class FileUploadTest extends BaseTest {

    private File FILE_PATH = new File("/Users/alinabo/Git/HerokuApp/HerokuApp/src/test/resources/cat.jpeg");

    @Test
    public void checkFileUpload() {

        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();
        fileUploadPage.uploadFile(FILE_PATH);
        fileUploadPage.clickUploadButton();

        //Add check
        Assert.assertEquals(FILE_PATH.getName(), fileUploadPage.getUploadedFileName(), "File name doesn't match!");

    }
}
