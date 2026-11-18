# Sistema de Reserva Aérea

## Explicação do Projeto

O projeto é uma aplicação em Java para gerenciar reservas de passagens aéreas de forma centralizada. Ele integra subsistemas de disponibilidade de voos, criação de assentos, cálculo de taxas, processamento de pagamentos e envio de e-mails.

## Justificativa do Padrão Escolhido e Análise Comparativa

### Padrão Escolhido: Facade (Fachada)

O **Facade** foi o padrão escolhido para a arquitetura principal porque oculta a complexidade dos diversos subsistemas do sistema de reservas por trás de uma única interface unificada (`ReservaFacade`). Em vez de o código cliente (`Principal`) interagir diretamente com regras de pagamento, validação de voos, cálculos de taxas e serviços de e-mail, ele realiza uma única chamada simples. O Facade atua como um ponto de entrada simplificado, promovendo o fraco acoplamento entre a camada de apresentação/cliente e a lógica interna do sistema.

### Outros Padrões Que Poderiam Ser Utilizados

Além dos padrões que já complementam a estrutura atual (como Factory Method para assentos e Strategy para taxas), outros padrões de projeto poderiam ter sido aplicados no lugar do Facade ou na arquitetura geral:

* **Mediator:** Poderia substituir a forma como os serviços internos se comunicam. Enquanto o Facade é unidirecional (o cliente chama a fachada, que repassa aos subsistemas), o Mediator centralizaria a comunicação bidirecional entre os próprios serviços (como `PagamentoService`, `DisponibilidadeService` e `EmailService`), fazendo com que eles não se conhecessem diretamente. No entanto, para a necessidade do projeto de oferecer uma interface simples ao cliente final, o Facade se mostra mais direto e apropriado.
* **Chain of Responsibility:** Poderia ser utilizado no fluxo de processamento de reservas. Em vez de o Facade encadear as chamadas sequencialmente, o pedido de reserva passaria por uma corrente de manipuladores (ex: `VerificadorDisponibilidadeHandler` -> `ProcessadorPagamentoHandler` -> `NotificadorEmailHandler`). Cada elo da corrente processaria sua parte e decidiria se passaria a requisição adiante ou se a interromperia em caso de erro.
* **Command:** As operações de reserva, cancelamento ou alteração de voo poderiam ser encapsuladas como objetos de comando (ex: `EfetuarReservaCommand`). Isso permitiria parametrizar o cliente com diferentes operações, enfileirar solicitações de reserva, registrar histórico de transações e suporte a operações de desfazer (undo/rollback em caso de falha no pagamento).
* **Adapter:** Se o sistema precisasse se integrar a gateways de pagamento externos ou APIs de companhias aéreas terceiras com interfaces incompatíveis com o projeto, o padrão Adapter seria indicado para traduzir essas chamadas para a interface padrão do sistema.

## Princípios SOLID Aplicados

* **Responsabilidade Única (SRP):** Cada classe possui uma única responsabilidade bem definida, como separar o cálculo de taxas (`TaxaEmbarqueStrategy`), o envio de e-mails (`EmailService`) e a criação de assentos (`AssentoFactory`).
* **Aberto/Fechado (OCP):** O sistema permite estender comportamentos sem modificar o código existente, como a adição de novas estratégias de taxas ou novos tipos de serviços simulados através de interfaces.
* **Substituição de Liskov (LSP):** As implementações concretas dos serviços (como `PagamentoServiceSimulado`) podem substituir suas respectivas interfaces (`PagamentoService`) sem quebrar o funcionamento do sistema.
* **Segregação de Interfaces (ISP):** As interfaces são compactas e específicas para cada domínio de serviço, garantindo que as classes implementem apenas o que é necessário.
* **Inversão de Dependência (DIP):** O sistema depende de abstrações (interfaces como `DisponibilidadeService` e `PagamentoService`) em vez de acoplamento direto com implementações concretas.

## Raiz de Estrutura do Projeto

```text
Reserva_Aerea_Facade/
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── assento/
            │   ├── Assento.java
            │   ├── AssentoFactory.java
            │   └── TipoAssento.java
            ├── excecoes/
            │   ├── PagamentoRecusadoException.java
            │   ├── ReservaException.java
            │   └── VooIndisponivelException.java
            ├── facade/
            │   └── ReservaFacade.java
            ├── reserva/
            │   └── Principal.java
            ├── servicos/
            │   ├── DisponibilidadeService.java
            │   ├── EmailService.java
            │   ├── PagamentoService.java
            │   └── implementacao/
            │       ├── DisponibilidadeServiceSimulado.java
            │       ├── EmailServiceSimulado.java
            │       └── PagamentoServiceSimulado.java
            └── taxa/
                ├── TaxaEmbarqueStrategy.java
                ├── TaxaFixaStrategy.java
                └── TaxaPercentualStrategy.java
```

## Como Executar

No terminal, na raiz do projeto, execute:
`mvn clean compile`

Em seguida, execute a classe `Principal.java` para rodar a simulação.