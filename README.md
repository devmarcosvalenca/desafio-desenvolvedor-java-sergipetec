# 🏖️ API de Gestão de Férias

Este projeto é uma API REST desenvolvida em **Spring Boot** para gerenciamento de períodos de férias de servidores públicos, incluindo informações de status e pagamento.

O projeto atende ao desafio técnico proposto e está totalmente **containerizado com Docker**, utilizando **H2 em memória** como banco de dados.

---

##  Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* H2 Database (em memória)
* Maven
* Docker
* Docker Compose

---

##  Estrutura do Projeto

```
ferias/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── br/com/exemplo/ferias
        └── resources/
            ├── application.properties
            └── data.sql
```

---

##  Configuração do Banco (H2)

O banco utilizado é o **H2 em memória**, inicializado automaticamente na subida da aplicação.

* As tabelas são criadas via JPA (`ddl-auto=create`)
* Os dados iniciais são carregados automaticamente pelo arquivo `data.sql`

> ⚠️ Como o H2 é em memória, **os dados são resetados toda vez que a aplicação reinicia**.

---

##  Como executar o projeto com Docker

### ✅ Pré-requisitos

* Docker Desktop instalado e em execução
* Maven (ou IDE com suporte a Maven)

---

### Subir a aplicação com Docker Compose

Na raiz do projeto executar:

```bash
docker compose up --build
```

A API ficará disponível em:

```
http://localhost:8080
```

---

###  Parar a aplicação

Para parar os containers:

```bash
docker compose down
```

---

##  Endpoints Principais

### 🔹 Listar servidores

```http
GET /servidores
```

---

### 🔹 Listar férias de um servidor (resumido)

```http
GET /servidores/{id}/ferias
```

Retorna apenas os dados essenciais das férias:

```json
[
  {
    "dataInicio": "2026-01-05",
    "dataFim": "2026-01-19",
    "diasTotal": 15,
    "descricao": "Aprovado"
  }
]
```

---

### 🔹 Detalhar férias (com pagamento e status)

```http
GET /ferias/{id}
```

Retorna todas as informações do período de férias, incluindo servidor, status e pagamento.

---

##  Sobre o Docker

* O container utiliza a imagem `eclipse-temurin:21-jdk`
* O banco H2 roda **dentro do mesmo container da aplicação**
* Não há necessidade de container de banco externo

---

##  Observações Importantes

* O H2 Console **não é exposto no Docker**, pois o acesso aos dados deve ser feito via API
* O arquivo `data.sql` é executado automaticamente na inicialização
* Ideal para testes, demonstração e avaliação técnica

---

## 👨‍💻 Autor

Projeto desenvolvido como parte de um **desafio técnico backend**, com foco em organização, clareza de código e boas práticas.

---

✅ Projeto finalizado e pronto para avaliação.
