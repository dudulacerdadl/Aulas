Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/03/2020
Var
   // Se��o de Declara��es das vari�veis
   numero1, numero2, numero3, trab2, media1, media2, trab1: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Qual a nota da primeria prova? ")
   leia (numero1)
   escreva ("Qual a nota da segunda prova? ")
   leia (numero2)
   escreva ("Qual a nota da terceira prova? ")
   leia (numero3)
   escreva ("Qual a nota do primero trabalho? ")
   leia (trab2)
   escreva ("Qual a nota do segundo trabalho? ")
   leia (trab1)

   media1<- (numero1 + trab1) / 2
   media2<- (((numero1 + numero2 + numero3) / 3) * 0.8) + (((trab1 + trab2) / 2) * 0.2)

   escreval ("A m�dia aritim�tica �: ", media1)
   escreva ("A m�dia ponderada �: ", media2)

Fimalgoritmo