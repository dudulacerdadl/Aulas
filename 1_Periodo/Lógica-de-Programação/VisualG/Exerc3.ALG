Algoritmo "troca_var"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/03/2020
Var
   // Se��o de Declara��es das vari�veis
   valor1, valor2, intermed: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("D� o valor de A: ")
   leia(valor1)
   intermed <- valor1
   valor2 <- 20 * 1
   valor1 <- valor2
   valor2 <- intermed
   escreval("O valor de A �: " , valor1)
   escreva("O valor de B �: " , valor2)

Fimalgoritmo