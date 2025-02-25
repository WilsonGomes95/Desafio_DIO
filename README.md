# Projeto: Simulação de Conta Bancária

Este é um projeto simples em Java que simula uma conta bancária, permitindo operações como consulta de saldo, depósito, saque, pagamento de boletos e uso do cheque especial.

## 🛠 Tecnologias Utilizadas
- **Java** (Versão 8+)
- **Eclipse IDE** (ou qualquer outra IDE de sua preferência)

## 📌 Funcionalidades
- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Verificar se a conta está usando o cheque especial

## 🚀 Como Executar o Projeto
### 1️⃣ Clone o repositório
```sh
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```
### 2️⃣ Acesse a pasta do projeto
```sh
cd nome-do-repositorio
```
### 3️⃣ Compile o código
Se estiver utilizando o terminal:
```sh
javac -d bin src/Application/Main.java
```
### 4️⃣ Execute o programa
```sh
java -cp bin Application.Main
```

Ou, se estiver usando uma IDE como Eclipse, basta rodar a classe `Main.java`.

## 📂 Estrutura do Projeto
```
|-- src/
|   |-- Application/
|   |   |-- Main.java
|   |-- Entities/
|   |   |-- Conta.java
|-- bin/ (gerado após compilação)
|-- .gitignore
|-- README.md
```

## 📖 Exemplo de Uso
Ao rodar o programa, você verá um menu como este:
```
====== MENU DO BANCO ======
1 - Consultar Saldo
2 - Consultar Cheque Especial
3 - Depositar Dinheiro
4 - Sacar Dinheiro
5 - Pagar Boleto
6 - Verificar Uso do Cheque Especial
0 - Sair
Escolha uma opção:
```

Digite um número correspondente à operação desejada e siga as instruções no terminal.

## 📝 Autor
Desenvolvido por **Wilson Gomes(https://github.com/WilsonGomes95)**.

Se gostou do projeto, deixe uma ⭐ no repositório!

