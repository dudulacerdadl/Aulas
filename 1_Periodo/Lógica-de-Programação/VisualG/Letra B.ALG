Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2020
Var
   // Se��o de Declara��es das vari�veis
   votantes1 , brancos1 , nulos1, eleitores1 : inteiro
   vv, vb, vn : real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("N�mero de eleitores: ")
   leia (eleitores1)
   escreva ("N�mero de votos v�lidos: ")
   leia (votantes1)
   escreva ("N�mero de votos em branco: ")
   leia (brancos1)
   escreva ("N�mero de votos nulos: ")
   leia (nulos1)

   vv <- (votantes1 * 100) / eleitores1
   vn <- (nulos1 * 100) / eleitores1
   vb <- (brancos1 * 100) / eleitores1

   escreval ("Votos v�lidos: ", vv , "%")
   escreval ("Votos nulos: ", vn , "%")
   escreval ("Votos brancos: ", vb , "%")

Fimalgoritmo