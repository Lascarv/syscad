# SysCad - Sistema de Cadastro de Funcionários

Um simples sistema de cadastro de funcionários desenvolvido em Java, seguindo conceitos básicos de orientação a objetos e separação de camadas (View, Controller, Service, Entity). O objetivo é gerenciar funcionários através de um menu interativo no terminal.

## Funcionalidades

- Cadastrar funcionário (ID, nome, salário)
- Listar todos os funcionários
- Atualizar salário de um funcionário
- Remover funcionário
- Verificar existência de funcionário por ID

## Tecnologias utilizadas

- Java 8 ou superior
- Apenas bibliotecas padrão do Java (sem frameworks externos)

## Estrutura do projeto
src/
├── app/
│ └── Program.java # Classe principal (ponto de entrada
├── ui/
│ └── View.java # Interface com o usuário (console)
├── controller/
│ └── MenuController.java # Controlador que recebe as requisições da View
├── services/
│ └── EmployeeService.java # Lógica de negócio e manipulação dos dados
└── entities/
└── Employee.java # Entidade Funcionário

## Pré-requisitos para executar:

- Java Development Kit (JDK) **versão 8 ou superior** instalado.

Para verificar se o Java está instalado e qual versão você tem, abra o terminal e execute:

```
java --version
javac --version
```
*Se os comandos não forem reconhecidos, instale o JDK (Java 8 ou superior):*

- https://www.oracle.com/java/technologies/downloads/

## Como executar:

- 
