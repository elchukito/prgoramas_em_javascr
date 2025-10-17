[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/XTbGUc6R)
# Cadastro de Alunos com Javalin

Este projeto é uma aplicação Java utilizando o framework **Javalin**, implementando o padrão **MVC (Model-View-Controller)** para gerenciar o cadastro de alunos, suas grades e a persistência de dados em arquivo.

---

## 📂 Estrutura do Projeto

### **Model**
- **Aluno**: atributos `name`, `birthday`, `cpf`, `email` e um objeto `grades`.
- **grades**: atributos `nota1`, `nota2`, `nota3`, `nota4`.

### **Controller**
- Controladores responsáveis por:
  - Cadastro de alunos.
  - Listagem.
  - Edição.
  - Exclusão.
- Controle de exceções para validação de:
  - CPF inválido.
  - grades fora do intervalo `0-10`.
  - Email mal formatado.

### **View**
- Interface web simples criada com **Javalin**.
- Telas principais:
  1. **Cadastro de alunos** (com opção de adicionar 4 grades).
  2. **Lista de alunos** (com dados salvos e média final).
  3. **Edição/remoção de alunos**.

---

## ⚙️ Funcionalidades

- Cadastrar alunos com **name, birthday, CPF e email**.
- Adicionar e editar grades (4 por aluno).
- Listar alunos com **média final** calculada:
- (nota1 + nota2 + nota3 + nota4) / 4
- Salvar dados no arquivo `alunos.txt`.
- Editar informações e grades de alunos.
- Excluir alunos da lista.
- Tratamento de exceções:
- Entradas inválidas.
- Erros de leitura/escrita em arquivo.

---
