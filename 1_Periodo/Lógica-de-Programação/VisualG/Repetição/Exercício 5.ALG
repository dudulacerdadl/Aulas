Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/04/2020
Var
   // Se��o de Declara��es das vari�veis
   vezes, elev, num, contador: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
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

   escreva ("O resultado �: ", contador)

Fimalgoritmo