# Boas Práticas de Programação

Este projeto foi feito como atividade para aplicar algumas boas práticas básicas de programação em Java.

O código original da atividade está no arquivo **MainTudoEmUm**, onde todo o sistema estava em uma única classe. Nesse arquivo estavam misturados:

- menu do sistema
- lógica da biblioteca
- controle de livros
- regras de empréstimo
- entrada de dados

Isso deixava o código menos organizado e mais difícil de manter.

## Estrutura reorganizada

A partir do código original, o sistema foi reorganizado em três classes:

- **main** → responsável pela interação com o usuário (menu e entrada de dados)
- **biblioteca** → responsável por gerenciar os livros e as regras do sistema
- **livro** → representa um livro da biblioteca

Essa separação melhora a organização do código e segue conceitos básicos de programação orientada a objetos.

## Funcionalidades

O sistema permite:

- adicionar livros
- emprestar livros
- listar livros cadastrados

Cada livro possui:
- título
- status de empréstimo (disponível ou emprestado)

## Melhorias aplicadas

Em relação ao código original (MainTudoEmUm), foram feitas algumas melhorias:

- separação do sistema em múltiplas classes
- criação da classe **livro**
- controle de empréstimo por livro
- organização da lógica na classe **biblioteca**
- padronização dos títulos digitados usando `toLowerCase()`
- inclusão de alguns livros iniciais para facilitar testes:
  - it
  - you
  - 1984

## Estrutura do projeto
