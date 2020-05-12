Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Seção de Declarações das variáveis
   salario1: inteiro
   resultado, desconto1, bonus1: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe o valor do salário: ")
   leia (salario1)
   desconto1 <- salario1 * 0.07
   bonus1 <- salario1 * 0.05
   resultado <- salario1 - desconto1 - bonus1
   escreva ("O salário final é: " , resultado)

Fimalgoritmo