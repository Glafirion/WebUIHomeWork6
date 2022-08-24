package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstCardBook extends BasePage{
    public FirstCardBook(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='header__main__basket__block']")
    private WebElement basketButton;

    public void clickBasketButton() {
        basketButton.click();
     //   return new BuyingButton(driver);

   // @FindBy(xpath = "//div[@class='line line-0']//div[1]//div[1]//div[1]//a[1]//img[1]")
  //  private WebElement firstCardBook;

  //  public BuyingButton clickFirstCardBook() {
   //     firstCardBook.click();
    //    return new BuyingButton(driver);
    }

}
