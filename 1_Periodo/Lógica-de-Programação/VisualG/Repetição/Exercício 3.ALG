Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/04/2020
Var
   // Se��o de Declara��es das vari�veis
   contador, num, fatorial: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Digite um n�mero: ")
   leia (num)
   contador <- num
   fatorial <- 1

   se (contador = 0) entao
      escreva ("O valor de ", num, "! � 1")
   senao
      se (contador > 0) entao
         repita
            fatorial <- fatorial * contador
            contador <- contador - 1
         ate (contador <1 )
         escreva ("O valor de ", num, "! � ", fatorial)
      senao
         escreva ("O valor de ", num, "! � 0")
      fimse
   fimse

Fimalgoritmo