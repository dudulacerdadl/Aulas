Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Se��o de Declara��es das vari�veis
   contador, limite, soma: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Valor m�ximo: ")
   leia (limite)
   para contador <- 1 ate limite passo 1 faca
      se (contador < limite) e (contador %2 = 0) entao

         soma <- soma + contador

      fimse
   fimpara
   escreva ("A soma dos n�meros pares � de: ", soma)

Fimalgoritmo