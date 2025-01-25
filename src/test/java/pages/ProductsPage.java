package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends CommonPage{
    
    // construtor
    public ProductsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // mapeamento dos elementos
    @FindBy (css = "a[data-test='shopping_cart_link']")
    WebElement itemCarrinho;
    
    // ação dos elementos
    public void addProdutoCarrinho(String productName){
        String cssSelector = String.format("button[id='add-to-cart-%s']", productName); 
        driver.findElement(By.cssSelector(cssSelector)).click();

    }
}

