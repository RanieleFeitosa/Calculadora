# Calculadora Simples em Java


Este projeto é uma calculadora simples desenvolvida em Java que permite realizar as quatro operações básicas: adição, subtração, multiplicação e divisão. O programa foi estruturado seguindo boas práticas de programação orientada a objetos, com a intenção de demonstrar meus conhecimentos básicos sobre a linguagem.
## ✅ Práticas Adotadas

- **Encapsulamento**: Atributos privados nas classes e métodos públicos para acesso seguro.
- **Tratamento de Exceções**: Uso de `try-catch` e uma exceção personalizada (`DivisaoInvalidaException`).
- **Reutilização de Código**: Métodos específicos para cada operação matemática, garantindo modularidade.
- **Código Limpo**: Nomeação adequada de variáveis e métodos, garantindo legibilidade.
- **Modularização**: Separação de responsabilidades em classes distintas.
- **Boas Práticas de POO**: Uso de encapsulamento, reutilização de código e organização eficiente.
- **Interatividade**: O usuário é guiado pelo terminal, evitando entradas incorretas.

## 📂 Estrutura do Projeto
O código está organizado da seguinte forma:
```
📁 src/
 ├── 📄 Programa.java                   # Classe principal que executa o programa
 ├── 📄 Calculos.java                   # Classe responsável pelas operações matemáticas
 ├── 📄 DivisaoInvalidaException.java   # Classe de exceção personalizada para divisão por zero
```
  
## 📋 Pré-requisitos
Para executar este projeto, você precisa ter instalado em sua máquina:
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Git](https://git-scm.com/) (opcional, caso queira clonar o repositório diretamente)
- Um terminal de sua escolha: **Prompt de Comando (cmd), PowerShell ou Git Bash**
- Uma IDE (opcional) como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/)


## 🚀 Como Executar o Projeto
### Clonar o Repositório
1. Clone o repositório: 
```bash
 git clone https://github.com/RanieleFeitosa/Calculadora.git
```
### Compilar e Executar
2. Acesse o diretório do projeto:
   ```bash
   cd calculadora
   ```
3. Compile o projeto:
   ```bash
   javac Programa.java
   ```
4. Execute a aplicação:
   ```bash
   java Programa
   ```
## 🎯 Como Usar a Calculadora
1. Após iniciar o programa, você será solicitado a inserir um número.
2. Escolha uma operação matemática (+, -, *, /).
3. Insira o segundo número.
4. O resultado da operação será exibido no terminal.
5. Você será perguntado se deseja realizar outro cálculo. Digite "s" para continuar ou "n" para sair.
6. Se tentar dividir por zero, uma mensagem de erro será exibida, e você poderá inserir novos valores.
   
    ![Image](https://github.com/user-attachments/assets/40b6b296-6ab8-4de3-ae49-31377b1d5ba4)

   ### Divisão por zero:

   ![Image](https://github.com/user-attachments/assets/f747b1f5-7ea3-4781-b031-78b707b63801)
