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
Criacao de um controller (HealthController) e um model (HealthModel) para retornar o json pedido. O controller implementa o endpoint /health retornando o json. A classe HealthModel e imutavel pois usamos final no atributo desse modo o valor e definido na instanciacao e nao pode ser alterado, tambem usamos princnipios SOLID onde o S e de responsabilidade unica e o model simplesmente define um Health, sem mais features. O retorno foi um json nesse formamto == {"status":"UP"}.

**Nota do aluno:** `2/2`

**Análise do avaliador:**  
O endpoint foi implementado de forma correta e funcional, utilizando `@RestController` e `@GetMapping` para expor o caminho `/health`. O retorno do JSON ocorre de maneira automática por meio da serialização do objeto `HealthModel`, demonstrando entendimento do funcionamento do Spring MVC. A decisão de tornar o modelo imutável, utilizando atributo `final` e inicialização via construtor, é adequada para um endpoint de leitura e reforça boas práticas de design. A separação entre controller e model segue o princípio de responsabilidade única (SRP), atendendo plenamente aos requisitos da etapa.
---

### 🔹 Parte 3 — Teste automatizado funcional (3 pontos)

**Explicação do aluno:**  
Foi utilizada a classe  ExercicioSpringGithubActionsApplicationTest pois essa ja foi criada pelo Spring MVC e ja realiza o teste de contexto tambem pedido na tarefa 3, atraves do metodo contextLoads().
Foi criado o teste testaEndpointHealth, usando MockMvc este que simula requisicoes http porem ser subir um servidor,
tambem verificamos que o nosso teste e um teste de integracao da camada WEB da aplicacao.
Com o comando mvn clean install obtivemos como saida o sucesso dos dois testes conforme
definido na Etapa 3.
 

**Nota do aluno:** `2,5 / 3`

**Análise do avaliador:**  
O teste automatizado valida corretamente o comportamento esperado do endpoint `/health`, utilizando o MockMvc para simular requisições HTTP sem a necessidade de subir um servidor real. A verificação do status HTTP (`200 OK`) e do conteúdo do JSON retornado (`{"status":"UP"}`) garante que o endpoint está funcional e responde conforme o contrato definido.

A execução via `mvn clean test` resultou em sucesso, demonstrando que o projeto está corretamente configurado para execução de testes em ambiente de CI. Além disso, o teste `contextLoads()` valida a inicialização do contexto Spring, garantindo que a aplicação sobe sem erros.

Como ponto de melhoria, o teste do endpoint foi implementado dentro de uma classe anotada com `@SpringBootTest`, o que caracteriza um teste de integração mais pesado. Para maior eficiência e aderência às boas práticas de CI/CD, seria recomendado utilizar `@WebMvcTest` em uma classe de teste específica para o controller, isolando a camada Web e reduzindo o tempo de execução dos testes.

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



    
