Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2020
Var
   // Seção de Declarações das variáveis
   num, vezes, res: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o número da tabuada desejada: ")
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
      escreva ("Digite mais um número: ")
      leia (num)

   fimenquanto

Fimalgoritmo