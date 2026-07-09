# Sistema de Monitoramento Operacional e HSE - AOE (Bacia de Santos)

Este projeto é uma aplicação full-stack desenvolvida para centralizar o controle de pessoal, segurança, manutenção e produção diária das plataformas petrolíferas ativas na Bacia de Santos. 

O ecossistema integra interfaces em React com uma API REST robusta construída em Spring Boot e persistência de dados em banco relacional MySQL.

---

## 🚀 Funcionalidades do Sistema

O sistema é dividido em 4 grandes módulos integrados em um Dashboard unificado:

1. **Página 3: Registro de Incidentes Operacionais (HSE)**
   * Permite relatar anomalias, acidentes e vazamentos em tempo real, gerando relatórios imediatos com grau de criticidade e ações de contenção adotadas.
2. **Página 4: Solicitação de Manutenção de Ativos**
   * Abertura automatizada de ordens de serviço corretivas e preditivas para tags/códigos de equipamentos críticos.
3. **Página 5: Monitoramento de Produção Diária**
   * Gráficos e indicadores de volume de extração diária de barris de petróleo e metros cúbicos de gás por plataforma, com validação de metas.
4. **Página 6: Escala de Embarque e Tripulação**
   * Controle de pessoal em regime de confinamento (14x14) com monitoramento de datas de início e fim de regime.

---

## 🛠️ Tecnologias Utilizadas

### Front-end
* **React** (com Vite)
* **Axios** (Integração com API)
* **CSS3** (Estilização baseada em Grid e Flexbox)

### Back-end
* **Java 17** / **Spring Boot 3**
* **Spring Data JPA** (Camada de persistência)
* **Validation** (Validação de DTOs e payloads)
* **MySQL** (Banco de dados relacional)

---

## ⚙️ Como Executar a Aplicação

### Pré-requisitos
* Java 17+ instalado
* Node.js instalado
* Instância do MySQL rodando

### 1. Configurar e rodar o Back-end (Spring Boot)
1. Abra o projeto na pasta do back-end (`projeto-aoe`).
2. Certifique-se de configurar o arquivo `src/main/resources/application.properties` com suas credenciais do MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha