package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductsPage;

public class ComprarItens {
     // Atributos
    final WebDriver driver;
    private HomePage homePage;
    private ProductsPage productsPage;
    private CheckoutPage checkoutPage;


    @Dado("que entrei no site {string}")
    public void que_entrei_no_site(String url) {
        homePage = new HomePage(driver);
        homePage.acessarPagina(url);
        assertEquals("Swag Labs", homePage.lerNomeDaGuia());

    
}
    @E("fiz login com o usuario {string}")
    public void fiz_login_com_o_usuario(String string) {
    
}
    @E("a senha {string}")
    public void a_senha(String string) {
    
}
    @Quando("adicionei o \"sauce-labs-bike-light no carrinho")
    public void adicionei_o_sauce_labs_bike_light_no_carrinho() {
        
}
    @Entao("o carrinho mostra o {string}${double}\" de cada item")
    public void o_carrinho_mostra_o_$_de_cada_item(String string, Double double1) {
    
}
    
}
