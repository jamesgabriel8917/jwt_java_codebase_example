# JWT Java Codebase Example

Este projeto é um exemplo de implementação de autenticação utilizando JSON Web Tokens (JWT) em uma aplicação Java.

## Tecnologias Utilizadas

- Java
- Maven
- Spring Boot (presumido)

## Estrutura do Projeto

O projeto segue a estrutura padrão de aplicações Java com Maven:
```
├── .mvn/
│ └── wrapper/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── jwtjavacodebaseexample/
│ │ │ ├── controllers/
│ │ │ ├── models/
│ │ │ ├── repositories/
│ │ │ ├── services/
│ │ │ └── JwtJavaCodebaseExampleApplication.java
│ │ └── resources/
│ │ └── application.properties
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Como Executar o Projeto

### Pré-requisitos

- Java instalado
- Maven instalado

### Passos para execução

1. Clone o repositório:

```bash
git clone https://github.com/jamesgabriel8917/jwt_java_codebase_example.git
cd jwt_java_codebase_example
```

2. Compile o projeto:
./mvnw clean install

3. Execute a aplicação:
./mvnw spring-boot:run

# Funcionalidades
- Autenticação de usuários utilizando JWT
- Proteção de endpoints com tokens JWT
- Geração e validação de tokens


