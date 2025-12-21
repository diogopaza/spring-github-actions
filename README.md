# spring-github-actions

# 🧪 Exercício Prático — CI/CD com Spring Boot e GitHub Actions

Este repositório contém um **exercício prático guiado**, dividido em **etapas**, para estudo de **CI/CD aplicado a aplicações Spring Boot**.

O foco do exercício é aprender, na prática:
- como criar testes automatizados em Spring MVC
- como configurar pipelines de CI no GitHub Actions
- como simular um fluxo real de desenvolvimento profissional

> 🎯 **Importante**  
> O objetivo não é regra de negócio, mas sim **lógica, testes e integração contínua**, como em projetos reais.

---

## 🎯 Objetivo Geral

Construir uma aplicação Spring Boot simples que:

1. Exponha um endpoint REST
2. Possua teste automatizado
3. Execute testes automaticamente ao abrir um Pull Request
4. Execute build automaticamente ao fazer push na branch `main`

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Web (MVC)
- Maven
- JUnit 5
- MockMvc
- GitHub Actions

---

## 📦 Etapa 1 — Criação do Projeto

### 🎯 Objetivo
Criar o projeto base e garantir que ele compila corretamente.

### 📌 Instruções
Criar o projeto utilizando o **Spring Initializr**, com as configurações:

- Project: Maven
- Language: Java
- Spring Boot: 3.x
- Packaging: Jar
- Java: 17
- Dependencies:
  - Spring Web

### ✅ Critério de conclusão
O comando abaixo deve executar sem erros:

```bash
mvn clean test

Este repositório contém um **exercício prático guiado**, dividido em **etapas**, para estudo de **CI/CD aplicado a aplicações Spring Boot**.

O foco do exercício é aprender, na prática:
- como criar testes automatizados em Spring MVC
- como configurar pipelines de CI no GitHub Actions
- como simular um fluxo real de desenvolvimento profissional

> 🎯 **Importante**  
> O objetivo não é regra de negócio, mas sim **lógica, testes e integração contínua**, como em projetos reais.

---

## 🎯 Objetivo Geral

Construir uma aplicação Spring Boot simples que:

1. Exponha um endpoint REST
2. Possua teste automatizado
3. Execute testes automaticamente ao abrir um Pull Request
4. Execute build automaticamente ao fazer push na branch `main`

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Web (MVC)
- Maven
- JUnit 5
- MockMvc
- GitHub Actions

---

## 📦 Etapa 1 — Criação do Projeto

### 🎯 Objetivo
Criar o projeto base e garantir que ele compila corretamente.

### 📌 Instruções
Criar o projeto utilizando o **Spring Initializr**, com as configurações:

- Project: Maven
- Language: Java
- Spring Boot: 3.x
- Packaging: Jar
- Java: 17
- Dependencies:
  - Spring Web

### ✅ Critério de conclusão
O comando abaixo deve executar sem erros:

```bash
mvn clean test
🌐 Etapa 2 — Criação do Endpoint REST
🎯 Objetivo
Criar um endpoint REST simples para testes.

📌 Requisitos
Criar o endpoint:

http
Copiar código
GET /health
📌 Resposta esperada
json
Copiar código
{
  "status": "UP"
}
📌 Regras
Não usar banco de dados

Não criar service ou repository

Toda a lógica pode ficar diretamente no controller

Simplicidade é intencional

✅ Critério de conclusão
O endpoint responde corretamente via navegador ou Postman.

🧪 Etapa 3 — Teste Automatizado com MockMvc
🎯 Objetivo
Criar um teste automatizado para o endpoint /health.

📌 Requisitos do teste
O teste deve:

Subir o contexto Spring

Realizar uma chamada HTTP no endpoint /health

Validar:

Status HTTP 200

Corpo da resposta contendo "UP"

📌 Ferramentas
JUnit 5

MockMvc

✅ Critério de conclusão
O comando abaixo executa com sucesso:

bash
Copiar código
mvn clean test
⚙️ Etapa 4 — CI: Testes em Pull Request
🎯 Objetivo
Executar os testes automaticamente em Pull Requests.

📌 Instruções
Criar uma GitHub Action no arquivo:

bash
Copiar código
.github/workflows/ci-tests.yml
📌 Requisitos da Action
Evento: pull_request para branch main

Ambiente: ubuntu-latest

Java 17

Executar:

bash
Copiar código
mvn clean test
✅ Critério de conclusão
A action executa automaticamente ao abrir ou atualizar um Pull Request

A action falha caso algum teste falhe

🏗️ Etapa 5 — CI: Build Automático na Branch Main
🎯 Objetivo
Automatizar o build do projeto na branch principal.

