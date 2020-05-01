Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/04/2020
Var
   // Seção de Declarações das variáveis
   num1, num2, num3, vezes, soma, maior, maior2: inteiro
   media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   vezes <- 0
   soma <- 0
   maior2 <- 0

   repita
      maior <- 0
      escreva ("Digite o primeiro número: ")
      leia (num1)
      se (num1 > maior) entao
         maior <- num1
      fimse
      escreva ("Digite o segundo número: ")
      leia (num2)
      se (num3 > maior) entao
         maior <- num2
      fimse
      escreva ("Digite o terceiro número: ")
      leia (num3)
      se (num3 > maior) entao
         maior <- num3
      fimse

      escreval ("O maior número é: ", maior)

      se (maior > maior2) entao
         maior2 <- maior
      fimse

      vezes <- vezes + 1
      soma <- soma + maior

   ate (num1 = num2) e (num1 = num3) e (num2 = num3)

   media <- soma / vezes

   escreval ("O maior número informado é foi ", maior2, ", e a média dos números é de ", media)

Fimalgoritmo

