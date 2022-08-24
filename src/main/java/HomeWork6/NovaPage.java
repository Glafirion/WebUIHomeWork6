package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NovaPage extends BasePage{
    public NovaPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"partial_products_list\"]/div[1]/div/div/div[2]/div[4]/a")
    private WebElement firstCardBook;

    public void clickFirstCardBook() {
        firstCardBook.click();
       // return new FirstCardBook(driver);
    }
}


   // @FindBy(xpath = "//a[@class='sorting-block__link'][contains(text(),'Популярное')]")
    //private WebElement popularButton;

   // public PopularPage clickPopularButton() {
    //    popularButton.click();
     //   return new PopularPage(driver);
   // }


//}
