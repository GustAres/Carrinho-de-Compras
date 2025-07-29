# Simulação de um Carrinho de Compras

Projeto final da disciplina de Programação Orientada a Objetos (POO), utilizando os conceitos de:

- Classe Abstrata
- Interface
- Polimorfismo
- Tratamento de Exceções
- Exceções Personalizadas

## 📁 Estrutura do Projeto

- `Produto.java`: Classe abstrata base para produtos.
- `ProdutoFisico.java` e `ProdutoDigital.java`: Subclasses concretas de Produto.
- `Descontavel.java`: Interface que define comportamento de desconto.
- `Carrinho.java`: Classe principal que gerencia os produtos e calcula o total.
- `SaldoInsuficienteException.java`: Exceção personalizada para falta de saldo.
- `ProdutoInexistenteException.java`: Exceção para produtos não encontrados.
- `Main.java`: Classe que simula o uso do sistema.

## ▶️ Como Executar

1. Compile todos os arquivos:
```bash
javac *.java
```

2. Execute a classe `InterfaceCarrinho`:
```bash
java InterfaceCarrinho
```

## 💡 Simulação

O sistema adiciona produtos físicos e digitais ao carrinho, aplica um desconto e tenta finalizar a compra com um saldo inferior ao total, ativando o tratamento da exceção personalizada `SaldoInsuficienteException`.

## 🧠 Aprendizados

Este projeto demonstra como aplicar abstração, interfaces e exceções para criar um sistema modular, seguro e reutilizável.

Desenvolvido por Gustavo Procopio - Julho/2025.
