Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/04/2020
Var
   // Seção de Declarações das variáveis
   contador, num, fatorial: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite um número: ")
   leia (num)
   contador <- num
   fatorial <- 1

   se (contador = 0) entao
      escreva ("O valor de ", num, "! é 1")
   senao
      se (contador > 0) entao
         repita
            fatorial <- fatorial * contador
            contador <- contador - 1
         ate (contador <1 )
         escreva ("O valor de ", num, "! é ", fatorial)
      senao
         escreva ("O valor de ", num, "! é 0")
      fimse
   fimse

Fimalgoritmo