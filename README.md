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

<pre>
src/ 
├── app/ 
│ └── Program.java 
├── ui/ 
│ └── View.java 
├── controller/
│ └── MenuController.java 
├── services/
│ └── EmployeeService.java 
└── entities/
└── Employee.java 
</pre>

## Configurar ambiente:

#### 1.  Java Development Kit (JDK) **versão 8 ou superior** instalado.

- Para verificar se o Java está instalado e qual versão você tem, abra o terminal e execute:

```
java --version
javac --version
```

*Exemplo de Saída:*

<pre>
<i>
java version 11.0.20 2023-07-18 LTS
javac 11.0.20
  </i>
</pre>

*Se os comandos não forem reconhecidos, instale o JDK (Java 8 ou superior):*

- https://www.oracle.com/java/technologies/downloads/

#### 2. Clonar repositório:

```
git clone https://github.com/Lascarv/java-list-practice
```
## Como executar:

1. Entre no diretório `src` na pasta do projeto e abra o terminal (CMD, PowerShell, bash).

2. No terminal, compile os arquivos Java com o seguinte comando:
   
```
javac app/Program.java ui/View.java controller/MenuController.java services/EmployeeService.java entities/Employee.java
```

3. Digite o comando para executar o programa:

```
java app.Program
```

#### Como usar:

*Ao executar, o programa irá abrir um menu com as opções:*

<pre>
0 - Encerrar o programa
1 - Cadastrar funcionário
2 - Ver funcionários
3 - Ajustar salário
4 - Remover funcionário
</pre>

> Para interagir com o menu, basta digitar o número correspondente e seguir as instruções do programa.

## Observações

- Os dados são armazenados **apenas em memória**. Ao encerrar o programa, todos os cadastros serão perdidos.
- O ID de cada funcionário é único e não pode ser alterado após a criação.
- O salário aceita valores decimais, mas **não há validação** de valores negativos.

## Melhorias futuras

> 1. Validações e exceções  
> 2. Testes unitários
> 3. Implementação do banco de dados
> 4. Spring Boot (API REST)  
> 5. Documentação da API
