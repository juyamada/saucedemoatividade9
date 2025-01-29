package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
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

    // construtor
    public ComprarItens(WebDriver driver){
        this.driver = driver;
    }


    @Dado("que entrei no site {string}")
    public void que_entrei_no_site(String url) {
        
        HomePage homePage = new HomePage(driver);
        homePage.acessarPagina(url);
        assertEquals("Swag Labs", homePage.lerNomeDaGuia());
}
    @E("fiz login com o usuario {string}")
    public void fiz_login_com_o_usuario(String username) {
        homePage.preencherUsername(username);

}
    @E("a senha {string}")
    public void a_senha(String password) {
        homePage.preencherSenha(password);
}
    @E("cliquei no botao de login")
        public void cliquei_no_botao_de_login() {
            homePage.clicarBotaoLogin();
        }

    @Quando("adicionei o {string} no carrinho")
        public void adicionei_o_no_carrinho(String produto) {
            productsPage.addProdutoCarrinho(produto);
        
}
    @Entao("o carrinho mostra o {string} e o {string} de cada item")
    public void o_carrinho_mostra_o_e_o_de_cada_item(String produto, String valor) {
        
        productsPage.clicarCarrinho();
        CheckoutPage checkoutPage = new CheckoutPage(driver); // instancia a checkoutpage

        assertEquals("Your Cart", checkoutPage.getCartTitle());
        assertEquals(produto, checkoutPage.getProductName());
        assertEquals(valor, checkoutPage.getProductPrice());
}
    
}
