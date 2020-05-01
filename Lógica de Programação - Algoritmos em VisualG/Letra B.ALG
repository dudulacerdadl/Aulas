Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2020
Var
   // Seção de Declarações das variáveis
   votantes1 , brancos1 , nulos1, eleitores1 : inteiro
   vv, vb, vn : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Número de eleitores: ")
   leia (eleitores1)
   escreva ("Número de votos válidos: ")
   leia (votantes1)
   escreva ("Número de votos em branco: ")
   leia (brancos1)
   escreva ("Número de votos nulos: ")
   leia (nulos1)

   vv <- (votantes1 * 100) / eleitores1
   vn <- (nulos1 * 100) / eleitores1
   vb <- (brancos1 * 100) / eleitores1

   escreval ("Votos válidos: ", vv , "%")
   escreval ("Votos nulos: ", vn , "%")
   escreval ("Votos brancos: ", vb , "%")

Fimalgoritmo