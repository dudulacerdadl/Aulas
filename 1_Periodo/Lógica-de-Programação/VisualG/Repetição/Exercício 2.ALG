Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Se��o de Declara��es das vari�veis
   num, indice, contador: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Digite um n�mero: ")
   leia (num)

   para indice <- 1 ate num faca
      se (num % indice = 0) entao
         contador <- contador + 1
      fimse
   fimpara

   se (contador = 2) entao
      escreval (num, " � primo")
   senao
      escreval (num, " N�o � primo")
   fimse

Fimalgoritmo