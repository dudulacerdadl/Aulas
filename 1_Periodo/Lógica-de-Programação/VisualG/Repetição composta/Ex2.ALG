Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2020
Var
   // Se��o de Declara��es das vari�veis
   num, vezes, res: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Digite o n�mero da tabuada desejada: ")
   leia (num)

   enquanto (num <> 0) faca

      enquanto (vezes < 10) faca
         para vezes <- 1 ate 10 passo 1 faca
            res <- num*vezes
            escreval (num, " x ", vezes, " = ", res)
         fimpara
      fimenquanto
      vezes <- 0
      escreval ("")
      escreva ("Digite mais um n�mero: ")
      leia (num)

   fimenquanto

Fimalgoritmo