Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/04/2020
Var
   // Seção de Declarações das variáveis
   x, y, vezes, contador: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o valor de X: ")
   leia (x)

   y <- 1
   vezes <- 1

   enquanto (vezes < 11) faca
      contador <- x + vezes
      vezes <- vezes + 1
      y <- contador * y
   fimenquanto

   escreva ("O valor de Y é de ", y)

Fimalgoritmo