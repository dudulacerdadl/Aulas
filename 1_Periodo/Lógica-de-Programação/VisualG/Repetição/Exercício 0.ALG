Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Se��o de Declara��es das vari�veis
   contador, num, maior, menor, soma: inteiro
   media: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Informe um n�mero: ")
   leia (num)
   maior <- num
   menor <- num
   soma <- num
   para contador <- 1 ate 9 passo 1 faca
      escreva ("Informe outro n�mero: ")
      leia (num)
      soma <- soma + num
      se (num > maior) entao
         maior <- num
      fimse
      se (num < menor) entao
         menor <- num
      fimse
   fimpara
   media <- soma / 10
   escreval ("SOMA: ", soma)
   escreval ("M�DIA: ", media)
   escreval ("MAIOR: ", maior)
   escreval ("MENOR: ", menor)

Fimalgoritmo