📌 Instruções
Criar uma GitHub Action no arquivo:

bash
Copiar código
.github/workflows/build.yml
📌 Requisitos da Action
Evento: push na branch main

Ambiente: ubuntu-latest

Java 17

Executar:

bash
Copiar código
mvn clean package
📌 Observação
Esta action não precisa rodar testes

O foco é validar que o projeto compila corretamente

✅ Critério de conclusão
A action executa automaticamente após push na main.

📁 Estrutura Esperada do Projeto
bash
Copiar código
spring-ci-exercicio
 ├── src
 │   ├── main
 │   │   └── java/com/exemplo/springciexercicio
 │   │       ├── SpringCiExercicioApplication.java
 │   │       └── controller
 │   │           └── HealthController.java
 │   └── test
 │       └── java/com/exemplo/springciexercicio
 │           └── HealthControllerTest.java
 ├── .github
 │   └── workflows
 │       ├── ci-tests.yml
 │       └── build.yml
 ├── pom.xml
 └── README.md
🧠 Conceitos Trabalhados
Testes automatizados em Spring MVC

Uso de MockMvc para testar controllers

Integração Contínua (CI)

Eventos do GitHub (pull_request, push)

Separação de pipeline de testes e build

Boas práticas usadas em projetos Spring Boot

📊 Avaliação Final
Critério	Pontos
Projeto base funcional	2
Endpoint implementado corretamente	2
Teste automatizado funcional	3
CI de testes em PR	2
CI de build na main	1
Total	10

## 📊 Avaliação Final do Exercício

### 🔹 Parte 1 — Projeto base funcional (2 pontos)

**Explicação do aluno:**  
_Descreva como o projeto foi criado (Spring Initializr, Java 17, dependências utilizadas, estrutura inicial do projeto, etc)._
  Projeto criado com Spring Initializr usando as tecnologias pedidas. Grandes problemas com o Maven pois no prompt de comando do Windows eu tenho o Java 8 e baixei a ultima versao do Maven. Com isso nao consegui executar o comando mvn clean test, a solucao foi suar a interface grafica do Intellij onde o Maven usou o Java 17 configurado apra o projeto. Para finalizar o comando mvn clean test rodou sem erros conforme o definido para a Etapa 1. 

**Nota do aluno:** `2/2`

**Análise do avaliador:**  
O projeto base foi criado corretamente utilizando o Spring Initializr, com Java 17 e estrutura padrão do Spring Boot. Apesar dos problemas iniciais relacionados ao Maven e à diferença de versões do Java (Java 8 no sistema e Java 17 no projeto), o aluno demonstrou boa capacidade de diagnóstico e resolução de problemas de ambiente. A execução do comando `mvn clean test` ocorreu com sucesso utilizando o Maven configurado pelo IntelliJ, validando que o projeto compila e que o contexto Spring sobe corretamente. A etapa atende completamente aos requisitos propostos.

---

### 🔹 Parte 2 — Endpoint implementado corretamente (2 pontos)

**Explicação do aluno:**  
_Explique qual endpoint foi criado, qual o caminho, método HTTP e o retorno esperado._

**Nota do aluno:** `__/2`

**Análise do avaliador:**  
_(Avalia se o endpoint está correto, simples, funcional e seguindo boas práticas do Spring.)_

---

### 🔹 Parte 3 — Teste automatizado funcional (3 pontos)

**Explicação do aluno:**  
_Explique o tipo de teste utilizado (MockMvc, SpringBootTest, etc), o que ele valida e por que foi escolhido._

**Nota do aluno:** `__/3`

**Análise do avaliador:**  
_(Avalia se o teste realmente valida o comportamento esperado e se está bem estruturado.)_

---

### 🔹 Parte 4 — CI de testes em Pull Request (2 pontos)

**Explicação do aluno:**  
_Explique quando a GitHub Action roda, em qual evento e quais comandos são executados._

**Nota do aluno:** `__/2`

**Análise do avaliador:**  
_(Avalia se o CI é acionado corretamente no PR e se executa os testes.)_

---

### 🔹 Parte 5 — CI de build na branch `main` (1 ponto)

**Explicação do aluno:**  
_Explique quando essa action roda e qual o objetivo dela (build, validação, empacotamento, etc)._

**Nota do aluno:** `__/1`

**Análise do avaliador:**  
_(Avalia se a action atende ao objetivo proposto e segue boas práticas.)_

---

### 🏁 Nota Final

**Total máximo:** `10 pontos`

**Nota final do aluno:** `__/10`

**Nota final do avaliador:** `__/10`

**Feedback geral do avaliador:**  
_(Comentários finais sobre o projeto, organização, testes e CI/CD.)_



    
