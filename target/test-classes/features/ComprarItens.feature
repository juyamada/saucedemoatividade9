#language: pt

    Funcionalidade: Comprar itens com sucesso

        Esquema do Cenario: Colocar itens no carrinho e validar

            Dado que entrei no site "saucedemo.com"
            E fiz login com o usuario <username>
            E a senha <password>
            E cliquei no botao de login
            Quando adicionei o <produto> no carrinho
            Entao o carrinho mostra o <produto> e o <valor> de cada item

            Exemplos:
            |username         | password       | produto                   | valor   |
            |"standard_user"  | "secret_sauce" | "sauce-labs-backpack"     | "$29.99"|
            |"standard_user" | "secret_sauce"  | "sauce-labs-bolt-t-shirt" | "$15.99"|
            |"standard_user"  | "secret_sauce" | "sauce-labs-onesie"       | "$7.99" |
            |"standard_user"  | "secret_sauce" | "sauce-labs-bike-light"   | "$9.99" |
           