Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/04/2020
Var
   // Se��o de Declara��es das vari�veis
   num1, num2, num3, vezes, soma, maior, maior2: inteiro
   media: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   vezes <- 0
   soma <- 0
   maior2 <- 0

   repita
      maior <- 0
      escreva ("Digite o primeiro n�mero: ")
      leia (num1)
      se (num1 > maior) entao
         maior <- num1
      fimse
      escreva ("Digite o segundo n�mero: ")
      leia (num2)
      se (num3 > maior) entao
         maior <- num2
      fimse
      escreva ("Digite o terceiro n�mero: ")
      leia (num3)
      se (num3 > maior) entao
         maior <- num3
      fimse

      escreval ("O maior n�mero �: ", maior)

      se (maior > maior2) entao
         maior2 <- maior
      fimse

      vezes <- vezes + 1
      soma <- soma + maior

   ate (num1 = num2) e (num1 = num3) e (num2 = num3)

   media <- soma / vezes

   escreval ("O maior n�mero informado � foi ", maior2, ", e a m�dia dos n�meros � de ", media)

Fimalgoritmo

