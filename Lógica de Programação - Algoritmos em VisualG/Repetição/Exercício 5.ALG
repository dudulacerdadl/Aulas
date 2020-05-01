Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/04/2020
Var
   // Seção de Declarações das variáveis
   vezes, elev, num, contador: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o valor A: ")
   leia (num)
   escreva ("Digite o valor B: ")
   leia (elev)

   vezes <- 0
   contador <- num

   repita
      contador <- num * contador
      vezes <- vezes + 1
   ate (vezes = elev - 1)

   escreva ("O resultado é: ", contador)

Fimalgoritmo