Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/03/2020
Var
   // Se��o de Declara��es das vari�veis
   produto1, produto2, desconto1, valortotal: real
   nome1, nome2: caracter

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Nome do primero produto: ")
   leia (nome1)
   escreva ("Seu valor: ")
   leia (produto1)
   escreva ("Nome do primero produto: ")
   leia (nome2)
   escreva ("Seu valor: ")
   leia (produto2)

   desconto1 <- (produto1 + produto2) * (20 / 100)
   valortotal <- produto1 + produto2
   se (valortotal > 100) entao
      valortotal <- valortotal - desconto1
   fimse

   escreva ("O valor de ", nome1, " e de ", nome2, " � de R$", valortotal)

Fimalgoritmo