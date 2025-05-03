
[![Github Actions Status for osmarbraz/cadastrocliente_desktop5](https://github.com/osmarbraz/cadastrocliente_desktop5/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/cadastrocliente_desktop5/actions)  
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_cadastrocliente_desktop5&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_cadastrocliente_desktop5)  
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_cadastrocliente_desktop5&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_cadastrocliente_desktop5&metric=coverage)

# Sistema de Cadastro de Clientes (Desktop) com Padrão Abstract Factory

## Visão Geral

Este é um projeto de sistema de cadastro de clientes desenvolvido para desktop, utilizando arquitetura em 3 camadas e o padrão de projeto **Abstract Factory** para permitir múltiplas formas de persistência.

### Características:

- Desenvolvido no **NetBeans**, com o nome de projeto `cadastrocliente_desktop`.
- Automação da construção feita com **Apache Maven**.
- CRUD completo para os dados do cliente (`clienteId`, `Nome`, `CPF`).
- Organização em pacotes: `visão`, `controle`, `modelo`, `dao`, e `util`.
- Três formas de persistência disponíveis:
  - Banco de Dados (SQLite)
  - HashMap
  - Arquivo Binário
- A persistência inicial padrão é em memória (HashMap), configurável pelo arquivo `src/dao/Factory.java`.
- Acesso a dados abstraído por **DAO (Data Access Object)**.
- Configurações do banco de dados estão em `src/dao/SQLiteDadosBanco.java`.

## Ambientes

O projeto está preparado para operar nos seguintes ambientes:

- **dev** - Desenvolvimento  
- **hmg** - Homologação  
- **prd** - Produção  

## Pipeline de Integração Contínua (CI)

- **dev**: Compilação e testes automatizados em Ubuntu com JDK 16, 17 e 18.  
- **hmg**: Análise estática e verificação da cobertura de testes (via SonarCloud + JaCoCo).  
- **prd**: Empacotamento do projeto para produção.

## Testes

- Os testes automatizados estão na pasta `src/test`, utilizando **JUnit 5**.
- A execução dos testes é feita com o comando:

  ```bash
  mvn test
  ```

- Após a execução, os **relatórios de testes e cobertura de código** são gerados automaticamente na pasta `target/site/`.
- A cobertura de código atingiu **92%**, com base no relatório do **JaCoCo**, e os dados são enviados ao **SonarCloud**.
- Casos de teste foram elaborados para cobrir os principais fluxos e validações do sistema.
