# Sistema de Gestão de Colaboradores e Folha de Pagamento

Este projeto foi desenvolvido como o trabalho prático do 1º Semestre do curso de Ciência da Computação. O objetivo principal é consolidar os conceitos iniciais de lógica de programação, estruturas de dados e os pilares básicos da Programação Orientada a Objetos (POO) utilizando a linguagem Java.

## 🚀 Sobre o Projeto

O software consiste em um sistema interativo via terminal (Console) que permite gerenciar o cadastro de colaboradores de uma empresa e automatizar o cálculo de seus salários finais com base em três modalidades distintas de contratação: Padrão, Comissionado e Produção.

### 📋 Funcionalidades
1. **Cadastrar Funcionário Padrão:** Armazena Nome e Matrícula, recebendo o salário base fixo de R$ 2.000,00.
2. **Cadastrar Funcionário Comissionado:** Além dos dados básicos, calcula um acréscimo baseado no valor total de vendas e no percentual de comissão informado.
3. **Cadastrar Funcionário por Produção:** Calcula um acréscimo baseado na quantidade de peças produzidas e no valor estipulado por unidade.
4. **Gerar Folha de Pagamento:** Exibe um relatório completo de todos os colaboradores armazenados, detalhando o salário fixo, os extras (comissão ou produtividade) e o valor final a ser pago.
5. **Encerramento Seguro:** Opção para finalizar a execução do programa limpando os fluxos de memória.

---

## 🛠️ Conceitos Computacionais Aplicados

Para atender aos requisitos propostos, o sistema foi estruturado utilizando:
* **Entrada e Saída de Dados:** Manipulação do fluxo do console utilizando a classe `java.util.Scanner`.
* **Estruturas de Decisão:** Uso de `if / else` e `switch-case` para controle de fluxo do menu e segmentação dos cálculos de regras de negócio.
* **Laços de Repetição:** Utilização de `while` para manter a persistência do menu interativo e `for-each` para a varredura e leitura dos elementos armazenados.
* **Estrutura de Armazenamento Dinâmico:** Uso de `ArrayList` para alocação dos objetos em memória RAM de forma dinâmica.
* **Orientação a Objetos Básica:** Aplicação de encapsulamento (`private`), métodos acessores (`getters`), constantes (`public static final`) e sobrecarga de construtores para inicialização personalizada de objetos.

---

## 📦 Como Executar o Projeto

### Pré-requisitos
* Ter o **JDK (Java Development Kit)** instalado na máquina (versão 11 ou superior recomendada).
* **Visual Studio Code (VS Code)** com a extensão **Extension Pack for Java** ativada.

### Passo a Passo
1. Baixe ou clone os arquivos `Main.java`, `Colaborador.java` e este `README.md` para uma mesma pasta em seu computador.
2. Abra a pasta do projeto no seu VS Code.
3. Abra o arquivo `Main.java`.
4. Clique no botão **Run** (Executar) localizado logo acima do método `public static void main` ou pressione `F5`.
5. Interaja com o sistema através do terminal integrado do VS Code.

> **Nota de Usabilidade:** Ao inserir valores decimais (como o valor das peças ou percentuais), certifique-se de utilizar o separador decimal padrão configurado em seu sistema operacional (ponto `.` ou vírgula `,`).

---

## ✒️ Autor

* **Desenvolvedora:** Beatriz dos Santos de Almeida
* **Curso:** Ciência da Computação - 1º Semestre
* **Instituição:** Universidade São Judas Tadeu

