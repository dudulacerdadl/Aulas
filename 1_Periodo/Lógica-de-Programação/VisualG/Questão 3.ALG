Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Se��o de Declara��es das vari�veis
   valor1: inteiro
   resultado, desconto1: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Valor da compra: ")
   leia (valor1)
   desconto1 <- valor1 * 0.1
   resultado <- valor1 - desconto1
   escreva ("O total de desconto �: " , desconto1)

Fimalgoritmo