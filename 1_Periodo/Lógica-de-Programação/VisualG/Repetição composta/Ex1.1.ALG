Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2020
Var
   // Se��o de Declara��es das vari�veis
   pessoa1, pessoa2, vezes, num1, num2, num3, condicao: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   num1 <- randI (1001)
   escreva ("Voc� consegue adivinhar em qual n�mero eu estou pensando?")
   num2 <- randI (1001)
   num3 <- num2
   repita
      vezes <- vezes + 1
      se (num2 > num1) entao
         escreval ("Mais alto! Tente outra vez")
         num3 <- randI (num3 < num2, 1001)
      senao
         escreval ("Mais baixo! Tente outra vez:")
         num3 <- randI (num3 > num2, 1001)
      fimse

   ate (num1 = num2)

   escreva ("Voc� acertou com ", vezes, " tentativas!")

Fimalgoritmo