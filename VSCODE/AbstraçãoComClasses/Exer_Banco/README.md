# 🏦 Sistema Bancário em Java (Console App)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)

> Projeto desenvolvido para consolidar os fundamentos de Orientação a Objetos e Lógica de Negócios complexa durante o Bootcamp Back-End Java (Accenture/DIO).

## 💻 Sobre o Projeto

Este é um sistema de gerenciamento bancário simulado via console. O objetivo principal foi ir além do básico (CRUD) e implementar **regras de negócio financeiras reais**, como cálculo de cheque especial baseado no depósito inicial, amortização automática de dívidas e validações de segurança para transações.

O projeto foca em **backend puro**, sem interfaces gráficas, priorizando a estrutura de dados, o encapsulamento e a eficiência dos algoritmos.

## ⚙️ Funcionalidades

- **Gerenciamento de Contas:** Criação de contas vinculadas a clientes com validação de CPF.
- **Cheque Especial Inteligente:**
  - Depósitos <= R$ 500,00 geram R$ 50,00 de limite.
  - Depósitos > R$ 500,00 geram limite de 50% do valor depositado.
- **Transações Financeiras:**
  - **Depósito:** Identifica automaticamente se a conta está negativa e utiliza o valor para quitar o cheque especial (com juros simulados) antes de adicionar ao saldo.
  - **Saque:** Permite uso do saldo + limite, atualizando o status de endividamento.
  - **Transferências:** Movimentação entre contas do mesmo banco.
  - **Pagamento de Boletos:** Simulação de pagamentos externos.
- **Relatórios:**
  - Listagem de todas as contas usando `Java Streams`.
  - Relatório geral de capital do banco.

## 🛠️ Tecnologias e Conceitos Aplicados

- **Java 17+**
- **POO (Programação Orientada a Objetos):**
  - **Encapsulamento:** Atributos protegidos (`private`) com acesso controlado via métodos.
  - **Associação:** Relacionamento entre classes (`Banco` tem `Contas`, `Conta` tem `Cliente`).
- **Java Collections API:** Uso de `ArrayList` e `Streams` para manipulação de dados.
- **Lógica Condicional:** Uso de `Switch Expressions` para menus limpos e `if/else` aninhados para regras de negócio.

## 📂 Estrutura do Projeto

```bash
src/
├── App.java          # Ponto de entrada (Menu e Interação com Usuário)
├── Banco.java        # Gerenciamento da lista de contas e regras institucionais
├── Account.java      # Lógica financeira (Depósito, Saque, Cheque Especial)
└── Cliente.java      # Modelo de dados do correntista