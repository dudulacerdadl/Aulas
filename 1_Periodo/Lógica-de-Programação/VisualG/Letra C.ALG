Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2020
Var
   // Se��o de Declara��es das vari�veis
   salario1, reajuste1, perc1, salario2 : real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Valor do sal�rio: ")
   leia (salario1)
   escreva ("Percentual do reajuste: ")
   leia (reajuste1)

   perc1 <- salario1 * reajuste1 / 100
   salario2 <- salario1 + perc1

   escreva ("O sal�rio atual � de:" , salario2)

Fimalgoritmo