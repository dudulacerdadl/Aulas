Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/03/2020
Var
   // Se��o de Declara��es das vari�veis
   x, y, z: real
   tri: caracter

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Escreva o valor de x: ")
   leia(x)
   escreva("Escreva o valor de y: ")
   leia(y)
   escreva("Escreva o valor de z: ")
   leia(z)

   se (x < y + z) e (y < x + z) e (z <x + y) entao
      se(x = y) e (y = z) e (x = z) entao
         escreva("Os valores formam um tri�ngulo equil�tero")
      senao
         se(x = y) e (x = z) e (y = z) entao
            escreva("Os valores formam um triangulo isoceles")
         senao
            escreva("Os valores formam um triangulo escaleno")
         fimse
      fimse
   senao
      escreva ("Os valores n�o formam um tri�ngulo")
   fimse

Fimalgoritmo