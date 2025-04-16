# 🧠 Mood Tracker – Java CLI App

> Aplicação simples de linha de comando em Java para monitoramento de humor, usando os princípios de **POO** e o padrão **MVC**.

## 📌 Descrição

O **Mood Tracker** é um projeto desenvolvido com o objetivo de aplicar os conceitos de Programação Orientada a Objetos (POO) e a arquitetura **MVC (Model-View-Controller)**. A aplicação permite que o usuário insira seu nome e selecione seu estado emocional atual entre três opções: **Feliz**, **Triste** ou **Neutro**. Com base na seleção, o sistema exibe um resumo com o nome completo e o humor informado.

---

## 🛠️ Funcionalidades

- Entrada de nome e sobrenome do usuário.
- Escolha do humor (Feliz, Triste, Neutro).
- Exibição do nome completo e descrição do humor selecionado.
- Estrutura orientada a objetos e separada por camadas MVC.

---

## 🧱 Estrutura do Projeto

```
bin/
├── controller/
│   └── PersonController.class
├── model/
│   ├── Mood.class
│   ├── Person.class
│   └── PersonActions.class
├── view/
│   └── PersonView.class
└── Main.class

src/
├── controller/
│   └── PersonController.java
├── model/
│   ├── Mood.java
│   ├── Person.java
│   └── PersonActions.java
├── view/
│   └── PersonView.java
└── Main.java

README.md
```

---

## 💡 Conceitos de POO aplicados

- **Encapsulamento**: As propriedades são acessadas via getters/setters e protegidas por acesso restrito.
- **Herança**: A classe `Person` herda comportamentos abstratos de `PersonActions`.
- **Polimorfismo**: A implementação de `applyActionByCode` permite comportamentos diferentes dependendo do humor.
- **Abstração**: Uso de classes e métodos abstratos para representar ações genéricas em `PersonActions`.

---

## 🚀 Como rodar

### ✅ Requisitos

- Java JDK 11 ou superior instalado.
- Terminal ou prompt de comando.
<!--  -->

### ▶️ Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/efpatti/mood-tracker.git
   cd mood-tracker
   ```

2. Compile os arquivos Java:

   ```bash
   javac -d bin src/**/*.java src/Main.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp bin Main
   ```

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usar e modificar.
