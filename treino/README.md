# Projeto de Gerenciamento de Alunos

Este projeto é um exemplo simples de gerenciamento de informações de alunos, desenvolvido em Java. Ele demonstra conceitos básicos de programação orientada a objetos, como encapsulamento, construtores e métodos getters e setters.

## Estrutura do Projeto

O projeto contém os seguintes arquivos principais:

- **`Aluno.java`**: Classe que representa um aluno, contendo atributos como matrícula, nome, email, etapa e curso. Inclui construtores para inicializar os objetos e métodos para acessar e modificar os atributos.
- **`App.java`**: Classe principal que contém o método `main`. É responsável por criar objetos da classe `Aluno` e exibir suas informações no console.

## Funcionalidades

1. **Classe `Aluno`**:
   - Atributos:
     - `matricula`: Número de matrícula do aluno.
     - `nome`: Nome do aluno.
     - `email`: Email do aluno.
     - `etapa`: Etapa atual do aluno no curso.
     - `curso`: Curso em que o aluno está matriculado.
   - Métodos:
     - `getMatricula()`: Retorna o número de matrícula do aluno.
     - `setMatricula(int matricula)`: Define o número de matrícula do aluno.
   - Construtores:
     - Um construtor que aceita todos os atributos como parâmetros.
     - Um construtor que aceita apenas `nome`, `email`, `etapa` e `curso`, gerando a matrícula automaticamente.

2. **Classe `App`**:
   - Cria objetos da classe `Aluno` com diferentes construtores.
   - Exibe as informações dos alunos no console.

## Como Executar

1. Certifique-se de que você tem o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile os arquivos Java:
   ```bash
   javac -d bin src/*.java
