Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Se��o de Declara��es das vari�veis
   salario1: inteiro
   resultado, desconto1, bonus1: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Informe o valor do sal�rio: ")
   leia (salario1)
   desconto1 <- salario1 * 0.07
   bonus1 <- salario1 * 0.05
   resultado <- salario1 - desconto1 - bonus1
   escreva ("O sal�rio final �: " , resultado)

Fimalgoritmo