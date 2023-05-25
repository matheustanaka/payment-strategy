# Sistema de Processamento de Pagamento

Este é um sistema de processamento de pagamento simples que utiliza o padrão de projeto Strategy. Ele permite que o usuário pague através de diferentes métodos de pagamento, como Paypal, Cartão de Crédito e Pix.

## Requisitos

- Java JDK 19.

## Inicializando o projeto 

```shell
// Clonando o repositório
git clone https://github.com/matheustanaka/payment-strategy

// Entrando no diretório
cd payment-strategy

// Compilando o projeto
javac -d . ./src/strategy/*java ./src/*.java

// Executando o projeto
java Main
```

# Descrição do Projeto

O projeto é composto por várias classes e uma interface:

- IPaymentStrategy: Esta é a interface principal que define a operação que todas as estratégias de pagamento devem implementar. 
- PaypalStrategy, CreditCardStrategy e PixStrategy: Estas são as estratégias concretas que implementam a interface PaymentStrategy.
- ShoppingCart: Esta é a classe contexto que usa a interface PaymentStrategy. Ela é configurada com uma estratégia de pagamento concreta em tempo de execução. 
- Main: Esta é a classe principal que inicia a aplicação.

# Contato

- [Linkedin](https://www.linkedin.com/in/matheus-tanaka-42a833186/)
- [Twitter](https://twitter.com/matheus__tanaka)
- [Email](matheustanakanog@gmail.com)