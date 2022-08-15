package pages.pagefactorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class FileUploadPage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement resultMessage;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(Urls.FILE_UPLOAD_PAGE);
    }

    public void uploadFile(File file) {
        chooseFileButton.sendKeys(file.getPath());
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public String getUploadedFileName() {
        return resultMessage.getText();
    }


}
