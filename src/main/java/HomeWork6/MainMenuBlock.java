package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuBlock extends BasePage{


    public MainMenuBlock(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[3]//a[1]//div[1]")
    public WebElement fifteenBookButton;

    public void clickCloseIconButton() {
        fifteenBookButton.click();

    }
}
