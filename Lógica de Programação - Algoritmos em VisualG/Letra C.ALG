Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2020
Var
   // Seção de Declarações das variáveis
   salario1, reajuste1, perc1, salario2 : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Valor do salário: ")
   leia (salario1)
   escreva ("Percentual do reajuste: ")
   leia (reajuste1)

   perc1 <- salario1 * reajuste1 / 100
   salario2 <- salario1 + perc1

   escreva ("O salário atual é de:" , salario2)

Fimalgoritmo