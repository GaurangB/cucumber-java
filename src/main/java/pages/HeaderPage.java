package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends PageObject {


    //By Objects
    By header = By.id("header");
    By womenLink = By.cssSelector("a[title='Women']");
    By dresses = By.cssSelector("ul.sf-menu > li > a[title='Dresses']");
    By tShirts = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By searchTextBox = By.id("search_query_top");
    By searchBtn = By.xpath("//*[@id='searchbox']/button");
    By contactUs = By.xpath("//*[@id='contact-link']/a");
    By signin = By.cssSelector("a[title='Log in to your customer account']");
    By logo = By.className("logo img-responsive");

    //Methods
    public void waitForHeader() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(header));
    }

    public void clickOnOption(String value) {
        switch (value.toLowerCase()) {
            case "dresses":
                $(dresses).click();
                break;
            case "tshirts":
                $(tShirts).click();
                break;
            case "contactus":
                $(contactUs).click();
                break;
            case "signin":
                $(signin).click();
                break;
            case "icon":
                $(logo).click();
                break;
            default:
                System.out.println("Invalid Option Passed");
        }
    }

    public void searchText(String searchText) {
        $(searchTextBox).sendKeys(searchText);
        $(searchBtn).click();
    }
}
