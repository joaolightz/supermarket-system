# 🛒 Sistema de Supermercado

Sistema de gerenciamento de supermercado desenvolvido em **Java**, com foco na aplicação prática de Programação Orientada a Objetos (POO), modelagem de regras de negócio e boas práticas de desenvolvimento.

O projeto busca simular a estrutura administrativa de um supermercado, incluindo hierarquia de funcionários, autenticação, controle de permissões e gerenciamento de recursos.

## 📌 Sobre o projeto

O Sistema de Supermercado é um projeto pessoal desenvolvido para aprofundar conhecimentos em Java por meio da construção de uma aplicação com regras de negócio inspiradas em situações reais.

A aplicação utiliza conceitos de orientação a objetos para representar funcionários, cargos, permissões e operações administrativas.

O desenvolvimento acontece de forma incremental, priorizando encapsulamento, separação de responsabilidades, organização de pacotes e baixo acoplamento.

## ✨ Funcionalidades implementadas

### 👥 Gerenciamento de funcionários

- Contratação de gerentes pelo supermercado.
- Contratação de supervisores, operadores de caixa e repositores.
- Modelagem de cargos utilizando herança.
- Estrutura hierárquica entre funcionários.
- Definição de salários e metas.
- Controle de permissões para operações administrativas.
- Validação de dados na criação de funcionários.

### 🔐 Autenticação e controle de permissões

- Autenticação de gerentes e supervisores por senha.
- Controle do estado de autenticação.
- Revogação da autenticação em situações de falha.
- Restrição de operações administrativas a funcionários autenticados.
- Exceções personalizadas para situações de autenticação.

### 📦 Produtos

- Estrutura inicial para representação de produtos.
- Armazenamento de informações como nome, preço e quantidade.
- Classificação da disponibilidade do produto conforme a quantidade em estoque.

*O gerenciamento completo de produtos e estoque ainda está em desenvolvimento.*

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem principal.
- **Git** — controle de versão.
- **GitHub** — hospedagem do código-fonte.
- **IntelliJ IDEA** — ambiente de desenvolvimento.

## 📚 Conceitos aplicados

- Programação Orientada a Objetos (POO).
- Classes, objetos e construtores.
- Encapsulamento.
- Herança e polimorfismo.
- Interfaces e classes abstratas.
- Modificadores de acesso e visibilidade.
- Tratamento de exceções personalizadas.
- Validação de argumentos.
- Separação de responsabilidades.
- Organização de pacotes.
- Controle de versão com Git.

## 🗂️ Estrutura do projeto

```text
supermarket-system/
│
├── src/
│   ├── Main.java
│   │
│   └── com/
│       └── joaolightz/
│           └── supermarket/
│               │
│               ├── model/
│               │   ├── Funcionario.java
│               │   ├── FuncionarioManager.java
│               │   ├── Gerente.java
│               │   ├── Supervisor.java
│               │   ├── OperadorDeCaixa.java
│               │   ├── Repositor.java
│               │   ├── Produto.java
│               │   └── SuperMercado.java
│               │
│               ├── interfaces/
│               │   └── GerenciaFuncionarios.java
│               │
│               └── exceptions/
│                   ├── NaoAutenticadoException.java
│                   └── SenhaIncorretaException.java
│
├── .gitignore
└── README.md
```

## 🚀 Como executar o projeto

### Pré-requisitos

- JDK instalado.
- Uma IDE compatível com Java, como IntelliJ IDEA (opcional).

### Instalação

1. Clone o repositório:

```bash
git clone https://github.com/joaolightz/supermarket-system.git
```

2. Abra o projeto na sua IDE.
3. Configure o JDK utilizado.
4. Execute a classe `Main.java`.

## 🗺️ Próximos passos

- [x] Estrutura inicial do projeto.
- [x] Implementação da autenticação de gerentes.
- [x] Implementação da autenticação de supervisores.
- [x] Estrutura inicial da hierarquia de funcionários.
- [x] Implementação da interface de gerenciamento de funcionários.
- [x] Criação de exceções personalizadas.
- [x] Separação de interfaces e exceções em pacotes próprios.
- [ ] Corrigir e refatorar a lógica de gerenciamento de funcionários.
- [ ] Aprimorar as regras de negócio relacionadas a salários e metas.
- [ ] Desenvolver o gerenciamento completo de produtos.
- [ ] Implementar operações de estoque.
- [ ] Aprimorar as validações de entrada e o tratamento de exceções.
- [ ] Implementar testes automatizados.
- [ ] Implementar persistência de dados.

## 👨‍💻 Autor

**João Guilherme**

GitHub: [@joaolightz](https://github.com/joaolightz)

---

Este projeto faz parte da minha jornada de aprendizado em Java, buscando transformar conceitos teóricos em soluções práticas e desenvolver habilidades de engenharia de software.