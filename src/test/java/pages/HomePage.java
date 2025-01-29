package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{
    // construtor
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // mapear elementos
    @FindBy (id = "user-name")
    WebElement campoUsername;
    
    @FindBy (id = "password")
    WebElement campoPassword;

    @FindBy (id = "login-button")
    WebElement botaoLogin;

    @FindBy (css = ".app_logo")
    WebElement logo;

    // ações dos elementos

    public void acessarPagina (String url) {
        driver.get(url);
    }

    public void preencherUsername (String username){
        campoUsername.sendKeys(username);
    }

    public void preencherSenha (String password){
        campoPassword.sendKeys(password);
    }

    public void clicarBotaoLogin(){
        botaoLogin.click();
    }

    public String lerNomeDaGuia(){
        return logo.getText();
    }
    
    
}
