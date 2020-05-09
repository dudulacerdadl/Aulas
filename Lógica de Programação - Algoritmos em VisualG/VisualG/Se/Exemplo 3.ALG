Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/03/2020
Var
   // Seção de Declarações das variáveis
   x, y, z: real
   tri: caracter

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Escreva o valor de x: ")
   leia(x)
   escreva("Escreva o valor de y: ")
   leia(y)
   escreva("Escreva o valor de z: ")
   leia(z)

   se (x < y + z) e (y < x + z) e (z <x + y) entao
      se(x = y) e (y = z) e (x = z) entao
         escreva("Os valores formam um triângulo equilátero")
      senao
         se(x = y) e (x = z) e (y = z) entao
            escreva("Os valores formam um triangulo isoceles")
         senao
            escreva("Os valores formam um triangulo escaleno")
         fimse
      fimse
   senao
      escreva ("Os valores não formam um triângulo")
   fimse

Fimalgoritmo