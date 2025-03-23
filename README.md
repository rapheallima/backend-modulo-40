# Modulo_40 - Projeto Spring Boot com JPA e PostgreSQL

Este é um projeto desenvolvido com **Spring Boot**, **JPA**, e **PostgreSQL**. O objetivo principal é gerenciar produtos em uma aplicação simples, com a criação, armazenamento e consulta de dados.

## Tecnologias Utilizadas
- **Spring Boot**: Framework para criar a aplicação Java com configuração mínima.
- **JPA (Java Persistence API)**: Para persistência de dados no banco de dados PostgreSQL.
- **PostgreSQL**: Banco de dados utilizado para armazenar as informações.
- **Lombok**: Biblioteca utilizada para reduzir o boilerplate de código, gerando automaticamente getters, setters, construtores, etc.

## Funcionalidades
- Criação de produtos com nome e preço.
- Armazenamento de produtos no banco de dados PostgreSQL.
- Acesso aos dados via repositório JPA.

## Estrutura do Projeto
- **`src/main/java`**: Contém as classes principais da aplicação, incluindo a entidade `Produto`, o repositório `ProdutoRepository` e a classe `Modulo40Application`.
- **`src/main/resources`**: Contém a configuração do banco de dados no `application.properties`.

## Como Rodar o Projeto
1. Clone o repositório.
2. Configure o banco de dados PostgreSQL em seu computador com as credenciais corretas.
3. Execute a aplicação com o comando:
   ```bash
   ./mvnw spring-boot:run
